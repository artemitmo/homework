package MapHW;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TheBook {
    File file1 = new File("src/wp.txt");
    List<String> strings = Files.readAllLines(file1.toPath());

    //создали лист
    public TheBook () throws IOException {
    }

    public static void main ( String[] args ) throws IOException {
        TheBook book = new TheBook();
        List<String> arrayList = new ArrayList<>();
        for (String string : book.strings) {
            String[] strings1 = string
                    .replaceAll("\\p{Punct}" , "")
                    .trim()
                    .split(" ");

            for (String s : strings1) {
                if (s.length() > 0) {
                    arrayList.add(s);
                }
            }
        }

        System.out.println("Введите слово для поиска в книге: ");
        Scanner scn = new Scanner(System.in);
        String wordSearch = scn.nextLine();
        wordSearch = wordSearch.toLowerCase().replaceAll("[^a-zA-Z- ]" , "");
        Map<String, Integer> newMap = new HashMap<>();

        for (String word : arrayList) {
            if (newMap.containsKey(word)) {
                newMap.put(word , (newMap.get(word)) + 1);
            } else {
                newMap.put(word , 1);
            }
        }
        System.out.println(newMap.get(wordSearch));
        lettersFrequency(arrayList);
    }

    public static void lettersFrequency ( List<String> list ) {
        /*
        Вывести частоту встречаемости букв анг алфавита по этой книге.
        Вывести в процентах для каждой буквы.
         */

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //массив char букв алфавита

        TreeMap<String, Double> tempTreeMap = new TreeMap<>();
        double sumOfWords = 0;
        for (int i = 0; i < alphabet.length; i++) {

            for (String each : list) {
                String currentStr = each.replaceAll("[^A-Za-z]" , "").toLowerCase();
                String currentWord = String.valueOf(alphabet[i]);
                double wordsAmount = currentStr.length() - currentStr.replaceAll(currentWord , "").length();

                if (tempTreeMap.containsKey(currentWord)) {
                    tempTreeMap.put(currentWord , tempTreeMap.get(currentWord) + wordsAmount);
                    sumOfWords += wordsAmount;
                } else {
                    tempTreeMap.put(currentWord , wordsAmount);
                    sumOfWords += wordsAmount;
                }
            }
        }

        for (Map.Entry<String, Double> entry : tempTreeMap.entrySet()) {
            entry.setValue(((100 * entry.getValue()) / sumOfWords));
            entry.setValue(((double) Math.round((long) (entry.getValue() * 100)) / 100));
            System.out.println("Символ '" + entry.getKey() + "' занимает " + entry.getValue() + " процентов от объема текста.");

        }

    }
}