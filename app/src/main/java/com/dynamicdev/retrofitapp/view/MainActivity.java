package com.dynamicdev.retrofitapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.dynamicdev.retrofitapp.R;
import com.dynamicdev.retrofitapp.databinding.ActivityMainBinding;
import com.dynamicdev.retrofitapp.model.JokesResponse;
import com.dynamicdev.retrofitapp.model.network.ApiClient;
import com.dynamicdev.retrofitapp.view.adapter.JokesAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private JokesAdapter adapter = new JokesAdapter();
    private ApiClient apiClient = new ApiClient();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.jokesRecyclerview.setAdapter(adapter);
        apiClient.getSearchResults("3")
                .enqueue(new Callback<JokesResponse>() {
                    @Override
                    public void onResponse(Call<JokesResponse> call, Response<JokesResponse> response) {
                        Log.d("TAG_X", " "+call.request().url());
                        adapter.setJokeResultList(response.body().);

                    }

                    @Override
                    public void onFailure(Call<JokesResponse> call, Throwable t) {
                        Log.d("TAG_X", " "+call.request().url());

                    }
                });
    }
}