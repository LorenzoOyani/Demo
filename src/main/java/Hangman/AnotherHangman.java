package Hangman;

//import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class AnotherHangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a guess string: ");

        char[] wordCharacter = getwordCharacter();
        char[] asterisks = new char[wordCharacter.length];
        getCharacterAsterisks(asterisks, wordCharacter);

        int missed = 0;
        String play = " ";
        do {
            do {
                char guess = (char) guessword(asterisks);
                if (!currentGuessString(wordCharacter, asterisks, guess)) {
                    missed++;

                }
//            play = sc.next();

            } while (!GuessingNotOver(asterisks));
            System.out.print("Do you wish to continue? ''y'' for yes and ''no'' for no. ");
            play = sc.next();

            print(wordCharacter, missed);


        } while (play.charAt(0) == 'y');

    }

    static void getCharacterAsterisks(char[] blanks, char[] word) {
        for (int i = 0; i < word.length; i++) {
            blanks[i] = '*';
        }
    }

    static char[] getwordCharacter() {
        String[] words = {"new", "java", "springBoot", "methods", "furnishes"};
        String random = words[(int) (Math.random() * words.length)];
        char[] getWord = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            getWord[i] = random.charAt(0);
        }
        return getWord;
    }

    static int guessword(char[] blanks) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new guess string: ");
        System.out.print(blanks);
        System.out.print('>');
        String guess = sc.next();
        return guess.charAt(0);
    }

    static boolean currentGuessString(char[] word, char[] asterisks, char guess) {
        boolean isPresent = false;
        int message = 2;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                isPresent = true;
            }
            if (asterisks[i] == guess) {
                message = 1;
            } else {
                asterisks[i] = guess;
                message = 0;

            }
        }
        if (message > 0) {
            print(message, guess);
            return isPresent;
        }

        return isPresent;
    }

//    @Contract(pure = true)
    static boolean GuessingNotOver(char[] blanks) {
        for (int e : blanks) {
            if (e == '*') {
                return false;
            }
        }
        return true;
    }

    static void print(int message, char guess) {
        System.out.print("Entered guess is \\t " + guess);
        switch (message) {
            case 1:
                System.out.println("The guess string is not present ");
                break;
            case 2:
                System.out.println("The guess string is present");
        }
    }

    static void print(char[] word, int missed) {
        System.out.print("The word is :");
        System.out.println(word);
        System.out.println("The amount of words missed is ");
        System.out.println(missed);
    }

}