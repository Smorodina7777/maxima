package lesson17Tests;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CopyFileService {
    String url;
    FileReader fr;
    FileWriter writer2;


    public static String copyFileService(String url, FileReader fr, FileWriter writer2 ) throws IOException {

        String[] split = url.replace("\\", " ").split(" ");
        String title = split[split.length-1];
        String[] titleSplit = title.replace(".", " ").split(" ");
        String urlCopy = url.substring(0, url.indexOf("."));
                urlCopy = urlCopy +"_копия."+titleSplit[1];
        try (FileWriter writer = new FileWriter(urlCopy, false)) {
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                writer.write(line + "\n");
                line = reader.readLine();
            }
            String text = DateTimeFormatter.ofPattern("yyyy MMM dd , hh:mm:ss a")
                    .format(LocalDateTime.now()) + ". Был скопирован файл : "+title+" → "+titleSplit[1]+"_копия."+titleSplit[1]+"\n";
            writer2.write(text);
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }finally {
            fr.close();
            writer2.close();
        }
        return urlCopy;
    }
}
