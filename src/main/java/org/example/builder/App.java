package org.example.builder;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebSiteBuilder());
        Website website = director.buildWebSite();

        System.out.println(website);
    }
}
