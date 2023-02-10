package lesson9;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainCopier {
    public static void main(String[] args) throws IOException {
        FileWriter writer = null;
        FileWriter writer2 = null;
        try (FileReader fr = new FileReader("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\Hobby.txt")) {
            writer = new FileWriter("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\Hobby_копия.txt", false);
            writer2 = new FileWriter("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\log.txt", true);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "\n");
                line = reader.readLine();
            }
            String text = DateTimeFormatter.ofPattern("yyyy MMM dd , hh:mm:ss a")
                    .format(LocalDateTime.now()) + ". Был скопирован файл : Hobby.txt → Hobby_копия.txt\n";
            writer2.write(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert writer != null;
            writer.close();
            assert writer2 != null;
            writer2.close();
        }
    }
}
