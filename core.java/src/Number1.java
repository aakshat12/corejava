public class Number1 {

        public static void main(String[] args) {
            int variable1 = 30;
            int variable2 = 15;

            sum(variable1, variable2);
            difference(variable1, variable2);

            int productResult = product(variable1, variable2);
            System.out.println("Product: " + productResult);
        }

        public static void sum(int value1, int value2) {
            int result = value1 + value2;
            System.out.println("Sum: " + result);
        }

        public static void difference(int value1, int value2) {
            int result = value1 - value2;
            System.out.println("Difference: " + result);
        }

        public static int product(int value1, int value2) {
            return value1 * value2;
        }


}
