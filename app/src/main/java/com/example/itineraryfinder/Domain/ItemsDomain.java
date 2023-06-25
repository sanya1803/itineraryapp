package com.example.itineraryfinder.Domain;

import java.io.Serializable;

public class ItemsDomain implements Serializable {

    private String title;
    private String placeName;
    private String itinerary;
    private String countryName;
    //private int price;
    private String pic;

    public ItemsDomain(String title, String placeName, String itinerary, String countryName, String pic) {
        this.title = title;
        this.placeName = placeName;
        this.itinerary = itinerary;
        this.countryName = countryName;
       // this.price = Integer.parseInt(price);
        this.pic = pic;
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

    public String getItinerary() {
        return itinerary;
    }

    public void setDescription(String itinerary) {
        this.itinerary = itinerary;
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
