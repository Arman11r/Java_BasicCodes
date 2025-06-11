import java.util.*;
public class BQ_primewfn {

    public static boolean isprime(int a){
        boolean isprime = true;
        if(a == 2){
            isprime = true;
        }
        for(int i = 2; i <= a-1; i++){
            if(a % i == 0){
                isprime = false;
                break;
            }
        }
        
        if(isprime == true){
          System.out.print("prime");
        } 
        else{
            System.out.print("not prime");
        } 
        return isprime;
        
    }


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    System.out.print("enter number ; ");
    int a = sc.nextInt();

    isprime(a);

    
    sc.close();  
}
  
}
