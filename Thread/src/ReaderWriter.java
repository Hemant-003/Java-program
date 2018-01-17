
import java.io.*;

public class ReaderWriter  {
    public static void main(String[] args) throws IOException{

        ReaderWriter readerWriter = new ReaderWriter();


        readerWriter.writer("idea64.txt", "Hey whatsup");
        String fileContents = readerWriter.FileReader("idea64.txt");

        fileContents= fileContents + fileContents;
        System.out.println(fileContents);

    }
    public String FileReader(String filename) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;
        StringBuilder stringBuilder = new StringBuilder(" ");
        while((line = bufferedReader.readLine())!= null) {
            stringBuilder.append(line).append("/n");

        }
        return stringBuilder.toString();
    }

    public int writer(String fileName, String content)throws IOException{
        File file = new File(fileName);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write(content);
        bufferedWriter.close();


    return 0;
    }

}
