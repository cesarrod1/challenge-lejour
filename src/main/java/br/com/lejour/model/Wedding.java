package br.com.lejour.model;

public class Wedding {

    private int id;
    private int ownerId;
    private int budget;
    private String weddingDate;
    private int numberOfGuests;
    private String style;


    //Constructors
    public Wedding(int id, int ownerId, int budget, String weddingDate, int numberOfGuests, String style) {
        this.id = id;
        this.ownerId = ownerId;
        this.budget = budget;
        this.weddingDate = weddingDate;
        this.numberOfGuests = numberOfGuests;
        this.style = style;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(String weddingDate) {
        this.weddingDate = weddingDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
