import java.util.*;

public class BB_breakquestion {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter number  : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();

    }

    
}
