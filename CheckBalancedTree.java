class Tree
{
    
     
    boolean isBalanced(Node root)
    {
        int l=0;
        int r=0;
        if(root==null)
         return true;
        l=height(root.left);
        r=height(root.right);
        if(Math.abs(l-r)<=1 && isBalanced(root.left) && isBalanced(root.right))
          return true;
        
        return false;
    }
    int height(Node root){
        if(root==null)
          return 0;
        return 1+Math.max(height(root.left),height(root.right));
        
    }
 }
