package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileCleaner {

    private FileReader input;
    ArrayList<String> inputLines = new ArrayList<>();

    public void readInTextFile() throws FileNotFoundException {
        input = new FileReader("./dayoneinput.txt");
    }

    public ArrayList<String> convertTextFileToArray() throws FileNotFoundException {

        Scanner inputScanner = new Scanner(input);
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            inputLines.add(line);
        }

        return inputLines;
    }
}
