package br.com.lejour.model;

public class Appointment {

    private int id;
    private int weddingId;
    private int vendorId;
    private String status;
    private String vendorCategory;

    // Constructors
    public Appointment(int id, int weddingId, int vendorId, String status, String vendorCategory) {
        this.id = id;
        this.weddingId = weddingId;
        this.vendorId = vendorId;
        this.status = status;
        this.vendorCategory = vendorCategory;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVendorCategory() {
        return vendorCategory;
    }

    public void setVendorCategory(String vendorCategory) {
        this.vendorCategory = vendorCategory;
    }
}

