class Level_Order_Traverse
{
    
    //You are required to complete this method
    static void levelOrder(Node root) 
    {
        if(root==null)
           return;
        int h=height(root);
        int i;
        for(i=1;i<=h;i++){
          givenLevel(root,i);
          System.out.print("$ ");
            
        }
        
        
        // Your code here
    }
    static void givenLevel(Node root,int level){
        if(root==null)
          return;
        if(level==1)
          System.out.print(root.data+" ");
        else if(level>1){
            givenLevel(root.left,level-1);
            givenLevel(root.right,level-1);
        }
        
    }
    static int height(Node root){
        if(root==null)
          return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh>rh)
          return(lh+1);
        else
          return(rh+1);
    }

}
