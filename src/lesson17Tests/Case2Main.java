package lesson17Tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Case2Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        FileReader fr = new FileReader(url);
        FileWriter writer2 = new FileWriter("log.txt", true);
        CopyFileService.copyFileService(url, fr, writer2);
    }
}
