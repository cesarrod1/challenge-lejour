package br.com.lejour.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wedding {

    @JsonProperty("ID")
    private int id;
    @JsonProperty("OWNER_ID")
    private int ownerId;
    @JsonProperty("BUGDET")
    private int budget;
    @JsonProperty("WEDDING_DATE")
    private String weddingDate;
    @JsonProperty("NUMBER_OF_GUESTS")
    private int numberOfGuests;
    @JsonProperty("STYLE")
    private String style;


    //Constructors
    public Wedding(){}

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
