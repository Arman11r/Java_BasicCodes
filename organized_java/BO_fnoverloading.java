public class BO_fnoverloading {


    //function for 2 parameters
    public static int sum(int a,int b){
        return a+b;
    }
    
    //function for 3 parameters
    public static int sum(int a ,int b, int c){
        return a+b+c;
    }
}

//in function overloading we can have same name for a function and can also have diffenret numbers of parameters in it
//but public static int sum(int 1,2,3,4) and public static float sum(int1,2,3,4) will give error bcz it will take sum() as a duplicate bcz it odesent check the function type
/*public static int sum(int a,int b)
 * and
 * public static int sum(float a,float b)
 * will not give error 
  */
 
