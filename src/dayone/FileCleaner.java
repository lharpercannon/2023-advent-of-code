package dayone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileCleaner {

    private FileReader input;
    public void readInTextFile() throws FileNotFoundException {
        input = new FileReader("./dayoneinput.txt");
    }

    public void convertTextFileToArray() throws FileNotFoundException {

        Scanner scanner = new Scanner(input);
    }
}
