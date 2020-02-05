import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void fib(int n){
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2]);
            if(dp[i]<=n){
                if(dp[i]%2==0){
                    sum+=dp[i];
                }
            }
            else
                break;
            
        }
        System.out.println(sum);
     }
	public static void main (String[] args)
	 {
	      Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t>0){
	          int n=sc.nextInt();
	          fib(n);
	          t--;
	      }
	 }
}
