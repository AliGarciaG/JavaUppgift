package InlamningsUppgift;

import java.util.Scanner;

public class TestProcessor {
    // Deklaration av variabler
    int numberOfWords, numberOfLetters, numberOfLines;
    String allTheWords, longestWord;
    String[] allTheWordsInArray;
    String[] findingMyLongestWord;

    Scanner myScan = new Scanner(System.in);

    // Constructor för att initialisera variabler
    public TestProcessor() {
        allTheWords = "";
        longestWord = "";
    }

    // Metod för att hantera inmatning av ord och räkna antalet rader
    public void setWords(String text) {
        while (!text.contains("stop")) {
            allTheWords = allTheWords.concat(" " + text);
            numberOfLines++;
            text = myScan.nextLine();
        }
    }

    // En metod som bara används för teständamål för att sätta in ord
    public void justToTestSetWords(String text) {
        allTheWords = text;
    }

    // Här hämtas alla ord
    public String getAllTheWords() {
        allTheWords = allTheWords.trim();
        return allTheWords;
    }

    // Hämta antalet ord
    public int getNumberOfWords() {
        if (getAllTheWords().isEmpty()) {
            return 0;
        } else {
            allTheWords = allTheWords.trim();
            allTheWordsInArray = allTheWords.split("\\s+");
            numberOfWords = allTheWordsInArray.length;
            return numberOfWords;
        }
    }

    // Hämta antalet bokstäver
    public int getNumberOfLetters() {
        allTheWords = allTheWords.replaceAll("\\s+", "");
        numberOfLetters = allTheWords.length();
        return numberOfLetters;
    }

    // Hämta antalet rader
    public int getNumberOfLines() {
        return numberOfLines;
    }

    // Hämta det längsta ordet
    public String getLongestWord(String text) {
        findingMyLongestWord = text.split("\\s+");
        for (int i = 0; i < findingMyLongestWord.length; i++) {
            if (longestWord.length() < findingMyLongestWord[i].length()) {
                longestWord = findingMyLongestWord[i];
            }
        }
        return longestWord;
    }

    // Här Skrivs ut en marginal
    public void marginal() {
        System.out.println("********************************************************");
    }
}