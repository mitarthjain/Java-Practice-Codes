import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         String s1=sc.next();
	         String s2=sc.next();
	         ArrayList<Integer> ar=new ArrayList<Integer>();
	         for(int i=0;i<s1.length();i++){
	             for(int j=0;j<s2.length();j++){
	                 if(s1.charAt(i)==s2.charAt(j)){
	                     ar.add(i);
	                 }
	             }
	         }
	         Collections.sort(ar);
	         System.out.println(s1.charAt(ar.get(0)));
	         t--;
	     }
	 }
}
