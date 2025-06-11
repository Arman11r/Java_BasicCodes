//Question ==  In a program,input 3 numbers : A,B and C.You have to output average of these 3 numbers
// hint = Average of N numbers is sum of those numbers divided by N


import java.util.*;
public class $pq1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int A = sc.nextInt();
        System.out.print("Enter second number : ");
        int B = sc.nextInt();
        System.out.print("Enter third number : ");
        int C = sc.nextInt();
        float avg = (A+B+C)/3;
        System.out.print("The Average of 3 numbers is : ");
        System.out.print(avg);
        sc.close();

    }
}
