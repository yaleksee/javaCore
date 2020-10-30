package less5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyTest {
    public static void main(String[] args) {

        Integer.parseInt(null);
        Double.parseDouble(null);

        File file = new File("path");

        try {

            FileInputStream fileInputStream = new FileInputStream(file);


            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            test(file);
        }

    }

    private static void test(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
