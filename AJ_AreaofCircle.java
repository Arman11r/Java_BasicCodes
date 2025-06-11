import java.util.*;
public class AJ_AreaofCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Radius: ");
        int a = sc.nextInt();
        
        float area = 3.14f * a * a ;
        System.out.print("The Area of Circle is : ");
        System.out.print(area);
        sc.close();

    }
}
