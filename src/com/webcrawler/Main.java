package com.webcrawler;

public class Main {
    public static void main(String[] args) {
        webCrawler crawler= new webCrawler();
        crawler.findConnectedSites("https://www.nbc.com");
        System.out.println("Finished");
    }
}
