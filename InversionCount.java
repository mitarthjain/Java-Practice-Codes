
public class solution {
    long merge(int[] A, int left,int mid,int right){
        int i=left,j=mid,k=0;
        int[] temp=new int[right-left+1];
        
        long count=0;
        while(i<mid && j<=right){
            if(A[i]<=A[j]){
                temp[k++]=A[i++];
            }
            else{
                temp[k++]=A[j++];
                count+=(mid-i);
            }
        }
        while(i<mid){
            temp[k++]=A[i++];
        }
        
        while(j<=right){
            temp[k++]=A[j++];
        }
       for(i=left,k=0;i<=right;i++,k++){
           A[i]=temp[k];
       }
        return count;
    }
	long merge_sort(int[] A,int left,int right){
        long count=0;
        
        if(right>left){
            int mid=(right+left)/2;
            long countLeft=merge_sort(A,left,mid);
            long countRight=merge_sort(A,mid+1,right);
            long mergeCount=merge(A,left,mid+1,right);
            return mergeCount + countLeft + countRight;
        }
        return count;
        
    }
	long solve(int[] A,int n){
        long res=merge_sort(A,0,n-1);
        return res;
        
		
		//Write your code here.
		
	}
	
}
