package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.regex.*;


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

    public List<String> convertLinesToLowercase(List<String> input) {
        List<String> lowercaseLines = new ArrayList<>();
        lowercaseLines = input.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        return lowercaseLines;
    }

    public List<String> removeLettersFromLines(List<String> removeLettersInput) {
        List<String> letterlessLines = new ArrayList<>();

        for (String line : removeLettersInput) {
            String processedLine = line.replaceAll("[a-z]","");
            letterlessLines.add(processedLine);
        }

        return letterlessLines;
    }

    public List<String> reduceToFirstAndLastNumbers(List<String> reduceDigitsInput) {
        List<String> twoDigitLines = new ArrayList<>();

        for (String line : reduceDigitsInput) {
            int l = line.length();

            if (l == 1) {
                String doubledLine = String.valueOf(line + line);
                twoDigitLines.add(doubledLine);
            } else {
                char firstCharacter = line.charAt(0);
                char lastCharacter = line.charAt(l - 1);
                String combinedLine = String.valueOf(firstCharacter + lastCharacter);
                twoDigitLines.add(combinedLine);
            }
        }
        return twoDigitLines;
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
