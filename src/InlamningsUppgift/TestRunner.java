package InlamningsUppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {
    // Test för att validera getAllTheWords-metoden
    @Test
    public void getAllTheWords() {
        //Arrange - Förbereder testdata och instans av TestProcessor
        TestProcessor myTestPro = new TestProcessor();
        String expected = "";

        //Act -Utför operationen som testas
        myTestPro.setWords("working as usual stop");
        String actual = myTestPro.getAllTheWords();

        //Assert - Jämför förväntat resultat med faktiskt resultat
        assertEquals(expected, actual);
    }

    // Test för att validera getNumberOfWords-metoden
    @Test
    public void getNumbersOfWords() {
        TestProcessor myTestPro = new TestProcessor();
        int expected = 5;

        myTestPro.justToTestSetWords("it is cool to work all day");
        int actual = myTestPro.getNumberOfWords();  //7

        assertEquals(expected, actual);
    }

    // Test för att validera getLongestWord-metoden
    @Test
    public void testGetLongestWord() {

        TestProcessor myTestPro = new TestProcessor();
        String expected = "nice";

        myTestPro.justToTestSetWords("This is a nice program");
        String words = myTestPro.getAllTheWords();
        String actual = myTestPro.getLongestWord(words);

        assertEquals(expected, actual);
    }
}