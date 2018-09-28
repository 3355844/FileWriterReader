import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String fileName = "fileTestNew.txt";
        String fileText = "fileText, ";
        File file = new File(fileName);

// FileWriter Class Example

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, true);

            fileWriter.write(fileText);
            fileWriter.write(new Date().toString());

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileReader class Example

        char[] charBuffer = new char[250];
        try {
            FileReader fileReader  = new FileReader(file);
            fileReader.read(charBuffer);
            for (char c : charBuffer) {
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
