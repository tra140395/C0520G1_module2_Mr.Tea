package b19stringandreget.BaiTap;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlInformation {
    public static void crawl(){
        try {
            URL url = new URL( "http://dantri.com.vn/the-gioi.htm");
            Scanner scn = new Scanner(new InputStreamReader(url.openStream()));
            scn.useDelimiter("\\Z");
            String content = scn.next();
            scn.close();
            content = content.replaceAll("\\n+", "");

            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       crawl();
    }
}
//<h2><a title=(.)+\">(.*?)</a></h2>
