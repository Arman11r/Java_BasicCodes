public class BS_primeinrange {

    public static boolean isprime(int n) {

        for(int i =2; i <= Math.sqrt(n);i++){     //by doing root n it will only run half way and wouldnt repeat number which will save memory space
            if(n%i == 0){
                return false;
            }
        }
    return true;
    }
    public static void primeinrange(int n) {

        for(int i =2; i <= n; i++) {     
            if(isprime(i)){
                System.out.print(i+"  ");
            }
      
            }

        }
    public static void main(String args[]){
    primeinrange(10);     //prime numbers form 2-20
    
    }
}

