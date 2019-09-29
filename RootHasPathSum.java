class GfG
{
    
    boolean hasPathSum(Node root, int sum)
    {
        if(root==null)
         return false;
        if((root.data==sum) && (root.right==null && root.left==null))
         return true;
        return hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data);
        
    }
}
