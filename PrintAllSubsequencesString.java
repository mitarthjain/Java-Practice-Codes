import java.util.*;
class Subsequences{
    static void printSubs(String input){
        int index=-1;
        String curr="";
        printSubsR(input,input.length(),index,curr);
    }
    static void printSubsR(String input,int n,int index,String curr){
        if(index==n){
            return;
        }
        System.out.println(curr);
        for(int i=index+1;i<n;i++){
            curr+=input.charAt(i);
            printSubsR(input,n,i,curr);
            curr=curr.substring(0,curr.length()-1);
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        printSubs(s);
        
    }
}
