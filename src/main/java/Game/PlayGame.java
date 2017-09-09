package Game;

import java.util.Random;
import java.util.Scanner;

class PlayGame {
    static void playGame(int min, int max) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int userAnswer;
        int attempt = 0;
        int score = 0;

        do {
            int randomNumber_1 = min + (random.nextInt(max - 1));
            int randomNumber_2 = min + (random.nextInt(max - 1));
            int multiplyResult = (randomNumber_1 * randomNumber_2);

            do {
                System.out.print(randomNumber_1 + " * " + randomNumber_2 + " = ");
                userAnswer = scanner.nextInt();
                if (userAnswer == multiplyResult) {
                    attempt++;
                    score++;
                } else
                    System.out.println("Wrong! Try again!");

                attempt++;
            } while ((userAnswer != multiplyResult) && (userAnswer != 0));

        } while (userAnswer != 0);

        double correctAnswers = Math.round(((double) score / (attempt-1) * 100));

        // (attempt - 1) because if userAnswer == 0, then attempt still gets ++;
        System.out.println("\nYour score is: " + score + "/" + (attempt - 1) +
                "\nCorrect answers: " + correctAnswers + "%");
    }
}
