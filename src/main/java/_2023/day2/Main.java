package _2023.day2;

import _2023.FileUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String filePath = "src/main/resources/adventofcode.com_2023_day_2_input.txt";
    public static final String COLON = ":";
    public static final String SEMICOLON = ";";
    public static final String COMMA = ",";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> inputs = FileUtils.readLinesFromFile(filePath);
        System.out.println("Sum: " + calculateSumOfValidGamesIDs(inputs));
    }

    private static int calculateSumOfValidGamesIDs(List<String> inputs) {
        for (String game : inputs) {
//            System.out.println(game);
            String[] splitGame = game.split(COLON);

//            System.out.println("======================\nSPLITTED GAME:");
//            for (String s : splitGame) {
//                System.out.println(s);
//            }

            String gameId = String.valueOf(splitGame[0].toCharArray()[splitGame[0].length() - 1]);
            System.out.println("======================\nGAME ID: " + gameId);

            List<Map<String, Integer>> listOfColorToCountMaps = new ArrayList<>();
            Map<String, Integer> colorToCountMap = new HashMap<>();
            System.out.println("======================\nSPLITTED GAME ROUNDS:");
            String[] splitGameRounds = splitGame[1].split(SEMICOLON);
            for (int i = 0; i < splitGameRounds.length; i++) {
                System.out.println(splitGameRounds[i]);
                String[] splitGameRoundsOneRound = splitGameRounds[i].split(COMMA);
                for (String s : splitGameRoundsOneRound) {
                    s = s.trim();
                    String[] splittedRound = s.split(" ");
                    System.out.println("splitted round" + Arrays.toString(splittedRound));
//                    colorToCountMap.put(splittedRound[1], Integer.parseInt(splittedRound[0]));
                    Map<String, Integer> map = new HashMap<>();
                    map.put(splittedRound[1], Integer.parseInt(splittedRound[0]));
                    listOfColorToCountMaps.add(map);
                    //splittedRound[1], Integer.parseInt(splittedRound[0]
                }
            }

            System.out.println("======================\nONE ROUND PUT INTO MAP:");
            System.out.println(listOfColorToCountMaps);

            break;
        }

        return 0;
    }
}
