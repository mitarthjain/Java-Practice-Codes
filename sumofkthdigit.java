import java.util.*;
class gfg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int k=sc.nextInt();
        //System.out.println(n);
        int s=0;
        for(int i=k-1;i<n.length();i+=k){
            s+=Character.getNumericValue(n.charAt(i));
            
        }
        System.out.println(s);
    }
}
