package org.example;

import com.google.gson.Gson;
import org.example.models.Indicator;
import org.example.models.User;

public class JsonConverter {

    private final Gson gson = new Gson();

    public String userToJson (User user) {
        return gson.toJson(user);
    }

    public String indicatorToJson (Indicator indicator) {
        return gson.toJson(indicator);
    }

}
