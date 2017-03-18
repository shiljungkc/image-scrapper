/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagescrapper.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author User
 */
public class ContentGrabber {
    public static String grabContent(String urlText) throws IOException
    {
        
        URL url = new URL(urlText);
        URLConnection con = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

        StringBuilder content = new StringBuilder();

            String line = "";
            while ((line = br.readLine()) != null) {

                content.append(line).append("\n");
            }
            
            br.close();
            return content.toString();
    }
    
}
