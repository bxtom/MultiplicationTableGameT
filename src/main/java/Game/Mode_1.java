package Game;

public class Mode_1 {

    public static void multiplyTwoInteger() {
        final int MIN_DRAWN_VALUE = 2;
        final int MAX_DRAWN_VALUE = 9;

        System.out.println("Have fun calculating!");
        System.out.println("Type 0 to quit after you are done.\n");

        PlayGame.playGame(MIN_DRAWN_VALUE, MAX_DRAWN_VALUE);
    }
}
