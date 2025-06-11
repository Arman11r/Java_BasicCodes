package colllege_DSA;
import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 6;
        int value = 7;
        int index = 3;
        int arr[] = new int[n+1];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=n-1;i>=index-1;i--){
            arr[i+1] = arr[i];
            
        }
       
         arr[index-1] = value;
        System.out.print("Array is ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
            
            
        }
        System.out.println(arr[n]);
        
 sc.close();
    }
   
}
