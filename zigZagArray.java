import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
class GFG
 {
	static void zigZ(int[] arr, int n){
	    boolean flag=true;
	    for(int i=0;i<n-1;++i)
           {
               if(flag){
                   if(arr[i]>arr[i+1]){
                       int temp=arr[i];
                       arr[i]=arr[i+1];
                       arr[i+1]=temp;
                       
                   }
                   
               }
               else{
                   if(arr[i]<arr[i+1]){
                       int temp=arr[i];
                       arr[i]=arr[i+1];
                       arr[i+1]=temp;
                       
                   }
                   
               }
               flag=!flag;
               
           }
           for(int x:arr)
            {
                System.out.print(x+" ");
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
	         zigZ(ar,n);
	         System.out.println();
	        
	         t--;
	     }
	 }
}
