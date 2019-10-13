import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void repChar(String x){
         boolean flag=false;
		  for(int i=0;i<x.length();i++)
		  {
		      char ch=x.charAt(i);
		      if(x.substring(0,i).indexOf(ch)>-1)
		        {
		            System.out.println(ch);
		            flag=true;
		            break;
		      }
        }
		  if(flag==false)
		  System.out.println(-1);
		 }
     
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         String s=sc.next();
	         repChar(s);
	         t--;
	     }
	 }
}
