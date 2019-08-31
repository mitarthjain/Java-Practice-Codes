import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int NthRoot(long m, int n) {
        for(int i = 1; i <= Math.sqrt(m); i++) {
            if(hasIntegerRoot(m, i, n, 0)) 
            return i;
            
        }
        return -1;
        
    }
    public static boolean hasIntegerRoot(long m, long r, int n, int count) {
        if(n == count) {
            return m == 1 ? true : false;
            
        }
        return m%r == 0 ? hasIntegerRoot(m/r, r, n, count+1) : false;
        
    }
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         long m=sc.nextLong();
	         System.out.println(NthRoot(m,n));
	         t--;
	     }
	     
	 }
}
