package com.glider.dao;

import com.glider.model.City;
import com.glider.model.Journey;
import com.glider.storage.JourneyStorage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class JourneyCommunicator {

    public Journey checkJourney(City source, City destination)
    {
        ArrayList<Journey> journeys = JourneyStorage.getInstance().getJourneys();
        for(Journey journey:journeys)
        {
            if(journey.getSource().equals(source)&&journey.getDestination().equals(destination))
            {
                return journey;
            }
        }

        return null;
    }
}
