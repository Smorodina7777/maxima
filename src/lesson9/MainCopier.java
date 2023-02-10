package lesson9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class MainCopier {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\Hobby_копия.txt", false)) {
            String nul = "";
            writer.write(nul);
        } catch (IOException ex) {
            throw new RuntimeException(ex);

        }
        try (FileReader reader = new FileReader("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\Hobby.txt")) {
            int c;
            char[] buf = new char[256];
            while ((c = reader.read(buf)) > 0) {

                buf = Arrays.copyOf(buf, c);

                try (FileWriter writer = new FileWriter("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\Hobby_копия.txt", true)) {
                    writer.write(buf);
                    writer.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);

                }

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

        try (FileWriter writer = new FileWriter("D:\\Users\\Lena\\Projects\\maxima\\src\\lesson9\\log.txt", true)) {
            String text = DateTimeFormatter.ofPattern("yyyy-MMM-dd , hh:mm:ss a")
                    .format(LocalDateTime.now()) + ". Был скопирован файл : Hobby.txt → Hobby_копия.txt\n";
            writer.write(text);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
