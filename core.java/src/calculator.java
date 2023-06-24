import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = SC.nextInt();
        System.out.println("Enter your choice +,-,/,%");
        String choice = SC.next();
        System.out.println("Enter the value of b:");
        int b = SC.nextInt();
        switch (choice)
        {
            case "+": System.out.println("addition = "+(a+b));
            break;
            case "-": System.out.println("subtraction = "+(a-b));
            break;
            case "*": System.out.println("Multiplication = "+(a*b));
            break;
            case "/": System.out.println("Quotient = "+(a/b));
            break;
            case "%": System.out.println("Remainder = "+(a%b));
            break;
            default:
                 System.out.println("choice approciate option");






        }

    }
}
