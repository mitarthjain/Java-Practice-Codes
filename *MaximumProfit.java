import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int maxProfit(int[] price,  
                         int n,  
                         int k) 
    { 
          
         
        int[][] profit = new int[k + 1][n + 1]; 
  
      
        for (int i = 0; i <= k; i++) 
            profit[i][0] = 0; 
  
       
        for (int j = 0; j <= n; j++) 
            profit[0][j] = 0;  
        for (int i = 1; i <= k; i++)  
        { 
            for (int j = 1; j < n; j++) 
            { 
                int max_so_far = 0; 
  
                for (int m = 0; m < j; m++) 
                max_so_far = Math.max(max_so_far, price[j] - 
                             price[m] + profit[i - 1][m]); 
  
                profit[i][j] = Math.max(profit[i] [j - 1],  
                                              max_so_far); 
            } 
        } 
  
        return profit[k][n - 1]; 
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
	         System.out.println(maxProfit(ar,n,k));
	         t--;
	     }
	 }
}
