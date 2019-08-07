class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.add(a);
	    
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int min = Integer.MAX_VALUE;
           while(!isEmpty(s)){
           min = Math.min(min, s.pop());
               
           }
           return min;

           
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size() == n;
           
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.size() == 0;
           
	}
}
