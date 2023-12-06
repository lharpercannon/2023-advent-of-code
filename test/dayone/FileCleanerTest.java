package dayone;
import dayone.FileCleaner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class FileCleanerTest {

    @Test
    void itCanLocateCorrectFile() throws FileNotFoundException {
        FileReader input = new FileReader("./dayoneinput.txt");
        assertNotNull(input);
    }

    @Test
    void itCanReadEachInputLineIntoAnArray() throws FileNotFoundException {
        FileCleaner fileCleaner = new FileCleaner();
        FileReader testInput = new FileReader("./testinput.txt");
        ArrayList<String> inputLines = fileCleaner.convertTextFileToArray(testInput);
        assertEquals(4, inputLines.size());
    }
}
