package org.example.builder;



public abstract class WebSiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebSite() {
        return website;
    }
}
