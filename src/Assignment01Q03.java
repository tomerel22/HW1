public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        long fib1 = 1;
        long fib2 = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(fib1);
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
            if (fib1 % 2 == 1) {
                numOdd++;
            }
            long temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        System.out.println();


        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
