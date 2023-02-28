package lesson17Tests;

import org.junit.After;
import java.nio.file.Files;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;


import java.util.Arrays;
import java.io.*;



public class CopyFileServiceTest {

        String url = "C:\\Users\\Lena2\\Desktop\\Hobby_копия.txt";
        String urlCopy;
        File file = new File(url);
        FileReader fr = new FileReader(url);
        FileWriter writer2 = new FileWriter("log.txt", true);

    public CopyFileServiceTest() throws IOException {
    }

    @Before
    public void setUp() throws Exception {

        fr = new FileReader(url);
        writer2 = new FileWriter("log.txt", true);
    }

    @After
    public void tearDown() throws IOException {
fr.close();
writer2.close();
    }

    @Test
    public void copyFileService() throws IOException {

        urlCopy = CopyFileService.copyFileService(url, fr, writer2);
        File fileCopy = new File(urlCopy);
        try {
            byte[] first = Files.readAllBytes(file.toPath());
            byte[] second = Files.readAllBytes(fileCopy.toPath());
            Arrays.equals(first, second);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @Test (expected = RuntimeException.class)
        public void copyFileServiceWrong() throws IOException {
            url = "C:\\Users\\Lena2\\Desktop\\Hobby.html";
            CopyFileService.copyFileService(url, fr, writer2);
           File fileCopy = new File(urlCopy);



    }


}