import org.example.Quicksort;
import org.junit.jupiter.api.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class Test {
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Begin of testing");
    }

    @BeforeEach
    void beforeEachTest() {
        FileGenerator fileGenerator = new FileGenerator();
        fileGenerator.generateFiles(50);
    }
    @org.junit.jupiter.api.Test
    void Testquicksort() throws IOException {
        for (int i = 1; i <= 50; i++) {
            String fileName = "file" + i + ".txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int k = 0;
            int[] counts = new int[10000];
            while ((line = reader.readLine()) != null) {
                counts[k] = Integer.parseInt(line);
                k++;
            }
            Quicksort quicksort = new Quicksort();
            long start = System.nanoTime();
            quicksort.quicksort(counts,0,counts.length-1);
            long finish = System.nanoTime();
            System.out.println((float)(finish-start)/1000 +  " " + String.valueOf(k));
        }
        assert(true);
    }
}
