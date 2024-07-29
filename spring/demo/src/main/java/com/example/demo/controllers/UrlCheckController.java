package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UrlCheckController {
    private final String SITE_IS_UP="SITE IS UP";
    private final String SITE_IS_DOWN="SITE IS DOWN";
    private final String INCORRECT_URL="url is incorrect";

    @GetMapping("/check")
    public String getMethodName(@RequestParam String url) {
        String returnmessage="";
        try {
            URL urlObj=new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responsecode=conn.getResponseCode()/100;
            if(responsecode !=2||responsecode!=3){
                // returnmessage=SITE_IS_DOWN;
            }else{
                returnmessage=SITE_IS_UP;
            }
        } catch (MalformedURLException e) {
            
            returnmessage=INCORRECT_URL;
        } catch (IOException e) {
            
            returnmessage=SITE_IS_DOWN;
        }
        return returnmessage;
    }
}
