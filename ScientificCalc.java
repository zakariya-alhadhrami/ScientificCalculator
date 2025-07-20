import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)
        displayMenu();
        
    }

    public static void displayMenu() {
        String[] Menu = {"Menu (ignore this)", "Addition (+)", "Subtraction (-)", "Multiplication(*)", "Division (/)", "Power (x^y)", "Sine (sin(x))", "Cosine\n" +
                "(cos(x))", "Tangent(tan(x))", "Natural Logarithm ln x", "Logarithm Base 10 (log10 x)", "Absolute Value", "Round ( to nearest long )", "Ceiling (round up )",
                "Floor ( round down )", "Minimum of two numbers", "Maximum of two numbers", "Exit"
        };

        for (int i = 0; i < 18; i++) {
            System.out.println(i + "." + " " + Menu[i]);
        }

   }
    public static double Addition(double num1,double num2){
        return num1+num2;
    }
    public static double Subtraction(double num1,double num2){
        return num1-num2;
    }
    public static double Multiplication(double num1,double num2){
        return num1*num2;
    }
    public static double Division(double num1,double num2){
        return num1/num2;
    }
    public static double Power(double num1, double num2){
        return Math.pow(num1, num2);
    }
    public static double Sine(double num1){
        return Math.sin(num1);
    }
    public static double Cosine(double num1){
        return Math.cos(num1);
    }
    public static double Tangent(double num1){
        return Math.tan(num1);}

    public static double NaturalLog(double num1){
        return Math.log(num1);
    }
    public static double Logbase(double num1){
        return Math.log10(num1);
    }
    public static double Absolute(double num1){
        return Math.abs(num1);
    }
    public static double Round(double num1){
        return Math.round(num1);
    }
    public static double Ceiling(double num1){
        return Math.ceil(num1);
    }
    public static double Floor(double num1){
        return Math.floor(num1);
    }
    public static double findMin(double num1,double num2){
        return Math.min(num1,num2);
    }
    public static double findMax(double num1,double num2){
        return Math.max(num1,num2);
    }

    private static void PerformAdd(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first Number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter second Number: ");
            double num2 = input.nextDouble();
            System.out.println("Result is: "+Addition(num1,num2));
        }
        catch (InputMismatchException e){
            System.out.println("Error: Invalid input.");
        }
    }





}









