package com.example.stephenue.coolweather.gson;

/**
 * Created by stephenue on 2017/12/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
