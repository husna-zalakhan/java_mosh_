package practices.java_mosh_;
// second part of the course

public class A {// a class is a container for related methods.
    // we use classes to organize our code. 
    public static void main(){

    //Comparison operator: used to compare primitive values
        int x = 1;
        int y = 2;
        System.out.println(x==y); 
        //equality opertor, it compare whether the two values are equal or not
        System.out.println(x != y); //inequality operator
        System.out.println(x< y);
        System.out.println(x<= y);

        //Logical Operators

        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // Logical "And" operator
        System.out.println(isWarm); 

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //Logical "or" operator // ! not operator
        System.out.println(isEligible);

        //not operator: used to reverse to reverse a value
        
        // If Statements: allow us to build programs that can make decisions based on the certain condition

        int tempretureDegree = 32;

        if ( tempretureDegree > 30){
            System.out.println("It's a hod day, drink plenty of water. ");
            } 
        else if (tempretureDegree > 20 && tempretureDegree <= 30) 
            System.out.println("It's a nice day. ");
        else 
            System.out.println("It's cold");
    
        // Simplyfying If Statements

        int income = 120_000;
        //boolean hasHighSalary = false;
        // if (income > 100_000)
        //     hasHighSalary = true;
        // else 
        //     hasHighSalary = false;

        // System.out.println(hasHighSalary);

        // simple way
        boolean hasHighSalary = (income > 100_000);

        // The Ternary Operator
        // ? and : are ternary operator in java
     
        int salary = 120_000;
        String className = salary > 100_000 ? "First" : "Economic";
        System.out.println(className);

        


            
                   
        

        
    
    
    
    
    
    
    

    
    }
    
}
