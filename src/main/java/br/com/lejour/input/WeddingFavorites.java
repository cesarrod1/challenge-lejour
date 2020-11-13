package br.com.lejour.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeddingFavorites {

    @JsonProperty("wedding_id")
    private int weddingId;
    @JsonProperty("vendor_id")
    private int vendorId;
    private int qty;


    //Constructors


    public WeddingFavorites() {}

    public WeddingFavorites(int weddingId, int vendorId) {
        this.weddingId = weddingId;
        this.vendorId = vendorId;
    }

    // Getters and Setters
    public int getWeddingId() {
        return weddingId;
    }

    public void setWeddingId(int weddingId) {
        this.weddingId = weddingId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public int getQty() {
        return qty;
    }
}
