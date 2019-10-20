import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static boolean isHeapr(int arr[],int n){ 
         boolean isHeap=true;
        for (int i=0; i<n; i++) {

	        if (arr[(i-1)/2] < arr[i]) {
	            isHeap = false;
	            break;
	        }
	    }
 
       return isHeap;  
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
	         if (isHeapr(ar,n)) { 
            System.out.println("1"); 
        } else { 
            System.out.println("0"); 
        }
	         
	         t--;
	     }
	 }
}
