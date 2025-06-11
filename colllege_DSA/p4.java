package colllege_DSA;
import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
          int index = 0;
        int arr[] = {2,6,3,8,5};
        System.out.println("Which value to find? ");
        int find = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(find == arr[i]){
                index = i;
                flag = true;
                
                break;
            }
            else{
                flag = false;
               
            }
        } 
        if(flag == true){
            System.out.println("Element found at index "+index);
        }
        else{
             System.out.println("program not found :( )");

        }
sc.close();
    }
    
}
