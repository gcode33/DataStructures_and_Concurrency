public class Fibonacci {

    // Recursive Fibonacci method
    public static int fibonacciRecursive(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 1;

        // Iteratively calculate Fibonacci
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    // Main method to test the recursive Fibonacci function
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci of " + n + " (Recursive): " + fibonacciRecursive(n));
        int n2 = 6;
        System.out.println("Fibonacci of " + n2 + " (Iterative): " + fibonacciIterative(n2));
    }
}
/*
Thus, recursion is inefficient for Fibonacci
because it performs redundant calculations, leading to exponential time complexity,
while iteration avoids this issue with a more direct approach.
*/
