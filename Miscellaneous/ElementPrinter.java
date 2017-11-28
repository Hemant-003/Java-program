import java.util.Scanner;

public class ElementPrinter {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        // Get L and R from the input
        int L = s.nextInt();
        int R = s.nextInt();

        // Write here the logic to print all integers between L and R

        if (L>R){
            for (int i=R;i<=L;i++){
                System.out.print(" " +i);
            }
        }

        if (R>L){
            for(int j=L;j<=R;j++){
                System.out.print(" " +j);
            }
        }
    }
}
