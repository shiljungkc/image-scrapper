/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagescrapper.helper;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class UserInputReader {
    public static String[] readUserInput()
    {
        
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Please Enter the URL for the site");
//        String userURL=sc.next();
        System.out.println("Start Page: ");
        String firstPage = sc.next();
        System.out.println("End Page: ");
        String lastPage = sc.next();
        
        return new String[]{firstPage,lastPage};
    }
    
}
