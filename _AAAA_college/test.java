package _AAAA_college;
import java.util.*;
public class test {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      int a,b;
      int[] arr = new int[count];
      int c = 0;
      for(int i=1; i<=count; i++){
        a = sc.nextInt();
        b = sc.nextInt();
        c = 0;
        while(a%b != 0){
          a++;
          c++;
        }
        arr[i-1] = c;
      }
      for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
      }
      sc.close();
  }
}  
