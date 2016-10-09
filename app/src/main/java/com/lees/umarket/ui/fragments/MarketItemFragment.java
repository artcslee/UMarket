package com.lees.umarket.ui.fragments;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lees.umarket.R;
import com.lees.umarket.markets.MarketItem;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link MarketItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MarketItemFragment extends Fragment {
    MarketItem marketItem;

    public MarketItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MarketItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MarketItemFragment newInstance() {
        MarketItemFragment fragment = new MarketItemFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("[MarketItemFragment]", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("[MarketItemFragment]", "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market_item, container, false);
    }

    @Override
    public void onAttach(Context context) {
        Log.d("[MarketItemFragment]", "onAttach");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.d("[MarketItemFragment]", "onDetach");
        super.onDetach();
    }
}
