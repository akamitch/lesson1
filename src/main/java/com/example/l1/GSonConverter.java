package com.example.l1;

import com.google.gson.Gson;

/**
 * This class use Gson converter for ../
 */
public class GSonConverter {

    private final Gson gson;

    /**
     * Init instance
     * @param gson bla bla
     */
    public GSonConverter(Gson gson) {
        this.gson = gson;
    }

    public <T> String convertToJSon(T obj) {
        return "Hello world!!!!!!";
    }
}
