package org.example.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder {

    @Override
    void buildName() {
        website.setName("Enterprise Web Site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
