import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileManager {

    public static void readFileWithFileReader(File file) {
        char[] charBuffer = new char[250];
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read(charBuffer);
            for (char c : charBuffer) {
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileWithFileWriter(String fileText, File file) {
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
    }
}
