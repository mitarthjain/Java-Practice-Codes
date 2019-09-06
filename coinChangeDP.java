import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static long countCoin(int a[],int m,int n){
        long[] V=new long[n+1];
        Arrays.fill(V,0);
        V[0]=1;
        for(int i=0; i<m; i++) 
            for (int j=a[i]; j<=n; j++) 
                V[j] += V[j-a[i]]; 
  
        return V[n];
    }
    
	public static void main (String[] args)
	 {
	     Scanner  sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int m=sc.nextInt();
	         int ar[]=new int[m];
	         for(int i=0;i<m;i++){
	             ar[i]=sc.nextInt();
	         }
	         int n=sc.nextInt();
	         System.out.println(countCoin(ar,m,n));
	         
	         t--;
	     }
	 }
}
