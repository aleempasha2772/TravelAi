package com.example.TravelAi;

import com.example.TravelAi.Model.TravelInput;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;


@Service
public class TravelService {

    private String getRandomCityName(Random random) {
        String[] cities = {"Paris", "Tokyo", "New York", "Sydney", "London", "Berlin", "Rome", "Moscow"};
        return cities[random.nextInt(cities.length)];
    }

    public String TravelInputGenerator(TravelInput travelInput){
        Random random = new Random();
        travelInput.setCityName(getRandomCityName(random));
        travelInput.setLocalDate(LocalDate.now().plusDays(random.nextInt(365)));
        travelInput.setTotalCount(random.nextInt(10) + 1); // Random count between 1 and 10
        travelInput.setTotalDays(random.nextInt(14) + 1);

        return travelInput.toString() + "get a proper itnery planned";
    }


}
