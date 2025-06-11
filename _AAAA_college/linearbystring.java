package _AAAA_college;

public class linearbystring {
    

static  boolean search( String arr[],String target)  {
    for(int i=0;i<arr.length;i++){
  
        if(arr[i]==target) {
            return true;
        }
    }
        
    return false;
}
public static void main(String[] args) {
    String arr[] = {"Arman","Jatin","Lokesh","Jay"};
    String target= "Jatin" ;
    boolean ans = search(arr,target) ;
    if(ans==true){
        System.out.println("Found") ;

    }
    else{
        System.out.println("NOt found");
    }
    
} 
}
    

