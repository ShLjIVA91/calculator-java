import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUnitTest {

    private static FileWriter fileWriter;

    @BeforeAll
    public static void setUp() throws IOException {
        // Kreiranje FileWriter objekta za pisanje rezultata testova
        File directory = new File("TEST-RESULTS");
        if (!directory.exists()) {
            directory.mkdir();
        }
        File file = new File("TEST-RESULTS/unit-test-results.txt");
        fileWriter = new FileWriter(file);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        // Zatvaranje FileWriter objekta nakon izvršenja svih testova
        fileWriter.close();
    }

    @Test
    public void testCalculator_Addition() throws IOException {
        // Unit test za sabiranje
        String expression = "2+3";
        String expected = "5";
        String actual = Calculator.Run(expression);
        assertEquals(expected, actual);
        writeTestResult("testCalculator_Addition", expected, actual);
    }

    @Test
    public void testCalculator_Division() throws IOException {
        // Unit test za deljenje
        String expression = "6/3";
        String expected = "2";
        String actual = Calculator.Run(expression);
        assertEquals(expected, actual);
        writeTestResult("testCalculator_Division", expected, actual);
    }

    private void writeTestResult(String testName, String expected, String actual) throws IOException {
        // Upisivanje rezultata testa u TEST-RESULTS/unit-test-results.txt
        fileWriter.write("Test: " + testName + "\n");
