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


    
}
