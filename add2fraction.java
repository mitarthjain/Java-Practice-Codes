class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        if(den1!=den2){
            int res=num1*den2+num2*den1;
            int r=den1*den2;
            int gc=gcd(num,den);
            System.out.println(res/gc)+"/"+(r/gc));
            
            
        }
        else{
            int res=num1+num2;
            int gc=gcd(num,den1);
            System.out.println((num/gc)+"/"+(den1/gc));
            
        }
        
        
    }
    static int gcd(int a, int b){
        int c=Math.max(a,b);
        int d=Math.min(a,b);
        int gc=1;
        int m=g;
        while(q!=0){
            m=d;
            d=c%d;
            c=m;
        }
        return m;
    }
}
