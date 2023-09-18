import java.util.Scanner;

public class WeekTwo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        //broilerplate + Scanner setup        
        
        System.out.println("Welcome to Palindrome Checker! Please enter the word you would like to check.");
        String palimaybe = scan.nextLine();
        scan.close();
        //takes input from user on word to check
        
        int numofchar = palimaybe.length() - 1; 
        //sets upper edge to the length of word -1
        int initchar = 0; 
        //sets lower side to zero
        char let1 = palimaybe.charAt(0);
        char let2 = palimaybe.charAt(numofchar); 
        //finds character at upper and lower side
        boolean palindrome;

        while(true){
            if(initchar>=numofchar){
                palindrome = true;
                break;} 
            //triggers when both sides meet in middle
            else if(let1 == let2){
                initchar++;
                numofchar = numofchar - 1;} 
            //moves each side one letter closer if outer letters match
            else{
                palindrome = false;
                break;} 
            //if no match, not palindrome
            let1 = palimaybe.charAt(initchar);
            let2 = palimaybe.charAt(numofchar);
            //find the character at the new postion 
        }
        System.out.println(palindrome);
        //prints boolean

    }
}
