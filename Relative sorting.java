import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int[] relativeSortArray(int[] arr1, int[] arr2) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> others = new ArrayList<>();
        int[] ret = new int[arr1.length];
        for(int num:arr2) {
            map.put(num,0);
        }
        for(int num:arr1) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                count++;
                map.put(num,count);
            }else {
                others.add(num);
            }
        }
        int n = 0;
        for(int num:arr2) {
            int count = map.get(num);
            for (int i = 0; i <count ; i++) {
                ret[n] = num;
                n++;
            }
        }
        Collections.sort(others);
        for(int num:others) {
            ret[n] = num;
            n++;
        }
        return ret;
    
    }
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         int n=sc.nextInt();
	         int m=sc.nextInt();
	         int[] a=new int[n];
	         for(int i=0;i<n;i++){
	             a[i]=sc.nextInt();
	         }
	         int[] b=new int[m];
	         for(int j=0;j<m;j++){
	             b[j]=sc.nextInt();
	         }
	         int[] result=relativeSortArray(a,b);
	         for(int i=0;i<result.length;i++){
	             System.out.print(result[i]+" ");
	         }
	         System.out.println();
	         t--;
	     }
	 }
}
