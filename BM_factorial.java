import java.util.*;
public class BM_factorial {

    public static int factorial(int a){
        int f = 1;

        for(int i = 1;i <= a;i ++){
         f = f*i;
        }
        System.out.println("factorial is :" + f);
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the numvber for factorial : ");
        int num = sc.nextInt();
        factorial(num);



    sc.close();    
    }
     
}
