import java.util.Scanner;

public class Travelticket {
    public  static void  main(String[] args){
        System.out.println("Enter the ticket number:");
        Scanner sc = new Scanner(System.in);
        int ticketnum = sc.nextInt();
        int lastdigit = ticketnum%10;
        System.out.println("lastdigit after removing :"+lastdigit);
        int rem= lastdigit/10;
        System.out.println("remaining digit after removing:"+rem);
        int check = rem%7;
        System.out.println("checking by 7:"+check);
        if(lastdigit == check)
        {
            System.out.println("ticket is valid:");
        }
        else {
            System.out.println("ticket is not valid:");
        }


    }
}
