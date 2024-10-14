package Lab;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("Kay");
        set.add("Jay");
        set.add("May");
        set.add("Fay");

        Set<String> set2 = new HashSet<String>();
        set2.add("Kay");
        set2.add("Jay");
        set2.add("May");
        set2.add("Fay");

        Iterator<String> iterator = set.iterator();
        Iterator<String> iterator2 = set2.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println("Tree set names:  "+name);
        }
        while(iterator2.hasNext()){
            String name = iterator2.next();
            System.out.println("Hash set names:  "+name);
        }



    }
}
