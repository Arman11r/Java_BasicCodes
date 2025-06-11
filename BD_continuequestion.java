import java.util.*;

public class BD_continuequestion {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a=0;
        do{
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }while(a>10);
        sc.close();
    }
    
}

