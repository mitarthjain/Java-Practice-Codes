/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		while(t>0){
		    int n=sc.nextInt();
		    String st="";
		    Stack<String> a=new Stack<String>();
		    for(int i=0;i<n;i++){
		        String s=sc.next();
		        if(!a.isEmpty())
		        st=a.peek();
		        if(s.equals(st))
		        a.pop();
		        else
		        a.add(s);
		    }
		    System.out.println(a.size());
		    t--;
		    
		}
		
	}
}
