package _AAAA_college;
import java.util.*;
public class fourthcpp {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How far is his friend house : ");
        int x = sc.nextInt();
        int a = x/5;
        if(x%5 == 0){
         System.out.println("it will take "+ a +" number of steps");   
        }
        else{
            int b = (int)a + 1;
        System.out.println("it will take "+ b +" number of steps");
        sc.close();
        }
    }
}
