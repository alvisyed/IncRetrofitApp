
package com.dynamicdev.retrofitapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class JokeResult {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("setup")
    @Expose
    private String setup;
    @SerializedName("delivery")
    @Expose
    private String delivery;

    @SerializedName("safe")
    @Expose
    private Boolean safe;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lang")
    @Expose
    private String lang;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }



    public Boolean getSafe() {
        return safe;
    }

    public void setSafe(Boolean safe) {
        this.safe = safe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
