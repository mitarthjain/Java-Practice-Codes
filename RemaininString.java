import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void remStr(String s,char ch,int n){
          int count=0;
          int i;
          if (n == 0) { 
			System.out.println(s); 
			return; 
              
          } 
	
          for(i=0;i<s.length();i++){
              if(s.charAt(i)==ch)
                  count++;
              
              if(count==n)
                  break;
              
          }
          
          if (i < s.length() - 1) 
           System.out.println(s.substring(i + 1)); 
           
          else
           System.out.println("Empty string");
     }
     
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         String s=sc.next();
	         char ch=sc.next().charAt(0);
	         int n=sc.nextInt();
	         remStr(s,ch,n);
	         t--;
	     }
	 }
}
