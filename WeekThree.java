import java.util.Scanner;
import java.util.ArrayList;

public class WeekThree{
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
ArrayList<String> translation = new ArrayList<>();

char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
String[] morseString = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
System.out.println(morseString.length);
String beforeWord = scan.nextLine();
int n = 0;
int i = 0;
int end = beforeWord.length()-1;
scan.close();

for(int x = 0; x <= end;){
    if(beforeWord.charAt(n) == alphabet[i]){
        translation.add(morseString[i]);
        n++;
        x++;
        i=0;
    }
    else{
        i++;
    }
    }
    int size = translation.size()-1;

    for(int y = 0; y <= size; y++){
        System.out.print(translation.get(y) + "/");
        }
    }
}

