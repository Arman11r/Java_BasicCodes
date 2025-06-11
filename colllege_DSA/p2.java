package colllege_DSA;

public class p2 {
    public static void main(String[] args) {
        
        int arr[] = {2,4,9,45,1};
        int sum =0;
        int avg = 0;
        

        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            

        }
        avg = sum/arr.length;

        System.out.println(sum);
        System.out.println(avg);
    }
    
}
