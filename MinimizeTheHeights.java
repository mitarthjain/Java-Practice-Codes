import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int maxdiff(int[] arr,int n,int k){
        Arrays.sort(arr);
        if(n==1)
         return 0;
        int a=arr[n-1]-arr[0];
        int s=arr[0]+k;
        int b=arr[n-1]-k;
        int temp=0;
        if(s>b){
            temp=s;
            s=b;
            b=temp;
            
        }
        for(int i=1;i<n-1;i++){
            int sub=arr[i]-k;
            int add=arr[i]+k;
            if (sub >= s || add <= b) 
                continue; 
 
            if (b - sub <= add - s) 
                s = sub; 
            else
                b = add; 
        } 
  
        return Math.min(a, b - s); 
    } 
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int k=sc.nextInt();
	         int n=sc.nextInt();
	         int[] ar=new int[n];
	         for(int i=0;i<n;i++){
	             ar[i]=sc.nextInt();
	         }
	         System.out.println(maxdiff(ar,n,k));
	         t--;
	     }
	 }
}
