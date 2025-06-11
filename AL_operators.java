public class AL_operators {
    public static void main(String args[]) {
        //binary operators
        int a = 20;
        int b = 15;
        int sum = a + b;                   // + operator
        int multiply = a * b;              // * operator
        int divide = a / b;                // / operator
        int remainder_or_modulo = a % b;   // % operator
        int ignore = sum +multiply+divide+remainder_or_modulo;

        //unary operator
        int c = 10;
        int d = ++c;  //output = 11 (becuase it will change first then use)
        
        int e =12;
        int f = e++;  // output  = 12  (becuase use first then change)

        //relational operators
        /*
         * ==
         * !=
         * <
         * >
         * <=
         * >=
         */

         //logical operators
         /*
          && (AND)
          || (OR)
          !  (NOT)
        */


        //Assignment operator

        /*
         =
         +=
         -=
         *=
         /= 
         example = a = a+10 or a += 10
         */


        //ignore
        ignore = ignore +d+f;



    }
}
