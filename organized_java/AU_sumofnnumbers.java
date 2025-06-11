import java.util.*;
public class AU_sumofnnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= n){
            sum+=i;
            i++;
            
        }
        System.out.print(sum);
            sc.close();
    }
    
}
