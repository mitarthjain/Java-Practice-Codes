import java.util.*; 
import java.io.*;
import java.lang.*;
class RopeCon { 
	static int minC(int arr[], int n) 
	{ 
		
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(); 

		for (int i = 0; i < n; i++) { 
			p.add(arr[i]); 
		}
		int res = 0;
		while (p.size() > 1) { 
			int f = p.poll(); 
			int s = p.poll(); 
			res += f + s; 
			p.add(f + s); 
		} 

		return res; 
	} 
	public static void main(String args[]) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0){
	        int n=sc.nextInt();
	        int[] ar=new int[n];
	        for(int i=0;i<n;i++){
	            ar[i]=sc.nextInt();
	        }
	        System.out.println(minC(ar,n));
	        t--;
	    }
		
	} 
}
