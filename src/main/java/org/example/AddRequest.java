package org.example;

import okhttp3.*;
import org.example.models.User;

import java.io.IOException;

public class AddRequest {

    private final JsonConverter converter = new JsonConverter();

    public void addUserRequest (User user) {
        MediaType json = MediaType.get("application/json; charset=utf-8");
        String jsonRequest = converter.userToJson(user);
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(jsonRequest, json);
        Request.Builder builder = new Request.Builder().url("http://s3v3nny.sloth-1.suslovd.ru:9555/add").post(body);
        Request request = builder.build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                System.out.println("Неудачный запрос\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
