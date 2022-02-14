package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {

    private final int namesItems;

    public NamesAdapter(int namesItems) {
        this.namesItems = namesItems;
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.names_list_item;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);
        NamesViewHolder viewHolder = new NamesViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return namesItems;
    }

    class NamesViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNameView;

        public NamesViewHolder(@NonNull View itemView) {
            super(itemView);

            listItemNameView = itemView.findViewById(R.id.tv_name_item);
        }
    }
}