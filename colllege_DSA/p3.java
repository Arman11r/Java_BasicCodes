package colllege_DSA;

public class p3 {
    public static void main(String[] args) {
        int arr[] = {4,2,8,5,9};
        int max = arr[0];
        int min = arr[0];

        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                }
            if(min>arr[0]){
                min = arr[i];
            }
        }
        System.out.println("Max is "+max+" Min is "+min);
     }
     
}
    

