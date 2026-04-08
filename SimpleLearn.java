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
    // initialize that calss ---> create an object out of that class
     

    
}
