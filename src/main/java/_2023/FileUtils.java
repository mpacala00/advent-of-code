package _2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static List<String> readLinesFromFile(String path) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        Scanner sc = new Scanner(fis);
        List<String> inputs = new ArrayList<>();

        while (sc.hasNextLine()) {
            inputs.add(sc.nextLine());
        }
        sc.close();

        return inputs;
    }
}
