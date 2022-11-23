package by.it_academy.lesson12.task1;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Write {
    public static void main(String[] args) {
        List<Integer> numbers = readFile();
        System.out.println(numbers);
        List<Integer> cubes = cubes(numbers);
        fileWriter(cubes);
    }

    private static List<Integer> readFile() {
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("src/main/java/by/it_academy/lesson12/task1/text.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        ;
        return list;
    }

    private static List<Integer> cubes (List<Integer> numbers){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            newList.add(numbers.get(i) * numbers.get(i) * numbers.get(i));
        }
            return newList;
    }

    private static void fileWriter(List<Integer> newlist){
        try (FileWriter newFile = new FileWriter("src/main/java/by/it_academy/lesson12/task1/output.txt")){
          for (int i = 0; i < newlist.size(); i++){
              final String string = Integer.toString(newlist.get(i));
              newFile.write(string);
              newFile.write(System.lineSeparator());
          }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
