class GfG
{
    private void swap(int[] a, int x, int y){
        if(a[x] != a[y]){
            a[x] ^= a[y];
            a[y] ^= a[x];
            a[x] ^= a[y];
        }
    }
    void buildHeap(int arr[], int n)
    {
        for (int i = (n-2)/2; i >=0; i--) 
            heapify(arr, n, i); 
  
   
         
    }
    void heapify(int arr[], int n, int i)
    {
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        
        if(l<n && arr[l] > arr[max])
            max=l;
        
        if(r<n && arr[r]>arr[max])
            max=r;
            
        
        if(max!=i){
            
            swap(arr,i,max);
            heapify(arr,n,max);
        }
        
    }
 }
 
 
