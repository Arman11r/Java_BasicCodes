package _AAAA_college;

public class assignmentfirst{

    public static  void pattern(int a){
        for(int i = 1; i<=a; i++){

            for(int j =1;j<=a;j++){
                if( i == 1 || j ==1 || i == a || j == a || j == 2 || j == 4){
                    System.out.print("*");
                    if(i == 3 && j == 2 || j == 4 && i == 3){
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(" ");
                }
                
            }

        }
    }
    public static void main(String[] args){

    }
    
}
