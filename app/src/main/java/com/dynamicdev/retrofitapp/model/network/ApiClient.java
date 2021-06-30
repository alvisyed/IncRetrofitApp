package com.dynamicdev.retrofitapp.model.network;

import com.dynamicdev.retrofitapp.model.JokesResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.dynamicdev.retrofitapp.util.Constants.BASE_URL;

public class ApiClient {
    private ApiService apiService = createRetrofit().create(ApiService.class);
    private Retrofit createRetrofit(){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }
    public Call<JokesResult>getSearchResults(String query){
        return apiService.searchJokes(query);

    }
}
