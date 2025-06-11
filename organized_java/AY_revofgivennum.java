public class AY_revofgivennum {
    public static void main(String args[]){
        int num = 10899;
        int rev = 0;
        while(num>0){
        int lastdig = num%10;
        rev = (rev*10) + lastdig;
        num = num/10;

        }
        System.out.print(rev);
    
        
    }
    
}
