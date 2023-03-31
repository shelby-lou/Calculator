import java.util.Scanner;

public class App{
    private static final Scanner inputScanner = new Scanner(System.in);


    
    public static void main(String[] args){
        getString(prompt: "Enter Operation");
        double num1 = getDouble(prompt: "Enter first number");
        double num2 = getDouble(prompt: "Enter second number");

        System.out.println(Calculator.add(num1, num2));
        System.out.println(Calculator.Subtract(num1, num2));
        System.out.println(Calculator.multiply(num1, num2));
        System.out.println(Calculator.divide(num1, num2));

    }
}