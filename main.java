package practices.java_mosh_;

import java.util.Date;

public class main {

    public void main(String[] args){ // the main method must be static
    System.out.println("Hi");// insie these parenthesis we can pass value to our method. 
    A.listen();

    // variables: used to temporally store data in computer's memiry.
    //primitive data type don't have members
    byte age = 20;
    long viewsCount= 3_221_442_334L;
    float price = 10.99F;
    char letter = 'A';
    String app = "ddf"; 
    boolean isEligible= false;

    //Refrence type
    Date now = new Date(); //green Date is instance of the date class. 
    //blue Date is reference type, we need to allocate memory.  
    
    //sout ----press tap, shortcut for System.out....
    System.out.println(now);

    /*age---->name, label, identifier, identify our variable */
    System.out.println(age);



}
}
