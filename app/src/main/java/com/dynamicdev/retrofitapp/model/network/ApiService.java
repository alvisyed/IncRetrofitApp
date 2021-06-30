package com.dynamicdev.retrofitapp.model.network;

import com.dynamicdev.retrofitapp.model.JokesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.dynamicdev.retrofitapp.util.Constants.END_POINT;
import static com.dynamicdev.retrofitapp.util.Constants.SEARCH_QUERY;

public interface ApiService {
    @GET(END_POINT)
    public Call<JokesResult> searchJokes(@Query(SEARCH_QUERY) String query);
}
