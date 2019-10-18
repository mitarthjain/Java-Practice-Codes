import java.util.*;
import java.lang.*;
import java.io.*;
class emp implements Comparator<A>{
    public int compare(A a,A b){
         if(a.sal==b.sal)
         return a.name.compareTo(b.name);
         else 
         return a.sal-b.sal;
     }
}
class A 
 {
     int sal;String name;
     public A(int sal,String name){
         this.sal=sal;
         this.name=name;
     }
     public String toString(){
         return this.name+" "+this.sal;
     }
     
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	int t,n,i,j;
	t=sc.nextInt();
	for(i=0;i<t;i++){
	    n=sc.nextInt();
	    ArrayList<A> ar = new ArrayList<A>();
	    for(j=0;j<n;j++){
	       String name=sc.next();
	       int sal=sc.nextInt();
	       ar.add(new A(sal,name));
	}
	Collections.sort(ar,new emp());
	for ( j=0; j<ar.size(); j++)
            System.out.print(ar.get(j)+" ");
            System.out.println();
	 }
}
}
