public class AM_ifelse {
    public static void main(String args[]){
        int age = 16;
        if(age >=18)
        {
            System.out.print("adult : drive, vote");
        }
        if(age>13 && age<18){
            System.out.print("teenager");
        }
        else {
            System.out.print("not adult");
        }
    }
    
}
//else if helps to make code faster by using else if in second casevas it will not check that if the opper case is true but in if it will check every time