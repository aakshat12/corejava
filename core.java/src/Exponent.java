import java.util.Scanner;

public class Exponent {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer value: ");
            int number = scanner.nextInt();

            int squared = square(number);
            int cubed = cube(number);

            System.out.println("Square of " + number + " is: " + squared);
            System.out.println("Cube of " + number + " is: " + cubed);
        }

        public static int square(int number) {
            return number * number;
        }

        public static int cube(int number) {
            return number * number * number;
        }


}
