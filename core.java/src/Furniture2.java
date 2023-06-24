import java.util.Scanner;

public class Furniture2 {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int price=100;
        System.out.println("Enter 1 for large table and 2 for small table");
        String woodchoice = SC.next();


        switch (woodchoice)
        {
            case "1":
                System.out.println("Pine table cost $ 100");

                break;

            case "2":
                System.out.println("oak table cost $ 225");
                break;

            case "3":
                System.out.println("Mahogany table cost $ 310");
                break;
            default:
                price=0;
                System.out.println("Invalid code.setting price is 0");

        }



    }
}
