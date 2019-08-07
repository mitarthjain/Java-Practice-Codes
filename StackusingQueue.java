class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty())
	       return -1;
	    int size = q1.size();
	    for (int i = 0; i < size - 1; i++)
	        q1.add(q1.poll());
	    return q1.poll();
	    
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
    }
}
