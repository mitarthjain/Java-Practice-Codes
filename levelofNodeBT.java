class GfG
{
    public static int getLevel(Node root, int key)
    {
        if(root==null)
          return 0;
        if(root.data==key)
          return 1;
        int left=getLevel(root.left,key);
        int right=getLevel(root.right,key);
        if(left==0 && right==0)
          return 0;
        if(left==0)
        return right+1;
        if(right==0)
        return left+1;
        
        // add your code here
        return 0;
    }
}
