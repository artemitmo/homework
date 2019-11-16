package WarPeace;

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
        ArrayList <String> arrayList = new ArrayList<>();
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
        Map<String, Integer> newMap = new HashMap<>();

        for (String word: arrayList){
            if (newMap.containsKey(word)){
                newMap.put(word, (newMap.get(word)) + 1);
            } else {
                newMap.put(word, 1);
            }
        }
        System.out.println(newMap.get(wordSearch));
    }
}