import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int minJump(int[] a, int n){
        if(n<=1){
            return 0;
        }
        if(a[0]==0){
            return -1;
        }
        int maxReach=a[0];
        int st=a[0];
        int jump=1;
        for(int i=1;i<n;i++){
            if(i==n-1)
                return jump;
            maxReach = Math.max(maxReach, i+a[i]);
                
                st--;
                if(st==0){
                    jump++;
                    if(i>=maxReach)
                        return -1;
                    st=maxReach-i;
                    
                }
                
            }
            
        
        return -1;
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
	         System.out.println(minJump(ar,n));
	         t--;
	         
	     }
	 }
}
