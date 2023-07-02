package com.example.itineraryfinder.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class ItemsDomain implements Serializable {

    private String title;
    private String placeName;
    private ArrayList<ItineraryDomain> itineraryArrayList;
    private String countryName;
    //private int price;
    private String pic;
    private String summary;

    public void setItineraryArrayList(ArrayList<ItineraryDomain> itineraryArrayList) {
        this.itineraryArrayList = itineraryArrayList;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ItemsDomain(String title, String placeName, ArrayList<ItineraryDomain>itinerary, String countryName, String pic, String summary) {
        this.title = title;
        this.placeName = placeName;
        this.itineraryArrayList = itinerary;
        this.countryName = countryName;
       // this.price = Integer.parseInt(price);
        this.pic = pic;
        this.summary = summary;
    }

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

    public void setDescription(ArrayList<ItineraryDomain> itinerary) {
        this.itineraryArrayList = itinerary;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

   // public int getPrice() {
     //   return price;
  //  }

  //  public void setPrice(int price) {
      //  this.price = price;
   // }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
