
package com.dynamicdev.retrofitapp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class JokesResponse {

    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("jokes")
    @Expose
    private List<JokeResult> jokes = null;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<JokeResult> getJokes() {
        return jokes;
    }

    public void setJokes(List<JokeResult> jokes) {
        this.jokes = jokes;
    }

}
