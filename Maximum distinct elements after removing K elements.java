import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    static int maxN(int[] ar,int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(ar[i])){
                int v=hm.get(ar[i]);
                hm.put(ar[i],v+1);
            }
            else{
                hm.put(ar[i],1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        Set<Map.Entry<Integer,Integer>> entries=hm.entrySet();
        for(Map.Entry<Integer,Integer> entry:entries){
            int temp=entry.getValue();
            pq.add(temp);
        }
        while(k>0){
            int temp=pq.poll();
            temp--;
            if(temp>0){
                pq.add(temp);
            }
            k--;
        }
        int ans=0;
        while(pq.size()!=0){
            pq.poll();
            ans++;
            
        }
        return ans;
        
        
        
    }
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         int k=sc.nextInt();
	         int[] ar=new int[n];
	         for(int i=0;i<n;i++){
	             ar[i]=sc.nextInt();
	         }
	         System.out.println(maxN(ar,n,k));
	         t--;
	     }
	     
	     
	 }
}
