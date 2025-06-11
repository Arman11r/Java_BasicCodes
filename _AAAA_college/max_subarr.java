import java.util.*;

public class max_subarr {
    public static void Subarrsum(int numbers[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0; i <numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                sum = 0;
                for(int k = start; k<=end;k++){
                    sum += numbers[k];
                }
                //System.out.print(sum);
                if(maxsum<sum){
                    maxsum = sum;
                }
            }
           
        }
        System.out.println("max : "+maxsum);

        }

    public static void main(String args[]){
    int numbers[] = {2,-4,5,6,-10,8,9,-110};
    Subarrsum(numbers);
    }
    
}

