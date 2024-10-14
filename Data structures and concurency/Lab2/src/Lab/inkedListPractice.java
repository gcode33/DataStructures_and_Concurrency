package Lab;

import java.util.LinkedList;
import java.util.ListIterator;

public class inkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.add("Ray");
        iterator.previous();
        iterator.previous();
        iterator.previous();
        iterator.remove();
        iterator.add("Kay");
        String name1 = names.getFirst();//S
        String name2 = names.getLast();//T


        iterator = names.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println("begining "+name+"...");
        }
        while(iterator.hasPrevious()){
            String name = iterator.previous();
            System.out.println("ending "+name+"...");

        }




    }
}
