import java.util.*;
public class _AAAfabonaccimeetsgcd {    
    public static int fab(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fab(n-1)+fab (n-2) ;
    }
    public static int gcd(int a, int b){
        if (b==0) {
            return a;
        }
        return gcd(a, b%a);
    }

    public static int ngcd(int arr[],int l,int r) {
        int result=arr[l-1];
        for(int i=l;i<r;i++) {
            result=gcd(result,arr[i]);
        }
        return result;
    }
public static void main(String args []) {
    Scanner sc= new Scanner (System.in);
    int n=sc. nextInt () ; int q=sc.nextInt ();
    int arr[]=new int [n];
    if (n==0 || q==0) {
        System.out.print(0);
    }
    for(int i=0; i<n; i++) {
        int a= sc.nextInt ();
        arr[i]=fab (a);
        System.out.print (arr[i]+" ");
    }
    while(q-->0){
        int l=sc.nextInt ();
        int r=sc.nextInt ();
        System.out.println(ngcd(arr,l,r));
        
    }
sc.close();
} 
}