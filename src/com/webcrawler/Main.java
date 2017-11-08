package com.webcrawler;

public class Main {
    public static void main(String[] args) {
            webCrawler crawler= new webCrawler();
        System.out.println(( crawler.readUrl("https://facebook.com")));
    }
}
