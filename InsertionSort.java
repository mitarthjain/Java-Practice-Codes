/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class GFG {
    static void INS(int[] a,int n){
        int temp=a[n-1];
        for(int i=n-2;i>=0;i--){
            if(temp>=a[i]){
                a[i+1]=temp;
                break;
            }
            a[i+1]=a[i];
        }
        if(temp<a[0]){
            a[0]=temp;
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		INS(a,n);
	}
}
