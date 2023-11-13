import java.util.*;

public class CountDigits {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println("Digit count : " + countDigits(num));
    }

    public static int countDigits(int num){
        int count = 0; 
        while(num > 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}