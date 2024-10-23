public class MyArrays {
    public static int sum(int[] values) {
        return sumHelper(values, values.length - 1); // Start recursion from the last index
    }

    private static int sumHelper(int[] values, int index) {
        // Base case: if the index is negative, return 0 (end of array)
        if (index < 0) {
            return 0;
        }

        // Recursive case: sum the current element and the sum of the rest
        return values[index] + sumHelper(values, index - 1);
    }

    // Main method to test the recursive sum function
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + sum(array)); // Expected output: 15
    }
}
