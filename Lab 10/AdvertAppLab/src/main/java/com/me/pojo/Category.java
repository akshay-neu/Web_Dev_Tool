package com.me.pojo;

import java.util.HashSet;
import java.util.Set;

public class Category {

    private long id;
    private String title;
    private Set adverts = new HashSet();

    public Category() {
    }
    
    public Category(String title) {
        this.title = title;
        this.adverts = new HashSet();
    }

    public Set getAdverts() {
        return adverts;
    }

    void setAdverts(Set adverts) {
        this.adverts = adverts;
    }

    public void addAdvert(Advert advert) {
        getAdverts().add(advert);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }
}