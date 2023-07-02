package com.example.itineraryfinder.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ItemDomain implements Serializable {

    private String title;
    private String placeName;
    private String summary;
    private ArrayList<ItineraryDomain> itineraryArrayList;
    private String pic;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public ArrayList<ItineraryDomain> getItineraryArrayList() {
        return itineraryArrayList;
    }

    public void setItineraryArrayList(ArrayList<ItineraryDomain> itineraryArrayList) {
        this.itineraryArrayList = itineraryArrayList;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ItemDomain(String title, String placeName, String summary, ArrayList<ItineraryDomain> itineraryArrayList, String pic) {
        this.title = title;
        this.placeName = placeName;
        this.itineraryArrayList = itineraryArrayList;
        this.summary = summary;
        this.pic = pic;
    }
}
