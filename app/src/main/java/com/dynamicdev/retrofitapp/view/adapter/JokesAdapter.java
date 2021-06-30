package com.dynamicdev.retrofitapp.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dynamicdev.retrofitapp.databinding.JokesItemListBinding;
import com.dynamicdev.retrofitapp.model.JokeResult;
import com.dynamicdev.retrofitapp.model.JokesResponse;

import java.util.ArrayList;
import java.util.List;

public class JokesAdapter extends RecyclerView.Adapter<JokesAdapter.JokesViewHolder> {
    @NonNull
    @Override
    public JokesAdapter.JokesViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        JokesItemListBinding binding=JokesItemListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new JokesViewHolder(binding);
    }
    private List<JokesResponse> jokeResultList=new ArrayList<>();

    public void setJokeResultList(List<JokesResponse> jokeResultList) {
        this.jokeResultList = jokeResultList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull  JokesAdapter.JokesViewHolder holder, int position) {
        JokesResponse jokeResult = jokeResultList.get(position);
        holder.binding.titleTextview.setText(jokeResult.getJokes());
        holder.binding.textview.setText(jokeResult.getJokes());
    }

    @Override
    public int getItemCount() {
        return jokeResultList.size();
    }

    public class JokesViewHolder extends RecyclerView.ViewHolder{
        JokesItemListBinding binding;
        public JokesViewHolder(JokesItemListBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
