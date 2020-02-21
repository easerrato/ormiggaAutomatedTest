package com.ormigga.automation.activeaccount;

import cucumber.api.java.en.Given;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class ActiveAccountSteps {
    @Given("we visit the activate user <url>")
    public void weVisitTheActivateUserUrl()  {
        String hola = "1040845412";
        try {
            System.out.println(getTokenUser(hola));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getTokenUser(String id) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=" +
                "--------------------------739011228035350188600988");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("idEmpresa", id)
                .build();
        Request request = new Request.Builder()
                .url("http://localhost:8000/api/userToken")
                .method("POST", body)
                .addHeader("Content-Type", "multipart/form-data; boundary=" +
                        "--------------------------739011228035350188600988")
                .build();
        Response response = client.newCall(request).execute();
        String getJson = response.body().string();

        JSONArray array = new JSONArray(getJson);

        JSONObject tokenObject = new JSONObject();
        tokenObject = array.getJSONObject(0);
        String result = tokenObject.getString("tokenActivate");

        return result;
    }
}
