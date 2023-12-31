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

    @Test
    void itCanRemoveLettersFromLines() {
        FileCleaner fileCleaner = new FileCleaner();
        List<String> lines = new ArrayList<>();
        lines.add("lh25jhk02nkjh2");
        lines.add("4Fnkj22");
        List<String> lowercasedLines = fileCleaner.convertLinesToLowercase(lines);
        List<Integer> processedLines = fileCleaner.removeLettersFromLines(lowercasedLines);
        assertTrue(processedLines.contains(25022));
        assertTrue(processedLines.contains(422));
    }

    @Test
    void itCanReduceLinesToTwoCharacters() {
        FileCleaner fileCleaner = new FileCleaner();
        List<Integer> lines = new ArrayList<>();
        lines.add(3251235);
        lines.add(2351);
        lines.add(1);
        List<Integer> reducedLines = fileCleaner.reduceToFirstAndLastNumbers(lines);
        assertTrue(reducedLines.contains(35));
        assertTrue(reducedLines.contains(21));
        assertTrue(reducedLines.contains(11));

    }

    @Test
    void itCanSumUpElementsOfArray() {
        FileCleaner fileCleaner = new FileCleaner();
        List<Integer> lines = new ArrayList<>();
        lines.add(4);
        lines.add(1);
        lines.add(1);
        lines.add(1);
        List<Integer> processedLines = fileCleaner.reduceToFirstAndLastNumbers(lines);
        assertEquals(77, fileCleaner.sumArrayElements(processedLines));
    }
}
