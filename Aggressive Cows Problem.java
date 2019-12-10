import java.util.*;

public class Main {
    static boolean check(int cows,long positions[], int n,long distance){
        int count=1;
        long last_position=positions[0];
        for(int i=1;i<n;i++){
            if(positions[i]-last_position>=distance){
                last_position = positions[i];
                count++;
            }
            if(count == cows){
                return true;
            }
            
        }
        return false;
    }

	
	public static void main(String[] args) {
        
		// Write your code here
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0){
                int n=sc.nextInt();
                int c=sc.nextInt();
                long[] a=new long[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextLong();
                }
                Arrays.sort(a);
                long start=0;
                long end=a[n-1]-a[0];
                long ans = -1;
                while(start<=end){
                    long mid= start + (end - start)/2;
                    if(check(c,a,n,mid)){
                        ans=mid;
                        start = mid+1;
                    }else{
                        end=mid-1;
                    }
                }
                System.out.println(ans);
                t--;
                          
			}

		}
}                
                
