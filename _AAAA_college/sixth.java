package _AAAA_college;
import java.util.*;
public class sixth {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int result = 0;
    System.out.print("enter value  ");
    int a = sc.nextInt();
    for(int i = 1; i<=a;i++){
        System.out.print("enter "+i+" drink percent ");
    int b = sc.nextInt();
    result += b;
    }
    int x = result/a;
    System.out.println(x);
 sc.close();
 }
    
}
