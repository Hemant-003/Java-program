import java.util.Scanner;
class Practice
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		char [] a = s.nextLine().toCharArray();
		int	c =0;
		int sp=0;
		for (int i=0; i<a.length;i++){
		if(Character.isLetter(a[i])){
			c ++;
		}
		if(Character.isSpace(a[i])){
			sp++;
		}
	

		}
		System.out.print(c);
		System.out.print(sp);}
}


