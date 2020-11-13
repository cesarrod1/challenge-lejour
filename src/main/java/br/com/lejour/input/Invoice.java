package br.com.lejour.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Invoice {

    @JsonProperty("ID")
    private int id;
    @JsonProperty("WEDDING_ID")
    private int weddingId;
    @JsonProperty("VENDOR_ID")
    private int vendorId;
    @JsonProperty("AMOUNT")
    private int amount;
    @JsonProperty("VENDOR_AMOUNT")
    private int vendorAmount;
    @JsonProperty("ACCEPTED")
    private String accepted;

    // Constructors

    public Invoice(){}

    public Invoice(int id, int weddingId, int vendorId, int amount, int vendorAmount, String accepted) {
        this.id = id;
        this.weddingId = weddingId;
        this.vendorId = vendorId;
        this.amount = amount;
        this.vendorAmount = vendorAmount;
        this.accepted = accepted;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVendorAmount() {
        return vendorAmount;
    }

    public void setVendorAmount(int vendorAmount) {
        this.vendorAmount = vendorAmount;
    }

    public String isAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }


}
