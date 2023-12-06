package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileCleaner {

    private FileReader input;
    ArrayList<String> inputLines = new ArrayList<>();

    public FileCleaner() {

    }

    public void readInTextFile() throws FileNotFoundException {
        input = new FileReader("./dayoneinput.txt");
    }

    public ArrayList<String> convertTextFileToArray(FileReader input) throws FileNotFoundException {
        Scanner inputScanner = new Scanner(input);
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            inputLines.add(line);
        }
        return inputLines;
    }

    public void convertLinesToLowercase() {
        ArrayList<String> lowercaseLines = new ArrayList<>();
        lowercaseLines = inputLines.stream().filter(inputLines -> {
            inputLines.toLowerCase()
        });
    }


}
