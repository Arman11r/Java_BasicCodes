package colllege_DSA;
import java.util.*;

public class p12 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of element in first array : ");
    int n = sc.nextInt();
    System.out.println("Enter number of elements in second array : ");
    int n2 = sc.nextInt();
    
    int arr1[] = new int[n];
    int arr2[] = new int[n2];
    System.out.println( "Enter element of first array : ");

    for(int i = 0; i < n;i++){
         arr1[i] = sc.nextInt();
    }
    System.out.println("Enter element of second array : ");
    for(int i = 0; i < n2;i++){
         arr2[i] = sc.nextInt();
    }
    for(int i =0;i<arr1.length; i++){
        for(int j = 0;j<arr2.length;j++){
            if(arr1[i]==arr2[j] && arr2[j]!=-1){
                arr2[j]=-1;
                System.out.print(arr1[i]+" ");
               
            }
        }
    }
sc.close();
    }
    
    
}
