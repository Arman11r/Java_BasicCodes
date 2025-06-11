package _AAAA_college;

import java.util.Scanner;

public class codeforses6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter length of stick 1 ");
        int a = sc.nextInt();
        System.out.print("enter length of stick 2 ");
        int b  = sc.nextInt();
        System.out.print("enter length of stick 3 ");
        int c= sc.nextInt();
        System.out.print("enter length of stick 4 ");
        int d = sc.nextInt();

        if ((a < b + c && b < a + c && c < a + b) || (a < b + d && b < a + d && d < a + b) || (a < d + c && d < a + c && c < a + d) || (d < b + c && b < d + c && c < d + b))
                System.out.println("TRIANGLE");
            else if ((a == b + c || b == a + c || c == a + b) || (a == b + d || b == a + d || d == a + b) || (a == d + c || d == a + c || c == a + d) || (d == b + c || b == d + c || c == d + b))
                System.out.println("SEGMENT");
            else
                System.out.println("IMPOSSIBLE");
                
                sc.close();
                
        }
        
    }

