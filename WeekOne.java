import java.util.Scanner;
import java.util.Random;

public class WeekOne{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("To begin, please set the maximum value you wish to guess from:");
        int maximum = Integer.valueOf(scan.nextLine());
        int upperrange = maximum + 1;
        System.out.println("The range of possible answers is from 0 - " + maximum);
        int number_to_guess = rand.nextInt(upperrange);

        int guess = -1;

        while(guess != number_to_guess){
            System.out.println("Guess the number!! Type 'STOP' to end the game");
            String the_guess = scan.nextLine();
            if (the_guess.equals("STOP")){
                guess = number_to_guess;
            }
            else {
                guess = Integer.valueOf(the_guess);


            if (guess == number_to_guess){
                System.out.println("You did it!");
            }
           else if (guess < number_to_guess) {
            System.out.println("Too small");
           } 
           else if (guess > number_to_guess) {
            System.out.println("Too large");
           }
            }
            
        }
        System.out.println("The number was " + number_to_guess);
        System.out.println("Thank you for playing!");

        scan.close();
    }
}