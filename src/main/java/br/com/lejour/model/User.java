package br.com.lejour.model;

import java.util.Date;

public class User {

    private Long id;
    private Date createdAt;

    // Constructors


    public User(){

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
