public class BW_lrgest_arr {
    public static void main(String args[]){
        int num[] = {10, 7 , 35  ,46 , 2 ,7};
        int largest = Integer.MIN_VALUE; //min value possible and Integer.MAX_VALUE for maximum value
        for(int i=0; i<num.length; i++){
            if(num[i]> largest){
                largest = num[i];

            }
         


        }
         System.out.println(largest);
    }
    
}
