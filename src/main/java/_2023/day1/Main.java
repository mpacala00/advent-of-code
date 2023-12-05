package _2023.day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String filePath = "src/main/resources/adventofcode.com_2023_day_1_input.txt";

    public static void main(String[] args) throws IOException {
        List<String> inputs = getInputListFromFile(filePath);
        System.out.println(calculateSumOfCalibrationValues(inputs));
    }

    private static int calculateSumOfCalibrationValues(List<String> calibrationValueTextList) {
        int sumOfCalibrationValues = 0;

        for (String line : calibrationValueTextList) {
            char[] charArr = line.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : charArr) {
                try {
                    int calibrationValue = Integer.parseInt(String.valueOf(c));

                    if (sb.length() == 2) {
                        sb.replace(1, 2, String.valueOf(calibrationValue));
                    } else {
                        sb.append(calibrationValue);
                    }
                } catch (NumberFormatException nfe) {
                    // continue
                }
            }

            // copy existing number if only 1 occurred
            if (sb.length() < 2) {
                sb.append(sb.charAt(0));
            }

            sumOfCalibrationValues += Integer.parseInt(sb.toString());
        }

        return sumOfCalibrationValues;
    }

    private static List<String> getInputListFromFile(String path) throws IOException {
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