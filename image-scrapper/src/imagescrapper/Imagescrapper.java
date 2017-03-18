/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagescrapper;

import com.imagescrapper.helper.ContentGrabber;
import com.imagescrapper.helper.CreateFolder;
import com.imagescrapper.helper.ImageDownloader;
import com.imagescrapper.helper.PatternMatcher;
import com.imagescrapper.helper.UserInputReader;
import java.io.IOException;
import java.util.regex.Matcher;

/**
 *
 * @author User
 */
public class Imagescrapper {

    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) throws IOException {

        //============taking input from users ===========================
        
        String[] userValues=UserInputReader.readUserInput();
        
         int firstPage=Integer.parseInt(userValues[0]);
         int lastPage=Integer.parseInt(userValues[1]);
        
        

        //=================Loop that crawls the pages =========================
        
        
        for (int i = firstPage; i <= lastPage; i++) {

            String urlText = "http://cybersansar.com/article_list.php?pageno=" + i;
            String patternText = "<a href=\"(.*?)\">\\n(.*?)<img src=\"(.*?)\" (.*?)/>(.*?)\\s(.*?)</a>";
            String folderName="C:\\Users\\User\\Desktop\\scrappedfiles\\page" + i;
           
            
            //=========grab the content from the url ==============
            
            String content=ContentGrabber.grabContent(urlText);
            
            //================== return matched content=======
            
            Matcher matchedContent=PatternMatcher.matchPattern(patternText, content);

            //====================Creating the folder  for storing images by pagewise=========
            
            CreateFolder.createFolder(folderName);

            //====loops that writes the image of particular page one by one  in bytes ===================
           
            ImageDownloader id=new ImageDownloader();
            id.downloadImage(matchedContent, folderName);
 
           

        }
    }

}
