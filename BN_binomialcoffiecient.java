import java.util.*;
public class BN_binomialcoffiecient {
    
    public static int factorial(int a){
        int f = 1;

        for(int i = 1;i <= a;i ++){
         f = f*i;
        }
        return f;

    }

    public static int binomialcofficient(int n, int r){
        int fac_b = factorial(n);
        int fac_c = factorial(r);
        int fac_bmc = factorial(n-r);
        int bicoff =  fac_b / (fac_c * fac_bmc) ; 
        System.out.print("answer is :"+ bicoff);
        return bicoff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the value for n : ");
        int n = sc.nextInt();
        System.out.print("enter the value for r : ");
        int r = sc.nextInt();
        binomialcofficient(n,r);        


      


    sc.close();    
    }
     
}

    

