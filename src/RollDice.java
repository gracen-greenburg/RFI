// Gracen Greenburg 2025

/*
 * This program allows the user to select which dice to roll from a selection of
 * d4, d6, d8, d10, d12, and d20. 
 * 
 * It then rolls the dice and gives the user a random number based on the die selected.
 */

import java.util.Random;
import java.util.Scanner;

public class RollDice {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select which dice to roll:");
        System.out.println("1. d4\n2. d6\n3. d8\n4. d10\n5. d12\n6. d20");

        int die = scanner.nextInt();

        dieSelect(die);
    }

    public static int dieSelect(int die) {
        Random random = new Random();
        int roll = 0;

        switch (die) {
            case 1:
                roll = random.nextInt(4) + 1; 
                break;
            case 2:
                roll = random.nextInt(6) + 1; 
                break;
            case 3:
                roll = random.nextInt(8) + 1; 
                break;
            case 4:
                roll = random.nextInt(10) + 1; 
                break;
            case 5:
                roll = random.nextInt(12) + 1; 
                break;
            case 6:
                roll = random.nextInt(20) + 1;
                break;
            default:
                System.out.println("Invalid selection.");
                break;
        }
        System.out.println("Result: " + roll);
        return roll;
    }

}