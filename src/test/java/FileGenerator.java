import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {
    public void generateFiles(int counts) {
        Random random = new Random();
        for (int i = 1; i <= counts; i++) {
            int size = random.nextInt(10000 - 100 + 1) + 100;
            int[] m = new int[size];
            for (int a = 0; a < size; a++) {
                m[a] = random.nextInt();
            }
            String fileName = "file" + i + ".txt";
            try {
                File file = new File(fileName);
                FileWriter writer = new FileWriter(file);
                for (int k = 0; k < m.length; k++) {
                    writer.write(String.valueOf(m[k]));
                    writer.write(System.lineSeparator());
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
