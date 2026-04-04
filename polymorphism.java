package practices.java_mosh_;

public class polymorphism {

    // cmpile-time polymorphism: same method name multiply with different parameters.
    // same method name
    //different parameter
    //different behavior
    //in compile-time polymorphism, the decision of which method to call is made during compilation.
    //this happens using method overloading 
    //compile-time polymorphism also called method overloading cause multiple methods with the same name but different prameters are resolved at compile time. 
    
    
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
        
        System.out.println("===runtime polymorphism!");

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal.sleep();
        
        System.out.println();

        myAnimal = new Cat();
        myAnimal.makeSound();
        myAnimal.sleep();

        System.out.println("\n === Array of Animals ===");
       
        Animal [] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Animal();
        animals[2] = new Animal();

        for (Animal a: animals ){
            a.makeSound();
        }
    
    }


}
