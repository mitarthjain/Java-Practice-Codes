import java.util.*;
import java.lang.*;
import java.io.*;
class gfg 
{ 
    static int min(int x,int y,int z) 
    { 
        if (x <= y && x <= z) return x; 
        if (y <= x && y <= z) return y; 
        else return z; 
    } 
  
    static int eDist(String str1, String str2, int m, int n) 
    { 
         
        int dp[][] = new int[m+1][n+1]; 
       
        for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 

                if (i==0) 
                    dp[i][j] = j;
                else if (j==0) 
                    dp[i][j] = i;
                else if (str1.charAt(i-1) == str2.charAt(j-1)) 
                    dp[i][j] = dp[i-1][j-1]; 
                else
                    dp[i][j] = 1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);  
            } 
        } 
   
        return dp[m][n]; 
    } 

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int m=sc.nextInt();
	         int n=sc.nextInt();
	         sc.nextLine();
	         String str1=sc.next();
	         String str2=sc.next();
	         System.out.println(eDist(str1,str2,m,n));
	         t--;
	     }
	 }
}
