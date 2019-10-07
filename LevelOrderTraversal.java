class Level_order_traversal
{
    //You are required to complete this method
    static void levelOrder(Node root) 
    {
        if(root==null)
           return;
        int h=height(root);
        int i;
        for(i=0;i<=h;i++)
          givenLevel(root,i);
        
        
        // Your code here
    }
    static void givenLevel(Node root,int level){
        if(root==null)
          return;
        if(level==1)
          System.out.println(root.data);
        else if(level>1){
            givenLevel(root.left,level-1);
            givenLevel(root.right,level-1);
        }
        
    }
    int height(Node root){
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh>rh)
          return(lh+1);
        else
          return(rh+1);
    }
}
