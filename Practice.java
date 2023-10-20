import java.util.ArrayList;
import java.util.Scanner;
public class Practice{
    public static void main(String[]args){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in); 
       while(true){
        int n = Integer.valueOf(scan.nextLine());
        if (n==(-1)){
            break;
        }
        nums.add(n);
       }
       int last = nums.size() - 1;
       for(int i = 0; i <= last; i++){
        System.out.println(nums.get(i));
        scan.close();
       }
    }
}