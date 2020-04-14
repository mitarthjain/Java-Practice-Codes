class Solution {
    public int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
		    return 0;
	    }
        Stack<Integer> st=new Stack<Integer>();
        int max=0;
        int i=0;
        
        while(i<height.length){
            if(st.isEmpty() || height[i]>=height[st.peek()]){
                st.push(i);
                i++;
            }
            else{
                int p=st.pop();
                int h=height[p];
                int w=0;
                if(st.isEmpty()){
                    w=i;
                }
                else{
                    w=i-st.peek()-1;
                }
                max=Math.max(h*w,max);
            }
            
            
        }
        while(!st.isEmpty()){
             int p=st.pop();
                int h=height[p];
                int w=0;
                if(st.isEmpty()){
                    w=i;
                }
                else{
                    w=i-st.peek()-1;
                }
                max=Math.max(h*w,max);
        }
        
        return max;
        
    }
}
