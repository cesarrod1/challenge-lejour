package br.com.lejour.input;

public class Invoice {

    private int id;
    private int weddingId;
    private int vendorId;
    private int amount;
    private int vendorAmount;
    private boolean accepted;

    // Constructors
    public Invoice(int id, int weddingId, int vendorId, int amount, int vendorAmount, boolean accepted) {
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

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
