package school.lesson8;

import java.io.IOException;
import java.util.*;

public class Homework {
    static final String FILE_NAME1 = "C://JAVA/JavaLesson8Homework.txt";
    static final String FILE_NAME2 = "JavaLesson8Homework.txt";

    public static void main(String[] args) {
            // first homework item
            List<String> wordArray = new ArrayList<String>();
            wordArray = ArrayOperation.fillTheArray(wordArray);
            System.out.println(wordArray + "\n");
            ArrayOperation.printUniqueWords(wordArray);
            wordArray.clear();
            try {
                wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
            } catch (IOException e) {
                System.out.println("Failed to fill array from file!\n");
            }
            try {
                wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
            } catch (IOException e) {
                System.out.println("Failed to fill array from file!\n");
            }
            System.out.println(wordArray + "\n");
            ArrayOperation.printUniqueWords(wordArray);
            // second homework item
            Phonebook phonebook = new Phonebook();

            phonebook.add(3204578, "Zaitsev");
            phonebook.add(6578794, "Zaitsev");
            phonebook.add(4356783, "Volkov");
            phonebook.add(4356278, "Medvedev");
            phonebook.add(7986053, "Medvedev");
            phonebook.add(6475893, "Medvedev");

            phonebook.get("Zaitsev");
            phonebook.get("Volkov");
            phonebook.get("Medvedev");
            phonebook.get("Lisichkina");
        }

}

