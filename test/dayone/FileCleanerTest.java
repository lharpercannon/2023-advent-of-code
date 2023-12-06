package dayone;
import dayone.FileCleaner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


public class FileCleanerTest {

    List<String> linesToLowercase = new ArrayList<>();

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

    @Test
    void itCanConvertLinesToLowercase() {
        FileCleaner fileCleaner = new FileCleaner();
        linesToLowercase.add("AKsjjlkA");
        linesToLowercase.add("AAA");
        List<String> lowercaseLines = fileCleaner.convertLinesToLowercase(linesToLowercase);
        assertTrue(lowercaseLines.contains("aksjjlka"));
        assertTrue(lowercaseLines.contains("aaa"));
    }
}
