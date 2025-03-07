import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.find;
import static java.nio.file.Files.readAllLines;


public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("./AoC1.txt");
        Path sourcePath = FileSystems.getDefault().getPath("F:/Code Projects/Java/Advent of Code/AoC1/AoC1.txt");
        List<String> sourceList = readAllLines(sourcePath);
        System.out.println(sourceList.size());

        String[] sArr;

        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Sourcelist: " +sourceList.get(0));


        for (String s : sourceList) {
            sArr = s.split("   ");
            System.out.println("sArr0 : "+sArr[0]);
            listA.add(sArr[0]);
            listB.add(sArr[1]);
        }

        System.out.println("ListA : " + listA);
        System.out.println("ListB : " + listB);

        listA.sort(null);
        listB.sort(null);

        int totalDistance = 0;

        for(int i = 0; i < listA.size(); i++) {
            int a = Integer.parseInt(listA.get(i));
            int b = Integer.parseInt(listB.get(i));
            int distance = 0;
                if (a < b) {
                    distance = b - a;
                } else {
                    distance = a - b;
                }
            totalDistance = totalDistance + distance;
        }
        System.out.println("Total Distance = " + totalDistance);
    }
}

