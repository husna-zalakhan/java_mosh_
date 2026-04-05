package practices.java_mosh_;

abstract class Abstraction {

    // abstract method (no body)
    //this is abstraction -> we only say what to do, not how
    //cannot make obj of abstraction class
    
    abstract void makeNoise();
    // abstraction method: every animal should make noise but don't define how since our method doesn't has a body
    //this is abstraction

    void rest(){
        System.out.println("Animals rest ");
    }
}
class Dog extends Abstraction {

    void makeNoise (){
        System.out.println("Dog barks");
    }
}
class Cat extends Abstraction {

    void makeNoise(){
        System.out.println("Cat meows..");
    }
}

public class MainAbstraction {
    
    public static void main(String[] args){

        Abstraction a1 = new Dog(); // this uses abstraction + polymorphism together
        Abstraction a2 = new Cat();

        a1.makeNoise(); //call the method
        a2.makeNoise(); 

        a1.rest();
    }
    // You can have many classes, But only ONE public class
}
