import java.util.*;

public class Main {
    static void occurredOnce(int arr[], int n) 
{ 
    Arrays.sort(arr);
	int i = 1, len = n;
	if (arr[0] == arr[len - 1]) 
	{ 
		i = 2; 
		len--; 
	} 
	for (; i < n; i++) 
		if (arr[i] == arr[i - 1]) 
			i++; 
		else
			System.out.println(arr[i - 1]); 
	if (arr[n - 1] != arr[0] && 
		arr[n - 1] != arr[n - 2]) 
		System.out.println(arr[n - 1]); 
}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            
        }
        occurredOnce(ar,n);      

	}

}
