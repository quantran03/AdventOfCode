package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> processedInput(File input) throws FileNotFoundException {
        ArrayList<String> output = new ArrayList<>();
        Scanner scanner = new Scanner(input);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            output.add(line);
        }

        return output;
    }

    public static void main(String[] args) {
        //Input shenanigans
        File file = new File("./src/com/company/Day11Input.txt");
        ArrayList<String> input = null;

        try {
            input = processedInput(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Day11 task = new Day11();

        System.out.println(task.solve2(input));

    }
}
