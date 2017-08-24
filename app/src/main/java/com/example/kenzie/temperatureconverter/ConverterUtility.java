package com.example.kenzie.temperatureconverter;

/**
 * Created by Kenzie on 8/24/2017.
 */

public class ConverterUtility {
    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}