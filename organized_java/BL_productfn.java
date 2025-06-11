import java.util.*;
public class BL_productfn {

        public static int product(int num1 , int num2){ //num1 and num2 are parameters
            int product = num1 * num2;
           return product;
        }
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
            System.out.print("enter valu of A = ");
            int a = sc.nextInt();
            System.out.print("enter valu of B = ");
            int b = sc.nextInt();
            int product = product(a,b);  // a and b are called arguements
            System.out.print("product is " + product);
            sc.close();
    
        }
        
    
}
