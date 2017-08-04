package com.example.moha.weatherapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moha.weatherapp.data.Channel;
import com.example.moha.weatherapp.data.Item;
import com.example.moha.weatherapp.service.WeatherServiceCallback;
import com.example.moha.weatherapp.service.YahooWeatherService;

public class Malmo extends Activity implements WeatherServiceCallback {

    private ImageView weatherIconView;
    private TextView cityNameView;
    private TextView conditionView;
    private TextView temperatureView;

    private YahooWeatherService service;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stockholm);


        weatherIconView = (ImageView) findViewById(R.id.weatherIconView);
        cityNameView = (TextView) findViewById(R.id.cityNameView);
        conditionView = (TextView) findViewById(R.id.conditionView);
        temperatureView = (TextView) findViewById(R.id.temperatureView);


        service = new YahooWeatherService(this);

        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading...");
        dialog.show();

        service.refreshWeather("Malmo, SE");

    }




    @Override
    public void serviceSuccess(Channel channel) {

        dialog.hide();


        Item item = channel.getItem();
        int resourceID = getResources().getIdentifier("drawable/icon_"+ item.getCondition().getCode(), null, getPackageName());
        @SuppressWarnings("deprecation") Drawable weatherIcon = getResources().getDrawable(resourceID);

        weatherIconView.setImageDrawable(weatherIcon);
        cityNameView.setText(service.getLocation());
        conditionView.setText(item.getCondition().getDescription());
        temperatureView.setText(item.getCondition().getTemperature()+"\u00B0"+channel.getUnits().getTemperature());

    }

    @Override
    public void serviceFailure(Exception exception) {

        dialog.hide();
        Toast.makeText(this, exception.getMessage(), Toast.LENGTH_LONG).show();

    }
}
