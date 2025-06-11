//Question2 : In a program ,input the side of a square. You have to output the area of the square.


import java.util.*;
public class $pq2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square : ");
        float side = sc.nextFloat();
        float Area = side*side;
        System.out.print("The Area Of Square Is : ");
        System.out.print(Area);
        sc.close();

    }
    
}
