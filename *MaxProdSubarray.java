******************leetcode solution*****************
class Solution {
    public int maxProduct(int[] nums) {
        int min_so_far=nums[0];
        int max_so_far=nums[0];
        int curr_max=nums[0];
        int curr_min=nums[0];
        int result=nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>0){
                curr_max = Math.max(nums[i],nums[i] * max_so_far);
                curr_min = Math.min(nums[i] , nums[i] * min_so_far); 
            }
            else{                
                curr_max = Math.max(nums[i],nums[i] * min_so_far);
                curr_min = Math.min(nums[i] , nums[i] * max_so_far);
            }
            max_so_far = curr_max;
            min_so_far = curr_min;
            result = Math.max(result,max_so_far);
            
            
            
        }
        return result;
        
    
        
    }
}


***************************************************************************************
import java.lang.*;
import java.io.*;
class GFG{	
    	public static void main(String[] args) throws Exception{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(stdin.readLine());
		while(t>0) {
			int n = Integer.parseInt(stdin.readLine());
			String [] line = stdin.readLine().split(" ");
			int [] arr = new int[n];
			for(int i =0;i<n;i++) {
				arr[i]= Integer.parseInt(line[i]);
			}
			
			long max_product=0,positive_product=0, negative_product=0;
			for(int i=0;i<n;i++) {
				if(arr[i]>0) {
					if(positive_product==0)positive_product++;
					if(negative_product==0)negative_product++;
					positive_product*=arr[i];
					negative_product=Math.min(negative_product*arr[i], 0);
				}else if(arr[i]==0) {
					positive_product=0;
					negative_product=0;
				}else {
					if(positive_product==0)positive_product++;
					if(negative_product==0)negative_product++;
					long pp = positive_product;
					positive_product=Math.max(negative_product*arr[i],0);
					negative_product = pp*arr[i];
					
				}
				if(positive_product>max_product) {
					max_product=positive_product;
				}
				
			}
			if(arr.length==1 && arr[0]<0) {
				 max_product=arr[0];
			}
			System.out.println(max_product);
			t--;
		}

	}

}
