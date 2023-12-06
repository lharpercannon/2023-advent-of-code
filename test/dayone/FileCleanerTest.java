package dayone;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class FileCleanerTest {

    @Test
    void itCanLocateCorrectFile() throws FileNotFoundException {
        FileReader input = new FileReader("./dayoneinput.txt");
        assertNotNull(input);
    }


}
