class GfG
{
    /*You are required to complete this method */
    int countNodes(Node root){
        if(root==null)
          return 0;
        return(1+countNodes(root.left)+countNodes(root.right));
        
    }
    boolean isComplete(Node root,int i,int n){
        if(root==null)
          return true;
        if(i>=n)
          return false;
        return isComplete(root.left,2*i+1,n) &&
               isComplete(root.right,2*i+2,n);
        
    }
    boolean isHeapd(Node root){
        if(root.left == null && root.right==null) 
            return true;
        if(root.right==null){
            return root.data >= root.left.data;
        }
        else{
            if(root.data >= root.left.data && root.data >= root.right.data) 
                return isHeapd(root.left) && isHeapd(root.right); 
            else
                return false;
        }
        
    }
    boolean isHeap(Node root)
    {
	   // Your code here
	   if(root==null)
	     return true;
	   int count = countNodes(root); 
          
        if(isComplete(root, 0 , count)==true && isHeapd(root)==true) 
            return true; 
        return false;
	   
	   
    }
}
