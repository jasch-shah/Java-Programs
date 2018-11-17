import java.io.*;
import java.net.*;
import java.util.*;

public class DirectorRating{

	static String name[] = new String[5];
	static String mlinks[] = new String[5];
	static int ch;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter director name whose biblography you would like to see");
		String n = sc.nextLine();

		n = n.replace(" ","+");
				//make url to web page
		URL url = new URL("https://www.imdb.com/find?ref_=nv_sr_fn&q="+n);
		//Get input stream through URL Connection
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();

		//Once you have the input stream ,it's just plain Old java thing

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s ="";
		String line=null;

		//read each line and write to System.out
		while((line = br.readLine()) != null){
			//System.out.println(line);
			s+=line;
		}
		//System.out.println("The code is : \n "+s);
		String dir=n;
		int index=s.indexOf("td class=\"result_text\"");
		int lindex=s.indexOf("</a>",index);
		String tag = s.substring(index,lindex);
		System.out.println("Director Profile Found!!");
		int bindex=tag.indexOf("<a href=");
		int eindex=tag.lastIndexOf(">");
		String link=tag.substring(bindex+9,eindex-2);
		String urls="https://www.imdb.com"+link;
		//System.out.println("https://www.imdb.com"+link);
		getmoviedet(urls);
	}

	public static void getmoviedet(String x)throws IOException
	{
		String y = x;
		URL url1 = new URL(y);
		//Get the input stream 
		URLConnection con1 = url1.openConnection();
		InputStream is1 = con1.getInputStream();

		//Once you have the Input Stream it's Normal java IO thing
		BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
		String s = "";
		String line = null;

		//read each line and write to System.out
		while((line = br1.readLine()) != null){
			//System.out.println(line);
			s+=line;
		}
		String director=s.substring(s.indexOf("<a name=\"director\""));
		String directorStr=director.substring(0,director.indexOf("</div>"));
		String nom=directorStr.substring(directorStr.indexOf("(")+1,directorStr.indexOf("credits)"));
		System.out.println(nom);
		int xx=Integer.parseInt(nom.trim());
		//System.out.println(s.substring(s.indexOf("Director</a>")));
		String movies[]=new String[xx];
		String mlink[]=new String[xx];
		String rating[]=new String[xx];
		String raw[]=new String[xx];
		String search="director-tt";
		int v=0;
		int p=0;
		String q="";
		int v1=0;
		while(v1<xx)
		{
			p=s.indexOf(search,v);
			//System.out.println(p);
			q=s.substring(p);
			q=q.substring(0,q.indexOf("</div>"));
			v=p+q.length();
			System.out.println("Fetching the movies....");
			raw[v1]=q;
			v1++;
		}
		int counter = 0;
		while(counter<xx)
		{
			try{
				String temp=raw[counter];
				int drind= ("dr_"+(counter+1)+"\">").length();
				String mon = temp.substring(temp.indexOf("dr_"+(counter+1)+"\">"),temp.indexOf("</a>"));
				mon=mon.substring(drind);
				//System.out.println((counter + 1)+"\">");
				String urllink=temp.substring(temp.indexOf("<a href="));
				urllink=urllink.substring(0,urllink.indexOf(">"));
				urllink=urllink.substring(10, urllink.length()-1);

				//System.out.println(mon+"\t"+urllink);
				movies[counter]=mon;
				mlink[counter]="https://www.imdb.com/"+urllink;

				counter++;
			}catch(Exception e)
			{

			}

		}
		int counter2=0;
		while(counter2<xx)
		{
			try{
				String link=mlink[counter2];
				URL url = new URL(link);
				//Get the input stream through URL Connection
				URLConnection con = url.openConnection();
				InputStream is = con.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String ss="";
				String lines = null;

				//read each line and write to System.out

				while((lines=br.readLine()) != null) {
					//System.out.println(line);
					ss+=lines;
				}

				//System.out.print("Movie Name:"+names[ch-1]);
				//System.out.print("  ("+yor[ch-1]+")");

				System.out.println();
				//System.out.print("Summary :"+movies[counter2]);
				int a=s.indexOf("summary_text");
				if(a!=-1)
				{
					String rank = ss.substring(a+57,ss.indexOf("div",a)-14);
					//System.out.println(rank);

				}
				//System.out.println();
				//System.out.println("Initail release date: ");
				int y1 = ss.indexOf("see more release dates");
				if(y1!=-1)
				{
					String rank = ss.substring(y1+25,ss.indexOf("<meta",y1));
					//System.out.print(rank);

				}
				//System.out.println();
				//System.out.println("Current Rating : ");
				int y2 = ss.indexOf("ratingValue");
				if(y2!=-1)
				{
					String rank = ss.substring(y2+28,(ss.indexOf("<span",y2))-2);
					//System.out.print(rank);
					String rr = rank.charAt(0)+""+rank.charAt(1)+""+rank.charAt(2);
					System.out.println(movies[counter2]+" : "+rank.charAt(0)+""+rank.charAt(1)+""+rank.charAt(2));
					if(rr=="")
						rating[counter2]="0";
					else if (rr==null) 
						rating[counter2]="0";
					else
						rating[counter2]=rr;
					
				}
			}catch (Exception e) {
				//System.out.println("Exception for this movie !"+e);
				rating[counter2]="0";
			}
			counter2++;
		}
		double sum=0.0;
		int nomm=0;
		for(int fc=0;fc<xx;fc++)
		{
			if(rating[fc]!=null)
			{
				if(rating[fc].equals("0") || rating[fc].equals(""))
					nomm+=1;
				if(rating[fc]==null)
					nomm+=1;
				else if(rating[fc]!=null)
					sum+=Double.parseDouble(rating[fc]);
			}
			else
				nomm+=1;
		}
		double rating_final=sum/(xx-nomm);
		System.out.println("Final mean/average IMDB rating is : " +rating_final+"\n Number of entries included :"+(xx-nomm));
		double sumf=0.0;
		int nommm=0;
		for(int fc=0;fc<xx;fc++)
		{
			if((fc-nomm)==5)
			{
				//System.out.println(sumf);
				break;
			}
			if(rating[fc]!=null)
			{
				if(rating[fc].equals("0") || rating[fc].equals(""))
					nommm+=1;
				else if(rating[fc]!=null)
					sumf+=Double.parseDouble(rating[fc]);
			}
			else
				nommm+=1;
		}
		double rating_finalf=sumf/5;
		System.out.println("Final mean / average IMDB rating for last 5 films  is "+rating_finalf);

	}
}