package com.example.itineraryfinder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.itineraryfinder.Domain.ItineraryDomain;
import com.example.itineraryfinder.R;

import java.util.ArrayList;

public class ItineraryAdapter extends RecyclerView.Adapter<ItineraryAdapter.ViewHolder> {
    ArrayList<ItineraryDomain> items;
    Context context;
    public ItineraryAdapter (ArrayList<ItineraryDomain>items){
        this.items=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.itinerary_viewholder, parent, false);
        context= parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItineraryDomain itinerary= items.get(position);
        holder.content.setText(itinerary.getContent());
        holder.day.setText("Day "+(position+1)+":");

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView day, content;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            day=itemView.findViewById(R.id.day);
            content=itemView.findViewById(R.id.content);
        }
    }

}
