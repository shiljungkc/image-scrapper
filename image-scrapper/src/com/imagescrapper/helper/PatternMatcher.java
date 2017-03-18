/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imagescrapper.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class PatternMatcher {
    
    public static Matcher matchPattern(String patternText,String content)
    {
        Pattern regExp = Pattern.compile(patternText);
        Matcher matchedContent = regExp.matcher(content);
        if(matchedContent!=null)
        {
            return matchedContent;
        }
         return null;
            
        
    }
    
}
