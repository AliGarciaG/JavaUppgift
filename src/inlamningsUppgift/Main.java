// Namn: Alí García
// Programmet hanterar inläsning av text och kan räkna antalet inmatade ord, bokstäver, rader, etc.
// Version 1.0
// Datum: 2023-11-20
package inlamningsUppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Här deklereras variabler för textbehandling
        String myText, allTheWords, longestWord;
        int numberOfLines, numberOfLetters, numberOfWords;

        // Här skapas en instans av TestProcessor-klassen och en Scanner för inmatning
        TestProcessor myTextProcessor = new TestProcessor();
        Scanner myScan = new Scanner(System.in);

        //Här begärs användarens inmatning av ord
        System.out.println("Please, write some words, one word, followed by enter: ");
        System.out.println("To quit, please write the word stop.");
        myText = myScan.nextLine();

        // Här används TestProcessor för att behandla texten
        myTextProcessor.setWords(myText);
        allTheWords = myTextProcessor.getAllTheWords();
        numberOfWords = myTextProcessor.getNumberOfWords();
        numberOfLetters = myTextProcessor.getNumberOfLetters();
        numberOfLines = myTextProcessor.getNumberOfLines();
        longestWord = myTextProcessor.getLongestWord(allTheWords);

        // Här skrivs ut resultatet och information om textbehandlingen
        myTextProcessor.marginal();
        System.out.println("Text Processor");
        myTextProcessor.marginal();
        System.out.println("The words are: " + allTheWords + "\nThe longest word is: " + longestWord +
                "\nThe number of words: " + numberOfWords + "\nThe number of letters are: " + numberOfLetters +
                "\nThe number of lines are: " + numberOfLines);
        myTextProcessor.marginal();
    }
}