package _AAAA_college;

public class eight {

    public static int dragon(int k, int l, int m, int n, int d){  
        int[] arr = new int[d+1];
        int temp1 = d;
        int temp2 = d;
        int temp3 = d;
        int temp4 = d; 
        int dragon = 0; 
            while(temp1 >= k || temp2 >=l || temp3 >= m || temp4 >= n){
                temp1 = temp1 - k;
                temp2 = temp2 - l;
                temp3 = temp3 - m;
                temp4 = temp4 - n;
                if(temp1 >= k){
                    arr[temp1]++;
                }
                if(temp2 >= l){
                    arr[temp2]++;
                }
                if(temp3 >= m){
                    arr[temp3]++;
                }
                if(temp4 >= n){
                    arr[temp4]++;
                }

            }
            for(int i=0; i<arr.length; i++){
                if(arr[i] == 0){
                    dragon++;
                }
            }
            return dragon;
    }
    
    public static void main(String[] args) {
        System.out.println(dragon(2, 3, 4, 5, 24));
    }
}
