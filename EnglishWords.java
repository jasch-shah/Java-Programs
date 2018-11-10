
import java.util.*;
import java.lang.*;
import java.io.*;

class EnglishWords {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=Integer.parseInt(sc.nextLine());
	for(int i=0;i<t;i++){
	    String in=sc.nextLine();
	    String delete="";
	    int index;
	   for(int j=0;j<in.length();j++){
	       if(in.charAt(j)=='A' || in.charAt(j)=='E' ||in.charAt(j)=='O' ||in.charAt(j)=='I' ||in.charAt(j)=='U'){
	          
	           if(j==0){
	               System.out.println(in);
	                break;
	           }
	           else{
	                delete+=in.substring(j,in.length());
	                  System.out.println(delete+""+in.substring(0,j)+"AY");
	                   break;
	           }
	         
	      }
	      if(j==(in.length()-1)){
	           System.out.println(in+"AY"); 
	            break;
	       }
	      
	   }
	   
	}
	}
}