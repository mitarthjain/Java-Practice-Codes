
public class Solution {
    static int partition(int[] a,int si,int ei){
        int p=a[ei];
        int i=si-1;
        
        for(int j=si;j<ei;j++){
            if(a[j]<p){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
        }
        int tp=a[i+1];
        a[i+1]=a[ei];
        a[ei]=tp;
        
        return i+1;     
        
    }
    static void quick_sort(int[] a,int si,int ei){
        if(si<ei){
            int c=partition(a,si,ei);
            quick_sort(a,si,c-1);
            quick_sort(a,c+1,ei);
            
        }
    }
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        int n=input.length;
        quick_sort(input,0,n-1);
        
		
	}
	
}
