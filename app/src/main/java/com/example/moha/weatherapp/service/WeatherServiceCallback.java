package com.example.moha.weatherapp.service;

import com.example.moha.weatherapp.data.Channel;

/**
 * Created by Moha on 2017-05-18.
 */

public interface WeatherServiceCallback {

    void serviceSuccess(Channel channel);
    void serviceFailure(Exception exception);

}
