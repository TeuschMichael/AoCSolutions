import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static java.nio.file.Files.find;
import static java.nio.file.Files.readAllLines;


public class Main {

    public static void main(String[] args) throws Exception {


        Path sourcePath = FileSystems.getDefault().getPath("F:/Code Projects/Java/Advent of Code/AoC1/AoC2.txt");
        List<String> sourceList = readAllLines(sourcePath);

        System.out.println("Source size is : " + sourceList.size());

        List<Integer> intSourceList = new ArrayList<>();
        String[] iArr;

        boolean safetyCheck = false;
        int nrOfSave = 0;

        for (String s : sourceList) {
            intSourceList.clear();
            System.out.println(s);
            iArr = s.split(" ");

            for (String e : iArr) {
                intSourceList.add(Integer.parseInt(e));
            }
            System.out.println(" Integer List is size : " + intSourceList.size());

            safetyCheck = isOrdered(intSourceList);
            System.out.println("List is save :" + safetyCheck);
            if (safetyCheck == true){
                nrOfSave = nrOfSave + 1;
            }
            System.out.println(nrOfSave);

        }
    }



    public static boolean isOrdered(List<Integer> numbers) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < numbers.size(); i++) {
            int diff = numbers.get(i) - numbers.get(i - 1);
            if (Math.abs(diff) > 3 || Math.abs(diff) < 1) {
                return false;
            }
            if (numbers.get(i) > numbers.get(i - 1)) {
                decreasing = false;
            } else if (numbers.get(i) < numbers.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

}




