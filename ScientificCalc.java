import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while(run){
            displayMenu();
            System.out.print("Enter your choice ( enter 0 or 17 to Exit) : ");
            try{

                choice = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("ahhhm there was an Invalid input, please reEnter a number: ");
                input.next();
                continue;
            }


            switch (choice) {
                case 1:
                    PerformAdd();
                    break;
                case 2:
                    PerformSub();
                    break;
                case 3:
                    PerformMultiplication();
                    break;
                case 4:
                    PerformDivision();
                    break;
                case 5:
                    PerformPower();
                    break;
                case 6:
                    PerformSquareRoot();
                    break;
                case 7:
                    PerformSine();
                    break;
                case 8:
                    PerformCosine();
                    break;
                case 9:
                    PerformTangent();
                    break;
                case 10:
                    PerformNaturalLog();
                    break;
                case 11:
                    PerformLogBase();
                    break;
                case 12:
                    PerformAbsolute();
                    break;
                case 13:
                    PerformRound();
                    break;
                case 14:
                    PerformCeiling();
                    break;
                case 15:
                    PerformFloor();
                    break;
                case 16:
                    PerformFindMin();
                    break;
                case 17:
                    PerformFindMax();
                    break;
                case 0:
                case 18:
                    System.out.println("bye bye....");
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");






            }


        
    }

    public static void displayMenu() {
        String[] Menu = {"Menu (ignore this)", "Addition (+)",
                "Subtraction (-)", "Multiplication(*)", "Division (/)",
                "Power (x^y)","Square Root (√x)" ,"Sine (sin(x))", "Cosine (cos(x))",
                "Tangent(tan(x))", "Natural Logarithm ln x", "Logarithm Base 10 (log10 x)",
                "Absolute Value", "Round ( to nearest long )", "Ceiling (round up )",
                "Floor ( round down )", "Minimum of two numbers", "Maximum of two numbers", "Exit"
        };

        for (int i = 0; i < 19; i++) {
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
        public static double squareRoot(double num1){
            return Math.sqrt(num1);
        }

    private static void PerformAdd() {
        boolean check = false;
        double num1 = 0;
        double num2 = 0;
        Scanner input = new Scanner(System.in);
        while (!check) {
            try {

                System.out.print("Enter first Number: ");
                num1 = input.nextDouble();
                System.out.print("Enter second Number: ");
                num2 = input.nextDouble();
                check = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input.");
                input.nextLine();
            }
        }
        System.out.println("Result is: " + Addition(num1, num2));

    }
        private static void PerformSub(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Subtraction(num1, num2));

        }

        private static void PerformMultiplication(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Multiplication(num1, num2));

        }

        private static void PerformDivision(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();

                    if (num2 == 0){
                        System.out.println("Error: the second number cannot be 0.");
                    }
                    else{
                        System.out.println("Result is: " + Division(num1, num2));
                        check = true;
                    }


                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }


        }
        private static void PerformPower(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Power(num1, num2));

        }
        private static void PerformSquareRoot(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + squareRoot(num1));

        }
        private static void PerformSine(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter degree number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Sine(Math.toRadians(num1)));

        }
        private static void PerformCosine(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter degree Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Cosine(Math.toRadians(num1)));

        }
        private static void PerformTangent(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter degree Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Tangent(Math.toRadians(num1)));

        }
        private static void PerformNaturalLog(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + NaturalLog(num1));

        }
        private static void PerformLogBase(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Logbase(num1));

        }
        private static void PerformAbsolute(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Absolute(num1));

        }
        private static void PerformRound(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Round(num1));

        }
        private static void PerformCeiling(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Ceiling(num1));

        }
        private static void PerformFloor(){
            boolean check = false;
            double num1 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter a Number: ");
                    num1 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + Floor(num1));

        }
        private static void PerformFindMin(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + findMin(num1, num2));

        }
        private static void PerformFindMax(){
            boolean check = false;
            double num1 = 0;
            double num2 = 0;
            Scanner input = new Scanner(System.in);
            while (!check) {
                try {

                    System.out.print("Enter first Number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second Number: ");
                    num2 = input.nextDouble();
                    check = true;

                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input.");
                    input.nextLine();
                }
            }
            System.out.println("Result is: " + findMax(num1, num2));

        }






}









