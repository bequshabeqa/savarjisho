import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("შეიყვანეთ რიცხვი 1-დან 50-ჩათვლით");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(50) + 1;
        int userGuess = 0;


        while (userGuess != randomNumber) {
            System.out.print("შენი ციფრი:");
            userGuess = scanner.nextInt();

            if (userGuess > 50) {
                System.out.println("არჩეული რიცხვი აჭარბებს 50-ს, შეიყვანეთ რიცხვი 1-დან 50-ჩათვლით ");
            } else if (userGuess < randomNumber) {
                System.out.println("არჩეული რიცხვი ნაკლებია, კიდევ სცადე");

            } else if (userGuess > randomNumber) {
                System.out.println("არჩეული რიცხვი მეტია, კიდევ სცადე");

            } else if (userGuess != randomNumber) {
            System.out.println("არჩეული რიცხვი აჭარბებს 50-ს");

            } else {
                System.out.println(" გილოცავ, არჩეული რიცხვი ემთხვევა თქვენის რიცხვს " + randomNumber);
            }
        }
    }
}

//Write a program that generates a random number between 1 and 50. The user
//should guess the number. After each guess, the program should indicate whether
//the guess was too high, too low, or correct. The game continues until the user
//guesses the correct number.