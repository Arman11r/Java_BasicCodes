import java.util.*;
public class one{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=0,y=1,z=0,n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}
