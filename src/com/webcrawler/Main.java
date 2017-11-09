package com.webcrawler;

public class Main {
    public static void main(String[] args) {
        webCrawler crawler= new webCrawler();
        //example website
        crawler.findConnectedSites("https://www.nbc.com");

    }
}
