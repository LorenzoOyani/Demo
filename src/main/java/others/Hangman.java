package others;

import java.util.Scanner;

class Hangman{
    private static String[] words = {"discipline", "kindness", "Loving", "attachment"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisks = new String(new char[word.length()]).replace('\0', '*');
    private static  int count =0;

//            char[] a = new char[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisks.contains("*")) {

            System.out.print("Enter a guess character: ");
            System.out.println(asterisks);
            String guess =sc.nextLine();
            hang(guess);

        }
        sc.close();

    }
    static void hang(String guess) {
        String newestStrings = " ";
        for (int  i =0; i < guess.length(); i++) {
            if(word.charAt(i) ==guess.charAt(0)) {
                newestStrings += "*";


            } else if(word.charAt(i) != '*') {
                newestStrings += word.charAt(i);
            }else {
                newestStrings +='*';
            }
        }
        if(asterisks.equals(newestStrings)) {
            count++;
            HangmanImage();

        }else {
            asterisks = newestStrings;
        }
        if(asterisks.equals(word)) {
            System.out.println(STR."correct! You win! the word is \{word}");
        }
    }
    public static void HangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }

}
