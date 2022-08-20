import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Scanner object 
        Calculator calc = new Calculator();
        //Calculator object 
        System.out.println("ENTER TWO NUMBERS");
        //asking user inputs
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        //variables that store the user input
        
        //operations +-*/ with the user inputs 
        calc.add(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);
        
    }
}
