package _AAAA_college;
    
import java.util.*;
public class replaceall {

	public static int rev(int temp){
		int a =0;
		while(temp>0){
			int b = temp%10;
			a = a*10 + b;
			temp = temp/10;
		}
		return a;
	}
	public static int conv(int num){
		int dig , temp = 0;
		while(num>0){
			dig = num%10;
			if(dig == 0){
				dig = 5;

			}
			temp = temp *10 + dig;
			num = num/10;
		}
		return rev(temp);
		
			

		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n == 0){
				System.out.println("5");
			}
			else{
			    System.out.println(conv(n));
			}
			sc.close();
			

		}

	}
    
	
