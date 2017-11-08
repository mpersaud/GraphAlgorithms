package com.webcrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Queue;
import java.util.Set;

public class webCrawler {
    Queue<String> queue;
    Set<String> set;
    public String readUrl(String s){
        String htmlText="";
        URL url = null;
        try {
            url = new URL(s);
            BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream()));
            String a;
            while(br.readLine()!=null) {

               htmlText+=br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return htmlText;

    }

    public void findConnectedSites(String root){

        this.queue.add(root);

        while(!queue.isEmpty()){

        }


    }

}
