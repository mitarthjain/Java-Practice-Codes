import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int maxSub(int[] a,int n){
        int max=0;
        int p[]=new int[n];
        for(int i=0;i<n;i++)
        p[i]=a[i];
        
        for(int i=1;i<n;i++)
         for(int j=0;j<i;j++)
             if(a[i]>a[j]&& p[i]<p[j]+a[i])
                p[i]=p[j]+a[i];
        for(int i=0;i<n;i++)
         if(max<p[i])
           max=p[i];
          
        return max;
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
	         System.out.println(maxSub(ar,n));
	         t--;
	     }
	     
	 }
}
