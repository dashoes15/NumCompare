import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne;
        int numTwo;
        System.out.println("You will be asked to enter two numbers. This program will compare them");
        System.out.println("Enter your first number: ");
        if (scan.hasNextInt()) {
            numOne = scan.nextInt();
            System.out.println("Enter your second number: ");
            if (scan.hasNextInt()) {
                numTwo = scan.nextInt();
                if (numOne > numTwo) {
                    System.out.println(numOne + " is greater than " + numTwo);
                }else if(numTwo > numOne){
                    System.out.println(numTwo + " is greater than " + numOne);
                }else if(numTwo == numOne){
                    System.out.println(numOne + " and " + numTwo + " are equal.");
                }
            }else{
                System.out.println("You have entered a invalid value. Make sure to enter a whole number.");
                System.exit(0);
            }
        }else{
            System.out.println("You have entered a invalid value. Make sure to enter a whole number.");
            System.exit(0);
        }
    }
}