import java.util.Scanner;

public class Week_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Madlibs Generator! Before we begin please choose a template.");
        System.out.println("1");
        System.out.println("2");
        System.out.println("> ");
        String template = scanner.nextLine();
        
        System.out.println("You have chosen template" + template + "Follow the prompts below to complete story generation");

        System.out.println();
        scanner.close();

        
    }
}