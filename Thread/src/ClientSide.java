import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) throws IOException{

        int number,  temp;
        Scanner scanner1= new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1",1800);

        Scanner scanner = new Scanner(socket.getInputStream());
        number=scanner1.nextInt();

        PrintStream printStream = new PrintStream(socket.getOutputStream());
        printStream.println(number);

        temp = scanner.nextInt();
        System.out.println(temp);
    }
}
