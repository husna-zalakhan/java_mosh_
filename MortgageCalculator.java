package practices.java_mosh_;

/*principle (amount of loan): 100000
Anual Interest Rate: 3.92
Period (tear): 30
Mortgage: $472.81
*/
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{
    public static void main(String[] args){
        final byte monthsInYear = 12;
        final byte percent = 100;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / monthsInYear;
        
        System.out.print("Period (Year): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYear;
            // camel notation
        double mortgage = principal 
        * (monthlyInterest * Math.pow (1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        





    }

}