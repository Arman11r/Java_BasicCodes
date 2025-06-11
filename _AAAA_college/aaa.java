package _AAAA_college;
import java.util.*;

public class aaa {
    
    public static int countDig(int n)  
{  
int count = 0;  
while(n != 0)  
{  
 
n = n / 10;  
  
count = count + 1;  
}  
return count;  
}  
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		
		for(int i =0; i<=countDig(n); i++){
            int sample = n/10;
            int c = 1;
            if(sample == 0){
                n += 5*c;
                c *= 10;
            }


		}
        System.out.println(n);
sc.close();
    }
}
  
