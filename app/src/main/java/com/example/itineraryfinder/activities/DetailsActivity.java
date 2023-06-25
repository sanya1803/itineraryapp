package com.example.itineraryfinder.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.itineraryfinder.R;

import java.io.Serializable;

public class DetailsActivity extends AppCompatActivity {
    private TextView titleTxt, locationText, goaDescriptionTxt, arrivalInGoaTxt, day1Text, northGoaTxt, day2Txt, southGoaTxt, day3Txt, leisureTxt, day4Txt, byeTxt, day5Txt;
    private ImageView pic;
    private Serializable item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initView();
        setVariable();

    }

    private void setVariable() {
        item=getIntent().getSerializableExtra("object");


    }

    private void initView() {
        titleTxt=findViewById(R.id.titleTxt);
        locationText=findViewById(R.id.locationText);
        goaDescriptionTxt=findViewById(R.id.goaDescriptionTxt);
        arrivalInGoaTxt=findViewById(R.id.arrivalInGoaTxt);
        day1Text=findViewById(R.id.day1Text);
        northGoaTxt=findViewById(R.id.northGoaTxt);
        day2Txt=findViewById(R.id.day2Txt);
        southGoaTxt=findViewById(R.id.southGoaTxt);
        day3Txt=findViewById(R.id.day3Txt);
        leisureTxt=findViewById(R.id.leisureTxt);
        day4Txt=findViewById(R.id.day4Txt);
        byeTxt=findViewById(R.id.byeTxt);
        day5Txt=findViewById(R.id.day5Txt);
        pic=findViewById(R.id.pic);



    }
}