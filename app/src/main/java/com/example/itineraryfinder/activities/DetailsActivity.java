package com.example.itineraryfinder.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.itineraryfinder.Adapter.ItineraryAdapter;
import com.example.itineraryfinder.Domain.ItemsDomain;
import com.example.itineraryfinder.Domain.ItineraryDomain;
import com.example.itineraryfinder.R;

import java.io.Serializable;
import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private RecyclerView.Adapter itineraryAdapter;
    private RecyclerView itineraryView;


    private TextView titleTxt, locationText, summaryText;
    private ImageView pic;
    private ItemsDomain item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        initView();
        setVariable();


    }



    private void setVariable() {
        item= (ItemsDomain) getIntent().getSerializableExtra("object");
        titleTxt.setText(item.getTitle());
        locationText.setText(item.getPlaceName());
        summaryText.setText(item.getSummary());
        itineraryAdapter=new ItineraryAdapter(item.getItineraryArrayList());
        itineraryView.setAdapter(itineraryAdapter);
        int drawableResourceId= getResources().getIdentifier(item.getPic(), "drawable",getPackageName());
        Glide.with(this).load(drawableResourceId).into(pic);


    }

    private void initView() {
        titleTxt= findViewById(R.id.titleTxt);
        locationText= findViewById(R.id.locationText);
        summaryText= findViewById(R.id.summaryText);
        pic= findViewById(R.id.pic);
        itineraryView=findViewById(R.id.itinerary);
        itineraryView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));







    }
}