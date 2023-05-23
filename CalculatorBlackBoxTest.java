public class CalculatorBlackBoxTest {

    private static FileWriter fileWriter;

    @BeforeAll
    public static void setUp() throws IOException {
        // Kreiranje FileWriter objekta za pisanje rezultata testova
        File directory = new File("TEST-RESULTS");
        if (!directory.exists()) {
            directory.mkdir();
        }
        File file = new File("TEST-RESULTS/black-box-test-results.txt");
        fileWriter = new FileWriter(file);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        // Zatvaranje FileWriter objekta nakon izvršenja svih testova
        fileWriter.close();
    }

    @Test
    public void testCalculator_BlackBox() throws IOException {
        // Black box test
        String expression = "10+5*2-4/2";
        String expected = "18";
        String actual = Calculator.Run(expression);
        assertEquals(expected, actual);
        writeTestResult("testCalculator_BlackBox", expected, actual);
    }

    private void writeTestResult(String testName, String expected, String actual) throws IOException {
        // Upisivanje rezultata testa u TEST-RESULTS/black-box-test-results.txt
        fileWriter.write("Test: " + testName + "\n");
        fileWriter.write("Expected: " + expected + "\n");
        fileWriter.write("Actual: " + actual + "\n\n");
    }
}
