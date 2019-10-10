class Spiral
{
      void printSpiral(Node root) 
      {
          int h=height(root);
          int i;
          
          boolean l=false;
          for(i=1;i<=h;i++){
              givenLevel(root,i,l);
              
              l=!l;
          }
          
          
           
      }
      void givenLevel(Node root,int level,boolean l){
           if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) { 
            if (l != false) { 
                givenLevel(root.left, level - 1, l); 
                givenLevel(root.right, level - 1, l); 
            } 
            else { 
                givenLevel(root.right, level - 1, l); 
                givenLevel(root.left, level - 1, l); 
            } 
        } 
      }
     
      int height(Node root){
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
