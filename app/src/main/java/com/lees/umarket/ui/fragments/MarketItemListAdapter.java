package com.lees.umarket.ui.fragments;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lees.umarket.R;
import com.lees.umarket.markets.MarketItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link MarketItem} and makes a call to the
 * TODO: Replace the implementation with code for your data type.
 */
public class MarketItemListAdapter extends RecyclerView.Adapter<MarketItemListAdapter.ViewHolder> {

    private final List<MarketItem> mValues;
    private MarketItemListFragment.OnListFragmentInteractionListener mListener;


    public MarketItemListAdapter(List<MarketItem> items, MarketItemListFragment.OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_marketitem, parent, false);
        Log.d("[ARTHUR]", "onCreateViewHolder");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Log.d("[ARTHUR]", "onBindViewHolder");
        holder.mIdView.setText(mValues.get(position).getTitle());
        holder.mContentView.setText(mValues.get(position).getDescription());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.err.println("LISTENER: " + mListener);
                mListener.onMarketItemSelected(mValues.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
