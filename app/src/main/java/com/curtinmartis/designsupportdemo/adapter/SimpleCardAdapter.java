package com.curtinmartis.designsupportdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.curtinmartis.designsupportdemo.R;
import com.curtinmartis.designsupportdemo.adapter.SimpleCardAdapter.SimpleViewHolder;

public class SimpleCardAdapter extends RecyclerView.Adapter<SimpleViewHolder> {


    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_simple, parent, false);
        return new SimpleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.setText("Card #" + (position + 1));
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public SimpleViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.card_text);
        }

        public void setText(String text) {
            textView.setText(text);
        }

    }

}
