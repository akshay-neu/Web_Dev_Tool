package com.me.pojo;

public class Advert {

    private long id;
    private String title;
    private String message;
    private String postedBy;
    private User user;
    private String category;

    public Advert() {
    }
    
    public Advert(String title, String message, User user) {
        this.title = title;
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String ctgry) {
        this.category = ctgry;
    }

    public String getPostedBy() {
        return this.postedBy;
    }

    public void setPostedBy(String pb) {
        this.postedBy = pb;
    }
}