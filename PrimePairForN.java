import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static boolean checkPrime(int n,boolean[] isPrime){
        isPrime[0]=isPrime[1]=false;
        for(int i=2;i<n;i++)
            isPrime[i]=true;
        for(int p=2;p*p<=n;p++)
        {
            if(isPrime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        return false;
        
    } 
    public static void primePair(int n){
        boolean[] isPrime=new boolean[n+1];
        boolean flag=false;
        checkPrime(n,isPrime);
        for(int i=0;i<n;i++){
            if(isPrime[i] && isPrime[n-i]){
                System.out.println(i+" "+(n-i));
                flag=true;
                return;
                
            }
            
        }
        if(flag==false){
             System.out.println("-1");
           
        }
        
    }
        

	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         primePair(n);
	         t--;
	     }
	 }
}
