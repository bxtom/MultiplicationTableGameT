package Game;

import java.util.Scanner;

public class Mode_2 {

    public static void multiplyTwoSpecifiedValues(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit after you are done.\n");
        System.out.println("Please specify values range you want to practise with:");

        System.out.print("MIN value = ");
        int userInputMinRange1 = scanner.nextInt();

        System.out.print("MAX value = ");
        int userInputMaxRange2 = scanner.nextInt();

        PlayGame.playGame(userInputMinRange1, userInputMaxRange2);
    }
}