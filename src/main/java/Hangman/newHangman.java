package Hangman;/*
(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as shown in the sample run. Each
letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that", ...};

**/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class newHangman {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        char[] wordCharacters =  getWord();
        char[] asterisks = new char[wordCharacters.length];
        fillAsterisks(asterisks, wordCharacters);


        String play = "";
        int missed = 0;
        do{
            do{
                char guess = (char) guessWord(asterisks);
                if(!currentGuess(wordCharacters,asterisks,guess)) {
                    missed++;
                }
            }while(!isOver(asterisks));

            print(wordCharacters, missed);

            System.out.println("do you want to continue? y for yes and n for no" );

            play = sc.next();

        } while(play.charAt(0) == 'y');

    sc.close();
    }
    static File openFile() {
        File file = new File("hangman.txt");
        if (!file.exists()) {
            System.out.println(STR."file \{file.getName()}does not exist");
            System.exit(1);
        }
        return file;
    }
    static char[] getWord() throws FileNotFoundException {
     File file = openFile();
        ArrayList<String> words = new ArrayList<>();

     try(Scanner sc = new Scanner(file)){
         while(sc.hasNext()){
             words.add(sc.next());
         }

         // pick a random string
         String pick = String.valueOf((int)(Math.random() * words.size()));

         char[] word = pick.toCharArray();

        return word;
     }
    }


    static void fillAsterisks(char[] blanks, char[] wordCharacters) {
        for(int i = 0; i < wordCharacters.length; i++) {
            blanks[i] = '*';
        }
    }

    static int guessWord(char[] blanks) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a guess character: ");
        System.out.print(blanks);
        System.out.print('>');
        String guess = sc.next();
        return guess.charAt(0);
    }
    static boolean currentGuess(char[] characters, char[] blanks, char guess) {
        boolean correct = false;
        int state = 2;

        for(int  i = 0; i < characters.length; i++) {
            if(characters[i] == guess) {
                correct =true;

            }
            if(blanks[i] ==guess) {
                state = 1;
            }else {
                blanks[i] = guess;
                state = 0;
            }
        }
        if(state > 0) {
            print(state,guess);
            return correct;
        }
        return correct;
    }

    static boolean isOver(char[] blanks) {
        for(int e : blanks) {
            if(e == '*') {
                return false;
            }
        }
        return true;
    }
    static void print(int message, char guess) {
        System.out.print("\t" + guess);
        switch(message) {
            case 1: System.out.println("is already in the word"); break;
            case 2: System.out.println("not in the word");
        }
    }
    static void print(char[] word, int missed) {
        System.out.print(("The word is: "));
        System.out.print(word);
        System.out.println("You've missed " + missed + " times");
    }


}