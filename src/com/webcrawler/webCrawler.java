package com.webcrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class webCrawler {
    Queue<String> queue;
    Set<String> set;

    public webCrawler(){
        queue=new LinkedList<>();
        set = new HashSet<>();
    }
    public String readUrl(String s){
        String htmlText="";
        URL url;
        try {
            url = new URL(s);
            BufferedReader br= new BufferedReader(new InputStreamReader(url.openStream()));

            while(br.readLine()!=null) {

               htmlText+=br.readLine();

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return htmlText;

    }

    public void findConnectedSites(String root){

        this.queue.add(root);
        set.add(root);

        while(!queue.isEmpty()){
            String removed= queue.remove();

            String htmlText = readUrl(removed);

            //grabbing urls in the form of http(s)://test-website.com
            String regex= "http(s)?:\\/\\/www.\\w*.com";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(htmlText);

            while(m.find()){

                String found = m.group();
                if(!set.contains(found)){
                    set.add(found);
                    System.out.println("New URL Found :"+found);
                    queue.add(found);

                }

            }
        }

    }

}
