/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagescrapper.helper;

import java.io.File;

/**
 *
 * @author User
 */
public class CreateFolder {
    public static Boolean createFolder(String folderName)
    {
        File file = new File(folderName);
            if (!file.isDirectory()) {
                file.mkdir();
                return true;
            }
            return false;
            
           
    }
    
}
