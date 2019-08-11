import java.util.*;
import java.lang.*;
import java.io.*;
class GFG 
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     for(int i=0;i<t;i++){
	         String str=sc.next();
	         HashSet<Character> hash=new HashSet<Character>();
	         int max=0;
	         for(int j=0;j<str.length();j++)
	         {
	             for(int k=j;k<str.length();k++)
	             {
	                 if(hash.contains(str.charAt(k)))
	                    break;
	                 else
	                    hash.add(str.charAt(k));
	             }
	            if(hash.size()>max)
	              max=hash.size();
	              hash.clear();
	        }
	        System.out.println(max);
	     
	 }
}
}
