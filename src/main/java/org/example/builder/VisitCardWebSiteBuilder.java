package org.example.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit cars");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
