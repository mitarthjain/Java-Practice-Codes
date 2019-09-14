import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
    static int ele(int[] a, int n) 
    {
        if(n==1){
            return a[0];
        }
        boolean[] p=new boolean[n];
        boolean[] q=new boolean[n];
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>=min){
                p[i]=true;
                min=a[i];
            }
            if(a[n-1-i]<=max){
                q[n-i-1]=true;
                max=a[n-1-i];
            }
            
        }
        for(int i=1;i<n-1;i++){
            if(p[i] && q[i])
             return a[i];
        }
        return -1;
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
	         System.out.println(ele(ar,n));
	         t--;
	     }
	 }
}
