package com.example.moha.weatherapp.data;

import org.json.JSONObject;

/**
 * Created by Moha on 2017-05-16.
 */

public class Channel implements JSONpopulator {

    private Units units;
    private Item item;

    public Units getUnits() {
        return units;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void populate(JSONObject data) {


        units = new Units();
        units.populate(data.optJSONObject("units"));

        item = new Item();
        item.populate(data.optJSONObject("item"));


    }
}
