package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:/Users/t00244535/Downloads/hamlet.txt";
        Set<Character> set = new TreeSet<Character>();
        Set<Character>set2 = new HashSet<Character>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineParser = new Scanner(line);
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");

                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''" + word + " " + lineNumber);
                    // Add each character of the word to the set
                    for (char c : word.toCharArray()) {
                        set.add(c);
                    }
                    for (char c : word.toCharArray()) {
                        set2.add(c);
                    }
                }

                // Increment line number after processing each line
                lineNumber++;
                lineParser.close(); // Close the inner scanner
            }

            for (Character character : set) {
                System.out.println("Tree set characters: " + character);
            }
            System.out.println("-------------------------");
            for (Character character : set2) {
                System.out.println("Hash set characters: " + character);
            }

            in.close(); // Close the outer scanner

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
