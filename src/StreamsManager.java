import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class StreamsManager {

    public static void writeFile(String path, String text) {
        String voidText = " Text is added in OS ";
        File file = null;
        OutputStream os = null;
        try {
            file = new File(path);
            os = new FileOutputStream(file, true);
            byte [] textArrBytes = text.getBytes();
            os.write(" nrew ".getBytes());
            os.write(textArrBytes);
            os.write(voidText.getBytes());
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readZipFile(String value) {

        InputStream is = null;
        try {

            is = new FileInputStream("/file_dir/newFile.txt");
            ZipInputStream zis = new ZipInputStream(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
