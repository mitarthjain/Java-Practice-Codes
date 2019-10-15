import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	  Scanner sc=new Scanner (System.in);
	  int tc=sc.nextInt();
	  while(tc-->0)
	  {
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      int prefix[]=new int[n];
	      int count=0,sum=0;
	LinkedHashMap<Integer,Integer>m=new LinkedHashMap<Integer,Integer>();
	      m.put(0,1);
	      for(int i=0;i<n;i++)
	      {
	          arr[i]=sc.nextInt();sum=sum+arr[i];
	          if(m.containsKey(sum)==true)
	          {
	              count=count+m.get(sum);
	              int num=m.get(sum);
	              m.put(sum,num+1);
	          }
	          else
	          {
	              m.put(sum,1);
	          }
	      }
	      System.out.println(count);
	  }
	 }
}
