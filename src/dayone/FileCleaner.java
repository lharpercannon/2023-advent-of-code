package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public List<String> convertLinesToLowercase() {
        List<String> lowercaseLines = new ArrayList<>();
        lowercaseLines = this.getInputLines().stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        return lowercaseLines;
    }

    public FileReader getInput() {
        return input;
    }

    public void setInput(FileReader input) {
        this.input = input;
    }

    public ArrayList<String> getInputLines() {
        return inputLines;
    }

    public void setInputLines(ArrayList<String> inputLines) {
        this.inputLines = inputLines;
    }
}
