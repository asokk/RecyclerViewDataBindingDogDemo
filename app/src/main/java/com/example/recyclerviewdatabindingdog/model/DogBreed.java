package com.example.recyclerviewdatabindingdog.model;

import androidx.databinding.BaseObservable;

import com.example.recyclerviewdatabindingdog.net.Api;

import retrofit2.Callback;

public class DogBreed extends BaseObservable {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void fetchImages(Callback<DogBreedImages> callback) {
        Api.getApi().getImagesByBreed(this.breed).enqueue(callback);
    }
}
