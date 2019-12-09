import java.util.*;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        
		//Your Code goes here
        HashMap<Integer, Boolean> m=new HashMap<Integer,Boolean>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],true);
            
        }
        int i=0, max=1, start = arr[0];
        
        while(i<arr.length){
            int len=1, start_ = arr[i];
            if(m.containsKey(start_)==true){
                int t=start_+1;
                while(m.containsKey(t)==true){
                    len++;
                    t++;
                    
                }
            }
            if(len>max){
                max=len;
                start=arr[i];
            }
            i++;
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(max-->0){
            res.add(start);
            start++;
        }
        return res;
        
	}
    
}
