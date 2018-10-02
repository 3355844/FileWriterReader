import java.io.File;

public class Main {

    public static void main(String[] args) {

        String fileName = "fileTestOutputStream.txt";
        String fileText = "fileText, ";
        File file = new File(fileName);

//        FileWriter Class Example
//        FileManager.writeFileWithFileWriter(fileText, file);
//        FileReader class Example
//        FileManager.readFileWithFileReader(file);
//        OutputStream
        StreamsManager.writeFile(fileName, fileText);
    }
}
