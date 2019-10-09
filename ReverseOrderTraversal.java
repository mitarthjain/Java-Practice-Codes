class GfG
{
	void reversePrint(Node root) 
        {
        Stack<Node> S = new Stack(); 
        Queue<Node> Q = new LinkedList(); 
        Q.add(root); 
   
        while (Q.isEmpty() == false)  
        { 
   
            root = Q.peek(); 
            Q.remove(); 
            S.push(root); 
   
           
            if (root.right != null) 
                
                Q.add(root.right);  
                  
         
            if (root.left != null) 
                Q.add(root.left); 
        } 
   
        while (S.empty() == false)  
        { 
            root = S.peek(); 
            System.out.print(root.data + " "); 
            S.pop(); 
        } 
            
        }
}      
       
