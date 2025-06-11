package _AAAA_college;

import java.util.*;
public class eightt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, l, m, n, d;
        int cont = 0;
        k = input.nextInt();
        l = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();
        d = input.nextInt();
        cont = d;
        if(k == 1 || l == 1 || m == 1 || n == 1) {
            System.out.println(d);
        } else {
            for(int i = 1; i <= d; i++) {
                if((i%k != 0) && (i%l != 0) && (i%m != 0) && (i%n != 0))
                    cont--;
            }
            System.out.println(cont);
        }
        input.close();
    }
   
}

    

