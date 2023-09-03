import java.util.Scanner;

public class WeekZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's start with our nouns, pick two proper nouns, one place, and one object.");
        System.out.println("- ");
        String proper_noun1 = scanner.nextLine();
        System.out.println("- ");
        String proper_noun2 = scanner.nextLine();
        System.out.println("- ");
        String noun1 = scanner.nextLine();
        System.out.println("- ");
        String noun2 = scanner.nextLine();

        System.out.println("Now let's add some verbs. Put all verbs in the past tense");
        System.out.println("- ");
        String verb1 = scanner.nextLine();
        System.out.println("- ");
        String verb2 = scanner.nextLine();
        System.out.println("- ");
        String verb3 = scanner.nextLine();
    
        
        System.out.println("Now finally pick three adjetives");
        System.out.println("- ");
        String ad1 = scanner.nextLine();
        System.out.println("- ");
        String ad2 = scanner.nextLine();
        System.out.println("- ");
        String ad3 = scanner.nextLine();

        
            System.out.println("Today " + proper_noun1 + " and I were going to a " + noun1 + ".");
            System.out.println("There just so happened to be a soccer match going on there: The " + noun2 + "s vs. " + proper_noun2 + ".");
            System.out.println("The players on The " + noun2 + "s were particularly " + ad1 + ". The players on " + proper_noun2 + "? Not so much.");
            System.out.println("Even if the players on " + proper_noun2 + " weren't as " + ad1 + " (or as" + ad2 + " either), they definetly " + verb1 + " and " + verb2 + " better.");
            System.out.println("The game was about to come to a close when " + proper_noun1 + verb3 + ".");
            System.out.println("Due to the disrupton the crowd became very" + ad3 + ".");


        System.out.println(" ");
        System.out.println("Thank you for using MadLibs Generator");
        
        scanner.close();

        
    }
}
