package per.itachi.java.test.spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Entry {

    public static void main(String[] args) {
        int bufferSize = 32 * 1024;
        Path path = Paths
                .get("D:\\document\\requirement\\spring 2022.03.1 ocr");
        Path input = Paths.get(path.toString(), "ocr-bankcard-24e3e0fbbb4a4240a3b4d1989e6f1677-base64.txt");
        Path output = Paths.get(path.toString(), "ocr-bankcard-24e3e0fbbb4a4240a3b4d1989e6f1677-data.dat");
        try(BufferedReader br = Files.newBufferedReader(input);
            OutputStream fos = Files.newOutputStream(output)) {
            String line = null;
            byte[] buffer = null;
            while ((line = br.readLine()) != null) {
                buffer = Base64.getDecoder().decode(line);
                fos.write(buffer);
                fos.flush();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

