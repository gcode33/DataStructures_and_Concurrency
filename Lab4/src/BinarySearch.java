public class BinarySearch {
    // Binary search method
    public static int binarySearch(int[] values, int target) {
        return binarySearchHelper(values, target, 0, values.length - 1);
    }

    // Helper method for recursion
    private static int binarySearchHelper(int[] values, int target, int low, int high) {
        // Base case: target not found
        if (low > high) {
            return -1; // Return -1 if the target is not found
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Check if the middle element is the target
        if (values[mid] == target) {
            return mid;
        }

        // If the target is smaller than mid, search in the left half
        if (target < values[mid]) {
            return binarySearchHelper(values, target, low, mid - 1);
        }

        // If the target is larger than mid, search in the right half
        return binarySearchHelper(values, target, mid + 1, high);
    }

    // Main method to test the recursive binary search
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};

        // Test for an element in the array
        int target = 7;
        int index = binarySearch(sortedArray, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        // Test for an element not in the array
        target = 4;
        index = binarySearch(sortedArray, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
