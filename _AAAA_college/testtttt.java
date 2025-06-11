package _AAAA_college;
import java.util.*;
public class testtttt {

	private static String replacedStr;
    public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		long n =scanner.nextLong();
		long replacedNumber = replacezerowithfive(n);
		System.out.println(replacedNumber);
		scanner.close();
	}
	public static long replacezerowithfive(long n){
		String numberStr = String.valueOf(n);
        long replacedNumber = Long.parseLong(replacedStr);
		return replacedNumber;
	} 
	

}
    

