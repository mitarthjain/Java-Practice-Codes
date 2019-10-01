class GfG
{
    int countLeaves(Node root) 
    {
         // Your code  
        
         if(root==null)
           return 1;
         else if(root.left==null && root.right==null)
           return 1;
         else
           return countLeaves(root.left)+countLeaves(root.right);
         
    }
}