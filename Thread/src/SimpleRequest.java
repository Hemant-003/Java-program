import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.security.ntlm.Server;


import javax.xml.ws.Response;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.Scanner;

public class SimpleRequest  {
    public static void main(String[] args) throws Exception {

        int in,number;

        ServerSocket serverSocket = new ServerSocket(1800);
        Socket socket = serverSocket.accept();

        java.util.Scanner scanner = new java.util.Scanner(socket.getInputStream());

        in = scanner.nextInt();

        number = in* 2;

        PrintStream printStream = new PrintStream(socket.getOutputStream());

        printStream.println(number);




    }
}
