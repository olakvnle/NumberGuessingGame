import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Random Number = new Random();
        int RandNumber = Number.nextInt(10, 99) + 1;
        System.out.print("I'm guessing you were born 19" + RandNumber);
        System.out.print(" you'd definitely guess right.\n");
        int tryCount = 0;
        for (int Y = 0; Y <= 10; Y++) {
            Scanner SC = new Scanner(System.in);
            int X;
            for (X = 0; X <= 10; X++) {
            }
            System.out.println();
            System.out.println("Input your guess below");
            System.out.println("Hint - From 1 to 100");
            System.out.println("Good Luck!\n ");
            System.out.print("Number: ");
            int Scanner = SC.nextInt();
            tryCount++;
            System.out.println();
            if (RandNumber == Scanner) {
                System.out.println("Fantastic! You Guessed Right!\n");
                System.out.println("it took you " + tryCount + " times to get it right!\n");
                break;
            } else if (RandNumber > Scanner) {
                System.out.println("Nope! Number is Higher!\n");
            } else if (RandNumber < Scanner) {
                System.out.println("Nope! Number is Lower!\n");
            }
            if (RandNumber == Scanner) {
            } else if (Scanner > RandNumber && Scanner >= RandNumber + X) {
                System.out.println("You were close though! Go a Little Bit Lower. \n\nGuess Again! \n");
            } else if (Scanner < RandNumber && Scanner <= RandNumber - X) {
                System.out.println("You were close though! Go a Little Higher.\n\nGuess Again! \n");
            } else {
                System.out.println("Try Again!\n");
            }
        }
    }
}