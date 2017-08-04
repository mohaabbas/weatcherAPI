package com.example.moha.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Moha on 2017-05-16.
 */

public class Units implements JSONpopulator {

    private String temperature;

    public String getTemperature() {
        return temperature;
    }

    @Override
    public void populate(JSONObject data) {

        temperature = data.optString("temperature");

    }
}
