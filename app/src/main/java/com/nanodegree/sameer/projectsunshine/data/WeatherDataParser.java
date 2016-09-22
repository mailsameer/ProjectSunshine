package com.nanodegree.sameer.projectsunshine.data;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sameejos on 9/22/2016.
 */
public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject jRoot = new JSONObject(weatherJsonStr);
        JSONArray jArr = jRoot.getJSONArray("list");
        int count = jArr.length();

        for(int i = 0; i < count; i++) {
            JSONObject jObj = (JSONObject) jArr.get(i);
            JSONObject jTemp = jObj.getJSONObject("temp");
            Double maxTemp = (Double) jTemp.get("max");
            System.out.println("Max Temp = " + maxTemp.doubleValue());
        }
        return -1;
    }

}