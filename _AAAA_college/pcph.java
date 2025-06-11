//38A
package _AAAA_college;
import java.util.Scanner;

public class pcph {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int[] arr = new int[101];
        int n = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = 0;
        for (int i = a - 1; i < b - 1; i++) {
            result += arr[i];
        }
        System.out.println(result);
        scanner.close();
    }
}

    

