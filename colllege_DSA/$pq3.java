//Question 3: Enter cost of 3 items from the user (usingfloatdatatype) - a pencil,a pen and an eraser.
// You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) 

import java.util.*;
public class $pq3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of Pencil :");
        float Pencil = sc.nextFloat();
        System.out.print("Enter the cost of Pen :");
        float Pen = sc.nextFloat();
        System.out.print("Enter the cost of Eraser :");
        float eraser = sc.nextFloat();
        float sum = (Pencil + Pen + eraser);
        float gst = (sum*18)/100;
        float Total_Sum = sum +gst;
        System.out.print("your Total Amout is (including 18% gst) : ");
        System.out.print(Total_Sum);
        sc.close();

    }
}
