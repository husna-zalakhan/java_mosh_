package practices.java_mosh_;

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class main {

    public void main(String[] args){ // the main method must be static
    System.out.println("Hi");// insie these parenthesis we can pass value to our method. 
    A.listen();

    // variables: used to temporally store data in computer's memiry.
    //primitive data type don't have members
    byte age = 20;
    /*age---->name, label, identifier, identify our variable */
    System.out.println(age);

    long viewsCount= 3_221_442_334L;
    float price = 10.99F;
    char letter = 'A';
    String app = "ddf"; 
    //boolean isEligible= false;

    //Refrence type
    //current Date
    Date now = new Date(); //green Date is instance of the date class. 
    //blue Date is reference type, we need to allocate memory.  
    
    //sout ----press tap, shortcut for System.out....
    System.out.println(now);

    byte x= 1;
    byte y= x;
    x=2;
    System.out.println(y);

    Point point1= new Point(1,1);
    Point point2= point1;
    point1.x =2;
    System.out.println(point2);

    String message = "Hello world" + "!!!";
    
    System.out.println(message.endsWith("!!"));
    System.out.println(message.startsWith("!!"));
    System.out.println(message.length());
    System.out.println(message.indexOf("z"));
    System.out.println(message.indexOf("H"));
    System.out.println(message.indexOf("e"));
    System.out.println(message.replace("!!", "sky" )); 
    /*has 2 parameters 
    target and replaceent are parameter
    !! and sky are arguments
    parameters
        are the holes we define in our methods
        arguments
        are the actual value that we pass to these methods 
    */

    System.out.println(message);
    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());
    System.out.println(message.trim());//get rid of white spaces at the beginning

    // Back-Slashes
    String text = "Hello \"Husna\"";
    System.out.println(text);

    // c:\Windows\...
    String window= "c:\\Window\\...";
    System.out.println(window);

    // new line \n
    // tab \t

    //Arrays
    //used to store a list of items, people, num
    int[] numbers = new int[9];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers.length); 
    
    int[] num= {7, 8, 9, 6};
    System.out.println(num.length);

    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    //Multi-dimentional Array
    // 2 dimentional array to store matrics
    // 3 dimentional array to store data for cube

    int [][] countNum = new int[2][3]; // 2 rows, 3 columns
    countNum[0][0]= 1; 
    //first row, first column
    System.out.println(Arrays.deepToString(countNum));
    // deepToString to print multi dimentional array

    int [][][] amount = new int [5][4][3];
    System.out.println(Arrays.deepToString(amount));

    int [][] priceNum = {{1, 2, 3}, {4, 5, 6}};
    System.out.println(Arrays.deepToString(priceNum));

    //Constants
   final float PI = 3.14F; // final change it to constant
     
  //Arithmetic Expressions
  // + - * / %
  int result = 10+3;
  System.out.println(result);

  int results = 10/3;//in java the division of two whole number, is a whole number.
  System.out.println(results);

  double finalResult = (double)10 / (double)3;
  System.out.println(finalResult);

  // increment operator
  int z = 31;
  //postfix
  int h = ++z;
  System.out.println(z);
  System.out.println(h);
  //++z prefix
  //z++ postfix

  int u = 3;
  u =  u + 2;
  u += 5; //compound assignment operator, augmented operators
  System.out.println(u);

  //order od operation
  









    














    

}
}
