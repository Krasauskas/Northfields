package com.vytautaskrasauskas.northfields;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by V Krasauskas on 06-Feb-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private int[] mDataset1;
    private String[] mDataset2, mDataset3;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView mTrackNumber;
        public TextView mTrainNumber;
        public TextView mPeopleWorking;

        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTrackNumber = (TextView) v.findViewById(R.id.tv_track_number);
            mTrainNumber = (TextView) v.findViewById(R.id.tv_train_number);
            mPeopleWorking = (TextView) v.findViewById(R.id.tv_people_working);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(int[] trackNumbers, String[] trainNumbers, String[] peopleWorking) {
        mDataset1 = trackNumbers;
        mDataset2 = trainNumbers;
        mDataset3 = peopleWorking;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mTrackNumber.setText(String.valueOf(mDataset1[position]));
        holder.mTrainNumber.setText(String.valueOf(mDataset2[position]));
        holder.mPeopleWorking.setText(mDataset3[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentValue = mDataset1[position];
                Log.d("CardView", "CardView Clicked: " + currentValue);
            }
        });
    }

    @Override
    public int getItemCount() {

        return mDataset1.length;
    }

}


