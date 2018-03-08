package com.glider.storage;

import com.glider.model.Journey;

import java.util.ArrayList;

public class JourneyStorage {

    ArrayList<Journey> journeys = null;
    static JourneyStorage journeyStorage = null;

    public static JourneyStorage getInstance(){

        if(journeyStorage == null)
        {
            journeyStorage = new JourneyStorage();
            journeyStorage.journeys = new ArrayList<Journey>();
        }
        return journeyStorage;
    }

    public ArrayList<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(ArrayList<Journey> journeys) {
        journeyStorage.journeys = journeys;
    }
}
