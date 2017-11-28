import java.util.Scanner;
import java.util.*;

public class ClosestGift{
	
	public static void main(String []args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter A Gift Location(Number) : ");
		int Number = s.nextInt();
        int closestNumber = closestPrime(Number);
		System.out.println("Next prime number is after : ");
		System.out.println(closestNumber - Number);
	}

	static int closestPrime(int number){
		int closestPrime = number + 1;
		while(true){
			if(primeNumber(closestPrime)){
				return closestPrime;
			}
			closestPrime++;		
		}
	}

	static boolean primeNumber(int number){
		Scanner s= new Scanner(System.in);
		for(int i=2;i<number;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
}
