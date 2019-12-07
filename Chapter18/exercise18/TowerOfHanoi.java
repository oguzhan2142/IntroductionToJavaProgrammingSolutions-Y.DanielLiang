package exercise18;

import java.util.Scanner;

public class TowerOfHanoi {

    public static int runCounter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of disks:");
        int disks = scanner.nextInt();

        System.out.println("The moves are:");
        moveDisks(disks, 'A', 'B', 'C');

        System.out.println("program run " + runCounter + " times.");

    }


    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {

        runCounter++;
        if (n == 1) //stopping condition
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }

    }
}
