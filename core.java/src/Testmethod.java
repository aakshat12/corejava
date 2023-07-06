public class Testmethod {
    public static void main(String[] args){


                int var1 = 5;
                int var2 = 10;

                displayIt(var1);
                displayIt(var2);

                displayItTimesTwo(var1);
                displayItTimesTwo(var2);

                displayItPlusOneHundred(var1);
                displayItPlusOneHundred(var2);
            }

            public static void displayIt(int value) {
                System.out.println("Displaying: " + value);
            }

            public static void displayItTimesTwo(int value) {
                System.out.println("Displaying times two: " + (value * 2));
            }

            public static void displayItPlusOneHundred(int value) {
                System.out.println("Displaying plus one hundred: " + (value + 100));
            }




}
