import java.util.*;
import java.lang.*;
import java.io.*;
class Interval {
    int buy, sell;
    
}
     class StockBuySell{
         void stockBuySell(int price[], int n) {
             if (n == 1) 
			   return;  

		     int count = 0; 
		     ArrayList<Interval> sol = new ArrayList<Interval>();
		     int i = 0; 
		     while (i < n - 1) {
		         while ((i < n - 1) && (price[i + 1] <= price[i]))
		          i++; 
			 if (i == n - 1) 
				break; 

			 Interval e = new Interval(); 
			 e.buy = i++; 
			
			 while ((i < n) && (price[i] >= price[i - 1])) 
				i++;
				e.sell = i - 1;
				sol.add(e); 
				count++;
		         
		     }
		     if (count == 0) 
		      System.out.println("No Profit"); 
		    else
		    for (int j = 0; j < count; j++) 
				System.out.print("(" + sol.get(j).buy 
								+" "+ sol.get(j).sell+")"+" ");
				
				
			return; 
	} 

	public static void main(String args[]) 
	{
		
		Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t>0){
	         StockBuySell stock = new StockBuySell();
	         int n=sc.nextInt();
	         int[] ar=new int[n];
	         for(int i=0;i<n;i++){
	             ar[i]=sc.nextInt();
	         }
	         stock.stockBuySell(ar,n); 
	         System.out.println();
	         t--;
	     }	
	} 
}




    
	
