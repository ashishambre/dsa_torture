import java.util.Scanner;

/**
 * A program to calculate a GCD or HCF of two numbers
 * 
 * Formula: 
 * GCD(a, b) = GCD(a-b, b) where a > b OR
 * GCD(a, b) = GCD(a%b, b) where a > b
 * 
 */

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println("GCD of " + n1 + " and " + n2 + " :" + gcd(n1, n2));
    }

    private static int gcd(int n1, int n2) {
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0) return n2; 
        return n1;
    }
}
