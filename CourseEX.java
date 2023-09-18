import java.util.Scanner;

public class CourseEX{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Up to? ");
        int numtil = Integer.valueOf(scan.next());
        int i = 1;
        int result = 1;
        
        if (numtil == 0) {
            System.out.println("1");
        }
        
        while (i<=numtil){            
            result = result * i;
            i++;
           }
        
           System.out.println(result);
        scan.close();
    }
}