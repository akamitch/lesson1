package com.example.l1;

import com.google.gson.Gson;

public class StartApplication {

    public static void main(String[] args) {
        Gson gson = new Gson();
        GSonConverter converter = new GSonConverter(gson);

        User user = new User("Test");
        System.out.println(converter.convertToJSon(user));

    }
}
