package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        FileCleaner fileCleaner = new FileCleaner();
        FileReader input = new FileReader("./dayoneinput.txt");
        List<String> inputStepTwo = fileCleaner.convertTextFileToArray(input);
        List<String> inputStepThree = fileCleaner.convertLinesToLowercase(inputStepTwo);
        List<Integer> inputStepFour = fileCleaner.removeLettersFromLines(inputStepThree);
        List<Integer> inputStepFive = fileCleaner.reduceToFirstAndLastNumbers(inputStepFour);
        Integer result = fileCleaner.sumArrayElements(inputStepFive);
        System.out.println("The total is: " + result);


    }
}
