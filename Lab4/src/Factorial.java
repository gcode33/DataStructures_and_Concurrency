import org.w3c.dom.Node;

public class Factorial {
    private Node first;

    // Recursive definition of method factorial
    public static int factorial(int n) {
        if (n == 1 || n == 0)  // base case
            return 1;
        else {
            int result = n * factorial(n - 1);
            return result;
        }
    }

    private class Node {
        int data;
        Node next;
    }

    public int size() {
        return sizeSub(first);
    }

    private int sizeSub(Node head) {
        if (head == null)
            return 0;
        else return 1 +
                sizeSub(head.next);
    }

    public void print() {
        //outputs the data on the list
        Node current = first;
        if(first == null){
            System.out.println("empty");
        }
        else{
            printSub(first);
        }

    }
    private void printSub(Node head){
        if (head == null) {
            return;
        }

        System.out.println(head.data);

        printSub(head.next);
    }
}