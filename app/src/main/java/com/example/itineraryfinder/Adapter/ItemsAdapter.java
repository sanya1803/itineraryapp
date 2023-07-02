package com.example.itineraryfinder.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.itineraryfinder.Domain.ItemsDomain;
import com.example.itineraryfinder.R;
import com.example.itineraryfinder.activities.DetailsActivity;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder>{

    ArrayList<ItemsDomain> items;
    DecimalFormat formatter;
    Context context;
    //private Instant Glide;

    public ItemsAdapter(ArrayList<ItemsDomain> items) {
        this.items = items;
        formatter= new DecimalFormat("###,###,###,###.##");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewholder,parent,false);
        context = parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.titleTxt.setText(items.get(position).getTitle());
        holder.locationTxt.setText(items.get(position).getPlaceName());
       // holder.priceTxt.setText("Rs."+formatter.format(items.get(position).getPrice()));

        int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPic(), "drawable",holder.itemView.getContext().getPackageName());
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            //Instant with = Glide.with((TemporalAdjuster) holder.itemView.getContext());
           // Object load;
            //load(drawableResourceId);
           // into(holder.pic);



        //}
        Glide.with(holder.itemView.getContext())
                        .load(drawableResourceId).into(holder.pic);

        holder.itemView.setOnClickListener(view -> {
            Intent intent=new Intent(context, DetailsActivity.class);
            Intent putExtra = intent.putExtra("object", items.get(position));
            context.startActivity(intent);
        });
    }

    private void into(ImageView pic) {
    }

    private void load(int drawableResourceId) {
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxt, locationTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.titleTxt);
            locationTxt=itemView.findViewById(R.id.locationTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
