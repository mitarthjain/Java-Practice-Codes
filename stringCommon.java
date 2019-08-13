import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    ArrayList<Character> a=new ArrayList<Character>();
		    ArrayList<Character> b=new ArrayList<Character>();
		    String s=sc.next();
		    String st=sc.next();
		  int flag=0;
		    //String b="";
		    for(int i=0;i<s.length();i++){
		        char c=s.charAt(i);
		        if(!a.contains(c))
		        a.add(c);
		        }
               for(int i=0;i<st.length();i++){
                   char c=st.charAt(i);
                   if(a.contains(c) && !b.contains(c)){
                   b.add(c);
                   flag++;
                       
                   }
                   
               }
               
               if(flag==0)
               System.out.print("nil");
               else{
                   Collections.sort(b);
                   for(int i=0;i<b.size();i++){
                       System.out.print(b.get(i));
                       
                   }
               }
         System.out.println("");
         t--;       
		}
	}
}
/* arranging the string containing both uppercase and lower case in ascending order by ASCII values*/
