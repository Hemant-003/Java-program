import java.util.Scanner;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (IsPrime(i)) {
                System.out.println("number " +i+ "is a prime number");
                if (count==3){
                    System.out.println("exiting the loop");
                    break;
                }

            }
        }
    }
        public static boolean IsPrime( int n) {
            for (int i = 2; i < n; ++i) {
                if (n % i == 0) {
                     return false;
                }
                }
            return true;
    }
}





