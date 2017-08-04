package com.example.moha.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Moha on 2017-05-16.
 */

public class Condition implements JSONpopulator {


    private int code;
    private int temperature;
    private String description;


    public int getCode() {
        return code;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void populate(JSONObject data) {


        code = data.optInt("code");
        temperature = data.optInt("temp");
        description = data.optString("text");


    }
}
