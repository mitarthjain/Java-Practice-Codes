After merging 2 sorted arrays
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static void mergeArrays(int[] arr1, int[] arr2, int n1, 
                                int n2, int[] arr3) 
    { 
        int i = 0, j = 0, k = 0; 
      
       
        while (i<n1 && j <n2) 
        { 
            
            if (arr1[i] < arr2[j]) 
                arr3[k++] = arr1[i++]; 
            else
                arr3[k++] = arr2[j++]; 
        } 
       
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        while (j < n2) 
            arr3[k++] = arr2[j++]; 
    }
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         int[] a=new int[n];
	         for(int i=0;i<n;i++){
	             a[i]=sc.nextInt();
	         }
	         int[] b=new int[n];
	         for(int i=0;i<n;i++){
	             b[i]=sc.nextInt();
	         }
	         int[] arr3=new int[2*n];
	         //int mid=n;
	         mergeArrays(a,b,n,n,arr3);
	         System.out.println(arr3[n-1]+arr3[n]);
	         t--;
	     }
	 }
}
