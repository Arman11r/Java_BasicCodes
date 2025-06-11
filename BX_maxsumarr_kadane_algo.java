public class BX_maxsumarr_kadane_algo {

    public static void kadanes(int numb[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<numb.length;i++){
            cs = cs + numb[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
           
        }
        System.out.println(ms);
    }
 
    
    public static void main(String args[]){
        int numb[] = {-2,5,84,-3,6,-8};
        kadanes(numb);
    }

}