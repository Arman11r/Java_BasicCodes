package _AAAA_college;
import java.util.*;
public class cpp_third {
    public static void main(String args[]){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much does a banana Cost : ");
        int k = sc.nextInt();
        System.out.print("How much money does the soldier have : ");
        int n = sc.nextInt();
        System.out.print("How much banana does the soldier want : ");
        int w = sc.nextInt();
        for(int i = 1;i<=w;i++){
            int output  = i*k;
            result += output;

        }
        int ans = result - n;
        if(ans<=0){
            System.out.print("He doesnt need to borrow money");
        }
        else{
            System.out.print("He need to borrow "+ ans +" rupees");
        }
        sc.close();



    }
    
}
