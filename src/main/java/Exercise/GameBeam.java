package Exercise;

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
    void main(){
        Scanner sc = new Scanner(System.in);

        int nails = sc.nextInt() -1;
        System.out.println("Enter amount of drops");
        int drops = sc.nextInt();
        String[] path = new String[nails * drops];
        int[] balls = new int[nails];

        int numberOfRs = 0;
        for(int i = 0; i < path.length; i++){
            path[i] = getRandomPath();

            if(path[i] == "R"){
                numberOfRs++;
            }

            if((i + 1) % nails == 0){
//                print(path[i], balls);
                balls[numberOfRs]++;
                numberOfRs = 0;
            }

            print(path, numberOfRs);
            print(balls);

        }
    }

    public String getRandomPath(){
        return (int)(Math.random() * 2) == 0 ? "R" : "L";
    }

    public void print(String[] path, int num){
        for(int i = 0; i < path.length; i++){
            System.out.println((i + 1) % num == 0 ? STR."\{path[i]}": STR."\{path[i]}");
        }
    }


    public int print(int[] balls){
        int max = max(balls);
        while(max > 0) {
            for(int i = 0; i < balls.length; i++){
                if(balls[i] > max ){
                    System.out.println("O");
                } else{
                    System.out.println(" ");
                }
            }
        }
        return max;
    }
    public int max(int[] balls){
        int max = 0;
        for(int  i = 0; i < balls.length; i++){
            if(balls[i] > max){
                max = Math.max(balls[i], max);
            }
        }
        return max;
        
    }
}
