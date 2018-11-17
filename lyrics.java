import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.io.*;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class lyrics {

	static String names[]=new String[5];
	static String yor[]=new String[5];
	static String mlinks[]=new String[5];
	static int ch ;
	public static void imagelink(String sg , String a)throws IOException
	{
		String artist=a.replace(" ","-");
		String song=sg.replace(" ","-");
		String url1="https://www.musixmatch.com/lyrics/"+artist+"/"+song;
		  URL url = new URL(url1);
		Image image = null;
        // Get the input stream through URL Connection
		try{
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
		 BufferedReader br = new BufferedReader(new InputStreamReader(is));
		 		String s ="";
        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
			s+=line;
        }
		
		//System.out.println(s);
		int s1=s.indexOf("<div class=\"banner-album-image-desktop\"><img src=");
		int end=s.indexOf("</div>",s1);
		String link=s.substring(s1,end);
		link=link.replace("<div class=\"banner-album-image-desktop\"><img src=\"//","");
		link=link.replace("\"/>","");
		//System.out.println(link);
		 URL l = new URL("http://"+link);
InputStream in = new BufferedInputStream(l.openStream());
OutputStream out = new BufferedOutputStream(new FileOutputStream("LyricArt/"+song+".jpg"));

for ( int i; (i = in.read()) != -1; ) {
    out.write(i);
}
in.close();
out.close();

System.out.println("Album Art Work saved!Check the LyricArt folder :)");
		}
		catch(Exception e)
		{
			
			System.out.println("Could not find the album art work :/"+e);
		}
        // Once you have the Input Stream, it's just plain old Java IO stuff.

        // For this case, since you are interested in getting plain-text web page
        // I'll use a reader and output the text content to System.out.

        // For binary content, it's better to directly read the bytes from stream and write
        // to the target file.


       

		
	}

    public static void main(String args[]) throws IOException {

	Scanner ab=new Scanner(System.in);
	System.out.println("Enter the name of the song!");
	String n=ab.nextLine();
	System.out.println("Enter the name of the artist!");
	String an=ab.nextLine();
	imagelink(n,an);
try{
	n=n.replace(" ","");
	an=an.replace(" ","");
	String url1="https://www.azlyrics.com/lyrics/"+an+"/"+n+".html";
        // Make a URL to the web page
        URL url = new URL(url1);

        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        // Once you have the Input Stream, it's just plain old Java IO stuff.

        // For this case, since you are interested in getting plain-text web page
        // I'll use a reader and output the text content to System.out.

        // For binary content, it's better to directly read the bytes from stream and write
        // to the target file.


        BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s ="";
        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
			s+=line;
        }
		//System.out.println("The results are as follows !" + "\n"+s);
		int ringtone=s.indexOf("ringtone");
		int end=s.indexOf("MxM",ringtone+1);
		//System.out.println(ringtone);
		//System.out.println(end);
		String uflr=s.substring(ringtone+49,end);
		uflr=uflr.replace("<br>","\n");
		uflr=uflr.replace("<i>","");
		uflr=uflr.replace("</i>","");
		uflr=uflr.replace("</b>","");
		uflr=uflr.replace("</div>","");
	    uflr=uflr.replace("<div>","");
		uflr=uflr.replace("<!--","");
		uflr=uflr.replace("<span class=\"feat\">","");
		uflr=uflr.replace("</span>","");
		uflr=uflr.replace("<!-- Usage of azlyrics.com content by any third-party lyrics provider is prohibited by our licensing agreement. Sorry about that. -->","");
		uflr=uflr.replace(" Usage of azlyrics.com content by any third-party lyrics provider is prohibited by our licensing agreement. Sorry about that. -->","");
		uflr=uflr.replace("(from &quot;","");
		uflr=uflr.replace("&quot; soundtrack)","");

		String lyrics=uflr;


		//System.out.println(lyrics);
try (PrintWriter out = new PrintWriter("LyricArt/"+n+".txt")) {
	String[] lines = lyrics.split("\r\n|\r|\n");
for (String linex : lines) {
    //System.out.println(linex);
	out.println(linex);
}
    System.out.println("Lyrics saved in a txt file! Check the LyricArt folder :)");

}
	}
	catch(Exception e)
	{
		System.out.println("Unable to fetch lyrics :/");
	}
	

	}
	}
