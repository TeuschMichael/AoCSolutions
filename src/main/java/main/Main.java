package main;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;


public class Main {

    public static void main(String[] args) throws Exception {


        List<String> sourceList = Files.readAllLines(Path.of("AoC1.txt"));
        System.out.println(sourceList.size());



        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Sourcelist: " +sourceList.get(0));


        for (String s : sourceList) {
            String[] sArr = s.split("   ");
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
            totalDistance +=  (a < b) ? b - a : a - b;
        }
        System.out.println("Total Distance = " + totalDistance);
    }
}

