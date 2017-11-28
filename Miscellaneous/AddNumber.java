import java.util.Scanner;

public class AddNumber{
public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Numbr a : ");
		int a= s.nextInt();
		System.out.println("Enter Numbr b : ");
		int b= s.nextInt();
		int c = sum(a,b);
		System.out.println(c);
	}

	public static int sum(int a, int b){
		return a+b;
	}

}