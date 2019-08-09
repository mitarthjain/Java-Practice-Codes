class GfG
{
    int tour(int petrol[], int distance[])
    {
	// Your code here
	int st=0;
	int d=0;
	int store=0;
	for(int i=0;i<petrol.length;i++){
	    store+=petrol[i]-distance[i];
	    if(store<0){
	        st=i+1;
	        d+=store;
	        store=0;
	    }
	    
	}
	if((store+d)>0){
	    return st;
	}
	else
	return -1;
    }
}
