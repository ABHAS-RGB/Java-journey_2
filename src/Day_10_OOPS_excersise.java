import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;
    private int usernumber;
    private int noofguess = 0;

    public int getNoofguess() {
        return noofguess;
    }

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100) + 1; // 1–100
    }

    void userinput(Scanner sc) {
        System.out.println("Guess the number:");
        usernumber = sc.nextInt();
    }

    boolean iscorrectnumber() {
        noofguess++;
        if (number == usernumber) {
            System.out.println("You guessed it right! " + number +
                    " in " + noofguess + " attempts.");
            return true;
        } else if (number < usernumber) {
            System.out.println("Too high...");
        } else {
            System.out.println("Too low...");
        }
        return false;
    }
}

public class Day_10_OOPS_excersise {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        Scanner sc = new Scanner(System.in);

        while (!b) {
            g.userinput(sc);
            b = g.iscorrectnumber();
        }

        sc.close();
    }
}
