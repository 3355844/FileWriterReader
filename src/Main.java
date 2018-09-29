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

//        FileWriter Class Example
        FileManager.writeFileWithFileWriter(fileText, file);
//        FileReader class Example
        FileManager.readFileWithFileReader(file);
    }
}
