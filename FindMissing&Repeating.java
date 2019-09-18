import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static void missR(int[] a,int n){
            int i;
            for(i=0;i<n;i++){
                int m=Math.abs(a[i]);
                if(a[m-1]>0)
                 a[m-1]=-a[m-1];
                else
                 System.out.print(m+" ");
            }
            for(i=0;i<n;i++){
                if(a[i]>0)
                 System.out.print(i+1);
            }
        
    } 
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         int[] ar=new int[n];
	         for(int i=0;i<n;i++){
	             ar[i]=sc.nextInt();
	         }
	         missR(ar,n);
	         System.out.println();
	         t--;
	     }
	 }
}
