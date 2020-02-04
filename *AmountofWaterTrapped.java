static int amtWater(int[] ar,int m){
         int amount=0;
        int[] left=new int[m];
        int[] right=new int[m];
        
        left[0]=ar[0];
        for(int i=1;i<m;i++){
            left[i]=Math.max(left[i-1],ar[i]);
        }
        right[m-1]=ar[m-1];
        for(int i=m-2;i>=0;i--){
            right[i]=Math.max(right[i+1],ar[i]);
        }
        
        for(int i=0;i<m;i++){
            amount+=Math.min(right[i],left[i])-ar[i];
        }
        return amount;
    
     }
