package com.example.moha.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Moha on 2017-05-16.
 */

public class Item implements JSONpopulator {

    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    @Override
    public void populate(JSONObject data) {

        condition = new Condition();
        condition.populate(data.optJSONObject("condition"));


    }
}
