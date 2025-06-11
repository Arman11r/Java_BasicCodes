import java.util.*;
public class BK_functionsum {
    public static int sum(int a , int b){ //num1 and num2 are parameters
        int sum = a + b;
       return sum;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        System.out.print("enter valu of A = ");
        int a = sc.nextInt();
        System.out.print("enter valu of B = ");
        int b = sc.nextInt();
        int sum = sum(a,b);  // a and b are called arguements
        System.out.print("Sum is " + sum);
        sc.close();

    }
    
}
