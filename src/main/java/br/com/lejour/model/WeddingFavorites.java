package br.com.lejour.model;

public class WeddingFavorites {

    private int weddingId;
    private int vendorId;


    //Constructors
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
}
