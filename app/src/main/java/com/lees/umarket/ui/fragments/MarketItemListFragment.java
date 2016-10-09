package com.lees.umarket.ui.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lees.umarket.R;
import com.lees.umarket.markets.House;
import com.lees.umarket.markets.MarketItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class MarketItemListFragment extends Fragment {
    OnListFragmentInteractionListener mListener;
    List<MarketItem> marketItems;

    public List<MarketItem> getMarketItems() {
        return marketItems;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public MarketItemListFragment() {
        marketItems = new ArrayList<>();
        marketItems.add(new House("title 1", "description 1"));
        marketItems.add(new House("title 2", "description 2"));
        marketItems.add(new House("title 3", "description 3"));
        marketItems.add(new House("title 4", "description 4"));
        marketItems.add(new House("title 5", "description 5"));
        marketItems.add(new House("title 6", "description 6"));
        marketItems.add(new House("title 7", "description 7"));
        marketItems.add(new House("title 8", "description 8"));
        marketItems.add(new House("title 9", "description 9"));
        marketItems.add(new House("title 10", "description 10"));
        marketItems.add(new House("title 11", "description 11"));
        marketItems.add(new House("title 12", "description 12"));
        marketItems.add(new House("title 13", "description 13"));
        marketItems.add(new House("title 14", "description 14"));
        marketItems.add(new House("title 15", "description 15"));
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static MarketItemListFragment newInstance() {
        MarketItemListFragment fragment = new MarketItemListFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("[MarketItemListFrag]", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("[MarketItemListFrag]", "onCreateView");
        return inflater.inflate(R.layout.fragment_marketitem_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d("[MarketItemListFrag]", "onViewCreated");
        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new MarketItemListAdapter(marketItems, mListener));
        }
    }

    @Override
    public void onAttach(Context context) {
        Log.d("[MarketItemListFrag]", "onAttach");
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        Log.d("[MarketItemListFrag]", "onDetach");
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        void onMarketItemSelected(MarketItem item);
    }
}
