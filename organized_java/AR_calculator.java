import java.util.*;
public class AR_calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);   //later will be discussed

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.print(a%b);
            break;
            default : System.out.println("Wrong Operator");
            sc.close();
        }
    }
    
}
