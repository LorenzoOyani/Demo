package others;

import java.util.Scanner;

/**
 * (Game: bean machine) The bean machine, also known as a quince or the Galton
 * box, is a device for statistics experiments named after English scientist Sir
 * Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 * in a triangular form, as shown in Figure 7.13.
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 * has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 * in the slots at the bottom of the board.
 * Write a program that simulates the bean machine. Your program should prompt
 * the user to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path. For example, the path for
 * the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 * (Hint: Create an array named slots. Each element in slots stores the number
 * of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
 * a path is the position of the slot where the ball falls. For example, for the path
 * LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball
 * falls into slots[2].)
 * ***7.22 (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 */


public class GameBeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nails = sc.nextInt() - 1;
        System.out.print("Enter the amount of drops: ");
        int drop = sc.nextInt();
        String[] path = new String[drop * nails];
        int[] balls = new int[nails];

        int numberofRs = 0;

        for (int i = 0; i < path.length; i++) {
            path[i] = getRandomPath();

            if (path[i] == "R") {
                numberofRs++;
            }

            if ((i + 1) % nails == 0) {
                balls[numberofRs]++;
                numberofRs = 0;
            }

        }
        /* method overloading.. */
        print(path, numberofRs);
        print(balls);
    }

    static String getRandomPath() {
     return ((int) (Math.random() * 2) == 0 ? "R" : "L");
    }

    static void print(String[] list, int num) {
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) % num == 0 ? STR."\{list[i]}\n" : STR."\{list[i]} ");
        }

    }

    static void print(int[] balls) {
        int max = max(balls);
        while (max > 0) {
            for (int i = 0; i < balls.length; i++) {
                System.out.println();
                if (balls[i] > max) {
                    System.out.println("O");
                } else {
                    System.out.println(" ");
                }
            }
            max--;
        }

    }

    static int max(int[] balls) {
        int max = balls[0];
        for (int i = 1; i < balls.length; i++) {
            if (balls[i] > max) {
                max = balls[i];
            }
        }
        return max;
    }
}