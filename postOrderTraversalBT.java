class Tree
{
    void postOrder(Node root)
    {
       // Your code goes here
       if(root==null)
        return;
       
       postOrder(root.left);
       postOrder(root.right);
       
       System.out.print(root.data+" ");
    }
}
