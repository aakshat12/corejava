public class Number {

        public static void main(String[] args) {
            int variable1 = 49;
            int variable2 = 22;

            sum(variable1, variable2);
            difference(variable1, variable2);
        }

        public static void sum(int value1, int value2) {
            int result = value1 + value2;
            System.out.println("Sum: " + result);
        }

        public static void difference(int value1, int value2) {
            int result = value1 - value2;
            System.out.println("Difference: " + result);
        }


}
