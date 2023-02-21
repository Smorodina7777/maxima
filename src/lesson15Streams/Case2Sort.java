package lesson15Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Case2Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = (str.split(" "));
        Stream.of(words)
                .map(s-> {System.out.println(s);
                    return s;})
                .sorted((s1, s2)->s1.compareTo(s2))
                .forEach(s-> System.out.println(s));

    }
}
