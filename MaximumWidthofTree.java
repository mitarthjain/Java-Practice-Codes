class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
       
           
        int max=0;
        int  width;
        int h=height(root);
        int i;
        for(i = 1; i <= h; i++){
            width = getWidth(root, i);
            if(width > max)
              max = width;
            
            
        }
        return max;
        
    }
        int getWidth(Node root, int level){  
               
            if(root == null)  
                return 0;  
                  
            if(level == 1)  
                return 1;  
                          
            else if (level > 1)  
                return getWidth(root.left, level - 1) +  
                        getWidth(root.right, level - 1); 
            return 0;
        }
int height(Node root)  
{  
    if (root == null)  
        return 0;  
        
    else{  
        int lHeight = height(root.left);  
        int rHeight = height(root.right);  
        return (lHeight > rHeight)? (lHeight + 1): (rHeight + 1);
    } 
    
}        // Your code here
        
}
