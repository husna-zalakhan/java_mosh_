package practices.java_mosh_;

public class polymorphism {

    // cmpile-time polymorphism: same method name multiply with different parameters.
    static int multiply(int a, int b){
        return a * b;
    }
    static int multiply(int a, int b, int c){
        return a * b * c;
    }
    static double multiply(double a, double b){
        return a * b;
    }
    public void main(String[] args){
        System.out.println("Let's learn polymorphism. ");
        System.out.println("2 * 3 =" + multiply (2, 3));
        System.out.println("2 * 3* 4" + multiply (2, 3, 4));
        System.out.println("2.4 * 4.4" + multiply (2.4, 4.4));
        
    }






}
