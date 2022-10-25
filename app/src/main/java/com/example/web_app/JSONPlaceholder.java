package com.example.web_app;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {
    @GET("search.php?s=Margarita")
    Call<JSONResponse> getJson();
}
