package com.example.itineraryfinder.Domain;

import java.io.Serializable;

public class ItineraryDomain implements Serializable {
    private String content;
    private String daySummary;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDaySummary() {
        return daySummary;
    }

    public void setDaySummary(String daySummary) {
        this.daySummary = daySummary;
    }

    public ItineraryDomain(String daySummary, String content) {
        this.daySummary = daySummary;
        this.content = content;
    }
}
