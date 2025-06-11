package _AAAA_college;
import java.util.*;
public class fifth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int result = 0;
        for(int i = 1;i<=n;i++){
            if(i%2==0){
               result = result+i;
            }
            else{
                result = result-i;

            }
            
        }
        System.out.print(result);
        sc.close();
    }
    
}
 