package practices.java_mosh_;

//class is blueprint of object
// object is instance of the class
//class is logical entity
// you can map entities in java as classes
// entities has 2 chracteristic. 
// 1. attribute
// 2. behavior 
//classes also have these two properties

public class SimpleLearn {

    //properties (instance variable)
    String name;
    int age;
    String address;

    public void setName(String name){
        this.name = name;
        // this ---> current object

    }
    public void setAge(int age){
        this.age = age;

    }
    public void setAddress(String address){
        this.address = address;

    }
    // GET method: reading the current obj name, property, value and return it. 
    public String getName(){
        return name;
        //return this.name;

    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    
    //constructor
    public SimpleLearn (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args){
        SimpleLearn ahmad = new SimpleLearn("Ahmad" , 25, "Kabul, Afghanistan"); // new onject from the class "SimpleLearn" 
        // new is a keyword that can initialize anything in java
        System.out.println(ahmad.getName());
        System.out.println(ahmad.getAge());
        System.out.println(ahmad.getAddress());
    
    }
    //while creating a class, identify the properties(instance variable)
    //and behaviors like getter and setter.
    // a constructor that cover all the value you want to initialize
    // initialize that class ---> create an object out of that class

    //Access Modifiers: are key words
    // can use them in front of classes, variables, methods 

    //security
    // 1. public: can be accessed from everywhere (classes, package, subclasses, and world)
    // 2. protected: everything whitihn the package, thatparticular class, subclass, can be accessed. 
    // 3. no modifier (default access modifier): accessed whithin the same class, and whithin the same package. not accessed through subclasses and outside the package.
    // 4. private: JUST accssesible whithin the class. 

    //Package: you can rap multiple classes in one package

    




    
}
