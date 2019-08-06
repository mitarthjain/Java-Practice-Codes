/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String expandD(String s){
        if(s.length()==0)
		return "";
		  //if(s=="]")
		  //return "";
		if(s.length()==1)
		  return s;
		else{
		    if(Character.isDigit(s.charAt(0))){
		        int re=Integer.parseInt(String.valueOf(s.charAt(0)));
		 		int i=0;
		 		for( i=1;i<s.length();i++){
		 		    if(Character.isDigit(s.charAt(i))){
		 		        re=re*10+Integer.parseInt(String.valueOf(s.charAt(i)));
		 		    }
           		    else
		 		    break;
		 		}
		 		
		 		String ss="";
		 		String sss="";
		 		int l=s.length();
		 		int j=0;
		 		int tt=0;
		 		for( j=i;j<l;j++){
		 		    if(s.charAt(j)=='[')
		 			  tt++;
		 			if(s.charAt(j)==']'){
		 			 tt--;
		 	         if(tt==0){
		 	             break;
		 	             
		 	         }
		 			  
		 			}
		 			
		 		}
		 		String s1= expandD(s.substring(i,j));
		 		if(j+1<l)
		 		ss=expandD(s.substring(j+1,s.length()));
		 		for( j=0;j<re;j++){
		 			sss+=s1;
		 		}
		 		return sss+ss;
		 	}
		 	else if(s.charAt(0)=='['){
		 		int l=s.length();
		 		int j=0;
		 		int tt=0;
		 		for( j=1;j<l;j++){
		 			if(s.charAt(j)=='[')
		 			  tt++;
		 			if(s.charAt(j)==']'){
		 	                        if(tt==0){
		 	                           break;
		 	                          }
		 			  tt--;
		 			}
		 			
		 		}
		 		String s1= expandD(s.substring(1,j));
		 		String s2="";
		 		if(j+1<l)
		 		s2=expandD(s.substring(j+1,l));
		 		return s1+s2;
		 	}
		 	else 
		 	{
		 		return expandD(s.substring(0,1))+expandD(s.substring(1,s.length()));
		 	}
		 	    
		 }
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    String s=sc.next();
		    System.out.println(expandD(s));
		    
		}
		}
}
