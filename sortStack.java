class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> temp = new Stack<Integer>();
		while(!s.isEmpty()){
		    int tmp=s.pop();
		    while(!temp.isEmpty() && temp.peek()>tmp){
		        s.push(temp.pop());
		        
		    }
		    temp.push(tmp);
	}
	return temp;
}
}
