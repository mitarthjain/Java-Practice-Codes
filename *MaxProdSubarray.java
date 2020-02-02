import java.lang.*;
import java.io.*;
class GFG{	
    	public static void main(String[] args) throws Exception{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(stdin.readLine());
		while(t>0) {
			int n = Integer.parseInt(stdin.readLine());
			String [] line = stdin.readLine().split(" ");
			int [] arr = new int[n];
			for(int i =0;i<n;i++) {
				arr[i]= Integer.parseInt(line[i]);
			}
			
			long max_product=0,positive_product=0, negative_product=0;
			for(int i=0;i<n;i++) {
				if(arr[i]>0) {
					if(positive_product==0)positive_product++;
					if(negative_product==0)negative_product++;
					positive_product*=arr[i];
					negative_product=Math.min(negative_product*arr[i], 0);
				}else if(arr[i]==0) {
					positive_product=0;
					negative_product=0;
				}else {
					if(positive_product==0)positive_product++;
					if(negative_product==0)negative_product++;
					long pp = positive_product;
					positive_product=Math.max(negative_product*arr[i],0);
					negative_product = pp*arr[i];
					
				}
				if(positive_product>max_product) {
					max_product=positive_product;
				}
				
			}
			if(arr.length==1 && arr[0]<0) {
				 max_product=arr[0];
			}
			System.out.println(max_product);
			t--;
		}

	}

}
