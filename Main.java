import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter positive integer as numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter positive integer as denominator: ");
            int denominator = scanner.nextInt();
            
            scanner.close(); // Added so the IDE will stop complaining about an open scanner

            if (numerator <= 0 || denominator <= 0) {
                throw new IllegalArgumentException("Only positive integers are allowed.");
            }

            RationalNumber rationalNumber = new RationalNumber(numerator, denominator);
            int gcd = rationalNumber.getGCD();

            System.out.println("Greatest common denominator of " + numerator + "/" + denominator + " is " + gcd);
            

        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}