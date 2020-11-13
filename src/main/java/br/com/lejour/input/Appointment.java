package br.com.lejour.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Appointment {

    @JsonProperty("ID")
    private int id;
    @JsonProperty("WEDDING_ID")
    private int weddingId;
    @JsonProperty("VENDOR_ID")
    private int vendorId;
    @JsonProperty("STATUS")
    private String status;
    @JsonProperty("VENDOR_CATEGORY")
    private String vendorCategory;

    // Constructors


    public Appointment() {
    }

    public Appointment(int id, int weddingId, int vendorId, String status, String vendorCategory) {
        this.id = id;
        this.weddingId = weddingId;
        this.vendorId = vendorId;
        this.status = status;
        this.vendorCategory = vendorCategory;


    }

    public int getId() {
        return id;
    }

    public int getWeddingId() {
        return weddingId;
    }

    public int getVendorId() {
        return vendorId;
    }

    public String getStatus() {
        return status;
    }

    public String getVendorCategory() {
        return vendorCategory;
    }
}


