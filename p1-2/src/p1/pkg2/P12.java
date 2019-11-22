/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1.pkg2;
import java.util.*;

/**
 *
 * @author User
 */
public class P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("QUESTION 1");
        String string1 = "";
        System.out.println("Type a string.");
        string1 = scan.nextLine();
        System.out.println("Uppercase: " + string1.toUpperCase());
        System.out.println("Lowercase: " + string1.toLowerCase());
        System.out.println("Character at index 4: " + string1.charAt(4));
        System.out.println("Index of m: " + string1.indexOf('m'));
        System.out.println("Length of string: " + string1.length());
        System.out.println();
        System.out.println("QUESTION 2");
        String searchLine;
        char searchChar;
        int numOccurrences = 0;
        System.out.println("Enter a line of code to search in.");
        searchLine = scan.nextLine();
        System.out.println("Enter  a character to search for (Will use the first character in the line).");
        searchChar = scan.nextLine().charAt(0);
        for (int i = 0; i < searchLine.length(); i++)
        {
            if (searchLine.charAt(i) == searchChar)
            {
                numOccurrences++;
            }
        }
        System.out.println("Number of time the character occurs in the line: " + numOccurrences);
        System.out.println();
        System.out.println("QUESTION 3");
        System.out.println("Enter a string.");
        String string3 = scan.nextLine();
        System.out.print("Reversed: ");
        for (int i = string3.length(); i > 0; i--)
        {
            System.out.print(string3.charAt(i-1));
        }
        System.out.println();
        System.out.print("First word: ");
        for (int i = 0; i < string3.length(); i++)
        {
            if (string3.charAt(i) != ' ')
            {
                System.out.print(string3.charAt(i));
            }
            else
            {
                break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 4");
        System.out.println("Enter a 10 digit telephone number");
        String phoneNumber = scan.nextLine();
        while (phoneNumber.length() != 10)
        {
            if (phoneNumber.length() > 10)
            {
                System.out.println("Too long. Try again.");
                phoneNumber = scan.nextLine();
            }
            else
            {
                System.out.println("Too short. Try again.");
                phoneNumber = scan.nextLine();
            }
        }
        System.out.println("The area code is: " + phoneNumber.substring(0, 3));
        System.out.println("The exchange is: " + phoneNumber.substring(3, 6));
        System.out.println("The number is: " + phoneNumber.substring(6, 10));
        System.out.println("The phone number is: " + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10));
        System.out.println();
        System.out.println("QUESTION 5");
        String firstName, middleName, lastName;
        System.out.println("Enter a first name.");
        firstName = scan.nextLine();
        System.out.println("Enter a middle name.");
        middleName = scan.nextLine();
        System.out.println("Enter a last name.");
        lastName = scan.nextLine();
        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        System.out.println();
        System.out.println("QUESTION 6");
        System.out.println("Enter a two-word name.");
        String twoWordName = scan.nextLine();
        int spaceLocation = twoWordName.indexOf(' ');
        String wordOne = twoWordName.substring(0, spaceLocation);
        String wordTwo = twoWordName.substring(spaceLocation + 1, twoWordName.length());
        System.out.print(wordOne.substring(0, 1).toUpperCase());
        System.out.print(wordOne.substring(1, wordOne.length()).toLowerCase() + " ");
        System.out.print(wordTwo.substring(0, 1).toUpperCase());
        System.out.println(wordTwo.substring(1, wordTwo.length()).toLowerCase());
        System.out.println();
        System.out.println("QUESTION 7");
        System.out.println("Enter a word.");
        String word7 = scan.nextLine();
        String reverse = "";
        for (int i = word7.length(); i > 0; i--)
        {
            reverse = reverse + word7.charAt(i-1);
        }
        if (word7.equals(reverse))
        {
            System.out.println("This is a palindrome.");
        }
        else
        {
            System.out.println("This is not a palindrome.");
        }
        System.out.println();
        System.out.println("QUESTION 8");
        System.out.println("Enter a word.");
        String noVowels = scan.nextLine();
        System.out.print("The word without vowels: ");
        for (int i = 0; i < noVowels.length(); i++)
        {
            if (noVowels.charAt(i) != 'a' && noVowels.charAt(i) != 'e' && noVowels.charAt(i) != 'i' && noVowels.charAt(i) != 'o' && noVowels.charAt(i) != 'u' && noVowels.charAt(i) != 'A' && noVowels.charAt(i) != 'E' && noVowels.charAt(i) != 'I' && noVowels.charAt(i) != 'O' && noVowels.charAt(i) != 'U')
            {
                System.out.print(noVowels.charAt(i));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 9");
        System.out.println("Enter the sentinal word (the one that will end the list)");
        String sentinalWord = scan.nextLine();
        System.out.println("Now add mode words to the list. Type the sentinal word again to end the list.");
        String lastAlpha = sentinalWord, newWord = "";
        while (!newWord.equalsIgnoreCase(sentinalWord))
        {
            newWord = scan.nextLine();
            if (newWord.toLowerCase().compareTo(lastAlpha.toLowerCase()) > 0)
            {
                lastAlpha = newWord;
            }
        }
        System.out.println("The last word alphabetically is " + lastAlpha);
        System.out.println();
        System.out.println("QUESTION 10");
        System.out.println("Enter a line of text.");
        String line = scan.nextLine();
        StringTokenizer tokenLine = new StringTokenizer(line);
        System.out.println("The number of tokens is " + tokenLine.countTokens());
        System.out.println("The tokens are:");
        while (tokenLine.hasMoreTokens())
        {
            System.out.println(tokenLine.nextToken());
        }
        System.out.println();
        System.out.println("QUESTION 11");
        System.out.println("Input a sentence.");
        String sentence = scan.nextLine();
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(i) != ',' && sentence.charAt(i) != '.' && sentence.charAt(i) != ':' && sentence.charAt(i) != ';' && sentence.charAt(i) != '\'' && sentence.charAt(i) != '?' && sentence.charAt(i) != '!' && sentence.charAt(i) != '(' && sentence.charAt(i) != ')' && sentence.charAt(i) != '"')
            {
                System.out.print(sentence.charAt(i));
            }
        }
        System.out.println();

    }
    
}
