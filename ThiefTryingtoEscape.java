import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int thiefJump(int[] ht,int x,int y,int n){
        int j=0;
        for(int i=0;i<n;i++){
            
            if(ht[i]<=x){
                j++;
                continue;
                
            }
            int h=ht[i];
            while(h>x){
                j++;
                h=h-(x-y);
            }
            j++;
                
        
        }
        return j;
     }
	public static void main (String[] args)
	 {    
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int x=sc.nextInt();
	         int y=sc.nextInt();
	         int n=sc.nextInt();
	         int[] ht=new int[n];
	         for(int i=0;i<n;i++){
	             ht[i]=sc.nextInt();
	         }
	         System.out.println(thiefJump(ht,x,y,n));
	         
	         t--;
	     }
	 }
}
