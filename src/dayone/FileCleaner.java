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

    public List<Integer> removeLettersFromLines(List<String> removeLettersInput) {
        List<Integer> letterlessLines = new ArrayList<>();

        for (String line : removeLettersInput) {
            String processedLine = line.replaceAll("[a-z]","");
            letterlessLines.add(Integer.parseInt(processedLine));
        }

        return letterlessLines;
    }

    public List<Integer> reduceToFirstAndLastNumbers(List<Integer> reduceDigitsInput) {
        List<Integer> twoDigitLines = new ArrayList<>();

        for (Integer line : reduceDigitsInput) {
            String stringLine = line.toString();
            int l = stringLine.length();

            if (l == 1) {
                String doubledLine = String.valueOf(line) + String.valueOf(line);
                Integer convertedLine = Integer.parseInt(doubledLine);
                twoDigitLines.add(convertedLine);
            } else {
                String backToString = line.toString();
                String[] splitLine = backToString.split("");
                String first = splitLine[0];
                String last = splitLine[l-1];
                String combinedLine = first + last;
                Integer intLine = Integer.parseInt(combinedLine);
                twoDigitLines.add(Integer.parseInt(combinedLine));
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
