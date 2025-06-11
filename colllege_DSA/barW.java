
    import java.util.Scanner;

public class barW{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        int n = scanner.nextInt();

        // Create an array of the specified length
        int[] array = new int[n];

        // Prompt the user to enter array elements
       
        for (int i = 0; i < n; i++) {
       
            array[i] = scanner.nextInt();
        }

    

        
        printArray(array);

        // Close the scanner
        scanner.close();
    }

    // Method to invert the array
    public static void invertArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap the elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

    

