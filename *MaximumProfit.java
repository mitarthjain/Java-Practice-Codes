******** Recursive Approach *******
#include <iostream>
#include <cstring>
using namespace std;

int f(int * a, int k, int n, int isongoing, int dp[][10][2]) {
	if (n == 0) {
		return 0;
	}
	if (dp[n][k][isongoing] > -1) {
		return dp[n][k][isongoing];
	}
	int ans = f(a + 1, k , n - 1, isongoing, dp);
	
	if (isongoing) {
		int option = f(a + 1, k - 1, n - 1, 0, dp) + a[0];
		ans = max(ans, option);
	} else {
		if (k == 0) {
			ans = 0;
		} else {
			int option = f(a + 1, k, n - 1, 1, dp) - a[0];
			ans = max(ans, option);
		}
	}
	dp[n][k][isongoing] = ans;
	return ans;
}

int main() {
	int q;
	cin >> q;
	for (int i = 0; i < q; i++) {
		int k, n;
		cin >> k >> n;
		int a[31];
		for (int j = 0; j < n; j++) {
			cin >> a[j];
		}
		int dp[31][10][2];
		for (int j = 0; j < 31; j++) {
			for (int l = 0; l < 10; l++) {
				dp[j][l][0] = -1;
				dp[j][l][1] = -1;
			}
		}
		int ans = f(a, k, n, 0, dp);
		cout << ans << endl;
	}
}

*****************************Iterative Approach ***************************
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
