import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalc {

    public static void main(String[] args) {
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





}









