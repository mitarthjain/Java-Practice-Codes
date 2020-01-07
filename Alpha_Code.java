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
