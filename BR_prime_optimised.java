public class BR_prime_optimised {

    public static boolean isprime(int n) {

        for(int i =2; i <= Math.sqrt(n);i++){     //by doing root n it will only run half way and wouldnt repeat number which will save memory space
            if(n%i == 0){
                return false;
            }
        }
    return true;
    }

   public static void main(String args[]){
    System.out.println(isprime(13));
   } 
}
