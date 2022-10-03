package com.example.gsp_app;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Products {

    String offer, store, price;

    public Products(){}


    public Products(String offer, String store, String price) {
        this.offer = offer;
        this.store = store;
        this.price = price;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
