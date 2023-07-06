import java.util.Scanner;

public class Eggs {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of eggs: ");
            int numberOfEggs = scanner.nextInt();

            displayInDozens(numberOfEggs);
        }

        public static void displayInDozens(int numberOfEggs) {
            int dozens = numberOfEggs / 12;
            int remainingEggs = numberOfEggs % 12;

            System.out.println(numberOfEggs + " eggs is " + dozens + " full dozen(s) with " + remainingEggs + " egg(s) remaining.");
        }


}
