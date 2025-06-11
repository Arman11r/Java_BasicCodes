package _AAAA_college;

public class recursion {
    static int sum = 0;
    void m1(int n){
       
        if(n==11)
        return;
        System.out.println(n);
        sum = sum +n;
        m1(n+1);
     
        
    }

    
    public static void main(String[] args) {
        recursion m = new recursion();
        m.m1(1);
        System.out.println(sum);
        
    }
    
}
