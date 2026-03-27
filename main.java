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

  /*order and operation
  ()
  * /
  + -
  */
  int r = 10 + 3 * 2;
  System.out.println(r);
  
  int w = (10 + 3) * 2;
  System.out.println(w);

  //casting
  // implicit casting, automatic casting
  // byte > short > int > long > float > double
  // byte can be automtically converted to short, short to int, int to long
  short e = 1;
  int f = e + 2;
  System.out.println(f);

  double a = 1.1; 
  double b = a + 2;
  System.out.println(b);

  int v = (int)a + 2;//explicit casting, we convert "a" to an int
  
  // we can't cast a string to a number

  String c = "1";
  int d = Integer.parseInt(c) + 2;
  System.out.println(d);
  
  String i = "34";
  Integer.parseInt(i); //integer is class, parseInt is method
  //this method take string and return integer
  
  String g= "23";
  Short.parseShort(g);
  //takes a string and return short

  // The Math Class
  //Round: we can round a floating value to  whole number
  int intResult = Math.round(1.2F); 
  System.out.println(intResult);
  
  /*Ceil: it is a method which return the smallest integer
  that is greater than or equal to this number so the ceilling of 
  1.1 is 2 */
  int L = (int)Math.ceil(1.0002F);
  System.out.println(L);

  int j = (int)Math.floor(3.3F); //te floor of a number is the largest integer that is the smaller or
  //equal to this number 
  System.out.println(j);

  int k = Math.max(4, 5);
  System.out.println(k);
  //max: return the greater of two values

  int m = Math.min(7, 8);
  System.out.println(m);
  //min: return the smallest of two values

  //Random: is generating a random value between 0 and 1
  //this method return double
  double n = Math.random();
  System.out.println(n);// print a floating value between 0 and 1

  // a number between 0 and 100
  double o = Math.random() * 100;
  //the method ,ath.random() doesn't take any argument
  System.out.println(Math.round(Math.random() * 100));
  /* if we want an integer result
  int o = (int) (Math.random()* 100); */

  
  













    














    

}
}
