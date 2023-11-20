package org.example;

import org.example.models.Indicator;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        UpdateRequest request = new UpdateRequest();

        Indicator indicator = new Indicator();
        indicator.setUser_id("3cdfdf2a-f90c-49c3-82df-67b1ccecd872");
        indicator.setPulse(70);
        indicator.setSteps(7728);
        indicator.setSleep("8h 6m");
        request.updateIndicatorsRequest(indicator);

    }
}