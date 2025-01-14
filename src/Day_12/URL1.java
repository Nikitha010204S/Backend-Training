package Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;

public class URL1 {

    public static void main(String[] args) {
        BufferedReader br = null;
        try
        {
            URL url=new URL("https://www.ebay.com");
            URLConnection connect=url.openConnection();
            br=new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String temp="";
            while((temp= br.readLine())!=null)
            {
           System.out.println(temp);
            }
            
        } catch (Exception e) {
          e.printStackTrace();
        }
        finally {
           if(br!=null)
               try
               {
                   br.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
        }
    }


}
