import java.util.Scanner;

public class Main {

    static int alpha_code(int[] a,int size,int[] dp){
        
        if(size==0){
            return 1;
        }
        if(size==1){
            return 1;
        }
        if(dp[size]>0){
            return dp[size];
        }
        int output=0;
        if(a.length!=0){
            output=alpha_code(a,size-1,dp);
        }
        int m=a[size-2]*10+a[size-1];
        if(m>=10 && m<=26){
            output=output+alpha_code(a,size-2,dp);
        }
        dp[size]=output;
        return output;
    }
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int size=s.length();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=s.charAt(i)-'0';
        }
        int[] dp=new int[size+1];
        for(int i=0;i<=size;i++){
            dp[i]=-1;
        }
        int res=alpha_code(a,size,dp);
        System.out.println(res);
        
	}

}
*********************************************************************************************************************************

import java.util.Scanner;
 
public class Main {
 
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            String s=sc.next();
            if(s.equals("0"))
            {
                break;
            }
            int size=str.length();
            int arr[]=new int[size];
            int dp[]=new int[size+1];
            for(int i=0;i<s.length();i++)
            {
                arr[i]=s.charAt(i)-'0';
            }
            long sum=subsi(arr,len);
            System.out.println(sum);
        }
		
 
	}
    public static int subs(int arr[],int size,int dp[])
    {
        if(size==0 ||size==1)
        {
            return 1;
        }
        if(dp[size]>0)
        {
            return dp[size];
        }
        
        int output=subs(arr,size-1,dp);
        if((arr[size-2]*10+arr[size-1])<=26 && (arr[size-2]*10+arr[size-1])>=10)
        {
            output+=subs(arr,size-2,dp);
        }
        dp[size]=output;
        return output;
    }
    public static long subsi(int arr[],int size)
    {
        int dp[]=new int[size+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=size;i++)
        {
            if(arr[i-1]!=0)
            dp[i]+=dp[i-1];
            int val=arr[i-2]*10+arr[i-1];
            if(val>=10 && val<=26)
                dp[i]=(dp[i]+dp[i-2])%1000000007;
        }
        return dp[size];
    }
 
}
