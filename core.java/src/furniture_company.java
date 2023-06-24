
import java.util.Scanner;

public class furniture_company {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int price;
        System.out.println("Enter any digit 1,2,3");
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
