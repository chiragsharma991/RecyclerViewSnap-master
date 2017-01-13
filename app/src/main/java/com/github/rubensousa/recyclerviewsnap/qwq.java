/*
package com.github.rubensousa.recyclerviewsnap;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;

public class SnapAdapter extends RecyclerView.Adapter<SnapAdapter.ViewHolder> implements GravitySnapHelper.SnapListener {

    public static final int VERTICAL = 0;
    public static final int HORIZONTAL = 1;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_FOOTER = 1;
    private static final int TYPE_ITEM = 0;

    private ArrayList<Snap> mSnaps;
    // Disable touch detection for parent recyclerView if we use vertical nested recyclerViews
    private View.OnTouchListener mTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            v.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    };


    public SnapAdapter() {
        mSnaps = new ArrayList<>();
    }

    public void addSnap(Snap snap) {
        mSnaps.add(snap);
    }

    @Override
    public int getItemViewType(int position) {

        if (position == mSnaps.size() + 1) {
            return TYPE_FOOTER;
        }
        return TYPE_ITEM;


      */
/*  Snap snap = mSnaps.get(position);


        switch (snap.getGravity()) {
            case Gravity.CENTER_VERTICAL:
                return VERTICAL;
            case Gravity.CENTER_HORIZONTAL:
                return HORIZONTAL;
            case Gravity.START:
                return HORIZONTAL;
            case Gravity.TOP:
                return VERTICAL;
            case Gravity.END:
                return HORIZONTAL;
            case Gravity.BOTTOM:
                return VERTICAL;*//*

        //  }
        // return HORIZONTAL;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TYPE_ITEM) {
            //Inflating recycle view item layout

            View view = viewType == VERTICAL ? LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.adapter_snap_vertical, parent, false)
                    : LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.adapter_snap, parent, false);
            return new ViewHolder(view);

        }  else if (viewType == TYPE_FOOTER) {
            //Inflating footer view
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_footer, parent, false);
            return new FooterViewHolder(itemView);
        } else return null;



        //     if (viewType == VERTICAL) {
        // view.findViewById(R.id.recyclerView).setOnTouchListener(mTouchListener);
        //   }


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //  Snap snap = mSnaps.get(position);
        //  holder.snapTextView.setText(snap.getText());
        holder.snapTextView.setText("chari");

      */
/*  if (snap.getGravity() == Gravity.START || snap.getGravity() == Gravity.END) {
            holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder
                    .recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
            holder.recyclerView.setOnFlingListener(null);
            new GravitySnapHelper(snap.getGravity(), false, this).attachToRecyclerView(holder.recyclerView);
        } else if (snap.getGravity() == Gravity.CENTER_HORIZONTAL) {
            holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder
                    .recyclerView.getContext(), snap.getGravity() == Gravity.CENTER_HORIZONTAL ?
                    LinearLayoutManager.HORIZONTAL : LinearLayoutManager.VERTICAL, false));
            holder.recyclerView.setOnFlingListener(null);
            new LinearSnapHelper().attachToRecyclerView(holder.recyclerView);
        } else if (snap.getGravity() == Gravity.CENTER) { // Pager snap
            holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder
                    .recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
            holder.recyclerView.setOnFlingListener(null);
            new PagerSnapHelper().attachToRecyclerView(holder.recyclerView);
        } else { // Top / Bottom
            holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder
                    .recyclerView.getContext()));
            holder.recyclerView.setOnFlingListener(null);
            new GravitySnapHelper(snap.getGravity()).attachToRecyclerView(holder.recyclerView);
        }

        holder.recyclerView.setAdapter(new Adapter(snap.getGravity() == Gravity.START
                || snap.getGravity() == Gravity.END
                || snap.getGravity() == Gravity.CENTER_HORIZONTAL,
                snap.getGravity() == Gravity.CENTER, snap.getApps()));*//*

    }

    @Override
    public int getItemCount() {
        return mSnaps.size()+1;
    }

    @Override
    public void onSnap(int position) {
        Log.d("Snapped: ", position + "");
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView snapTextView;
        public RecyclerView recyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            snapTextView = (TextView) itemView.findViewById(R.id.snapTextView);
            // recyclerView = (RecyclerView) itemView.findViewById(R.id.recyclerView);
        }

    }

    private class FooterViewHolder extends ViewHolder {
        public FooterViewHolder(View itemView) {
            super(itemView);
            TextView footerText = (TextView) itemView.findViewById(R.id.xxx);

        }
    }
}

*/
