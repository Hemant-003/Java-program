import java.util.Scanner;

class PrintCharactersInBetween{
	public static void main(String[] args) {
		Scanner hemant = new Scanner(System.in);
		System.out.println("Enter first character");
		char start = hemant.next().charAt(0);
		System.out.println("Enter last character");
		char end = hemant.next().charAt(0);
		System.out.println("Characters between " + start + " and " + end);
		for (char i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
}