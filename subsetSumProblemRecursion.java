import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    static boolean subsetSum(int a[],int n,int s,int i){
        if(0==s)
        return true;
        if(i>=n || s<0)
        return false;
        return subsetSum(a,n,s-a[i],i+1) || subsetSum(a,n,s,i+1) ;
        
    }
    public static void main (String[] args)throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int p= Integer.parseInt(bf.readLine());
        for(int t=0;t<p;t++) {
            int n=Integer.parseInt(bf.readLine());
            int[] a=new int[n];
            int s=0;
            String st[]=bf.readLine().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st[i]);
                s+=a[i];
                
            }if(subsetSum(a,n,s/2,0) && s%2==0)
            System.out.println("YES");
            else
            System.out.println("NO");
            
        }
        
    }
    
}
