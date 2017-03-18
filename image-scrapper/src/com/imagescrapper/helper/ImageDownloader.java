/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagescrapper.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;

/**
 *
 * @author User
 */
public class ImageDownloader {
    int count =1;//=====variables that controlls the name of the file 
    
    public void downloadImage(Matcher matchedContent,String folderName) throws MalformedURLException, IOException
    {
        while (matchedContent.find()) {

                byte[] data = new byte[1024];
                String imagesPath = "http://cybersansar.com/" + matchedContent.group(3);
                URL urll = new URL(imagesPath);
                URLConnection conn = urll.openConnection();
                InputStream is = conn.getInputStream();
                OutputStream os = new FileOutputStream(folderName +"\\"+ count + ".jpg");
                int ii = 0;
                while ((ii = is.read(data)) != -1) {
                    os.write(data);

                }
                is.close();
                os.close();
                count++;//========== controlling the image file name======================================= ==============
                System.out.println("matched contentis: "+matchedContent.group());


            }
        
    }
    
}
