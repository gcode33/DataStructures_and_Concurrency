import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 8;
        //Factorial fun = new Factorial();
        n = Factorial.factorial(n);
        // System.out.println(fun);
        System.out.println("Finishing main "+n);

        LinkedList list = new LinkedList();

        // Test with an empty list
        System.out.println("Size of empty list: " + list.size()); // Expected output: 0

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);

        // Test with elements in the list
        System.out.println("Size of list after adding elements: " + list.size());
    }
}