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




}









