import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int countWays(String s,int n){
        if(s.charAt(0)=='0')return 0;
        int input[]=new int[n+1];
        input[0]=1;input[1]=1;
        for(int i=2;i<=n;i++){
            input[i]=0;
            if(s.charAt(i-1)>'0')input[i]=input[i-1];
            if(s.charAt(i-2)=='1'||(s.charAt(i-2)=='2' && s.charAt(i-1)<'7'))
               input[i]+=input[i-2];
            
        }
        return input[n];
    }
        
        
    
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         String s=sc.next();
	         System.out.println(countWays(s,n));
	         t--;
	         
	     }
	     
	 }
}
