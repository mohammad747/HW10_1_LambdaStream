package ir.maktabsharif;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Mohammad hashemi
 */
public class Main {

    public static void main(String[] args) {

        // Arrays of names
        List<String> testList = Arrays.asList("Amir" , "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");

        // part a
        Map<Integer, List<String>> mapStream = testList.stream()
                .collect(groupingBy(String::length));


        // part b
        Map<Integer, Long> anotherMap = testList.stream()
                .collect(groupingBy(String::length, counting()));


        System.out.println(mapStream);

        System.out.println(anotherMap);


    }
}
