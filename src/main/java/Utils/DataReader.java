package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class DataReader {
    public static Iterator<Object[]> readCsv() throws IOException {
        final String DELIMITER = ",";
        try{
            Scanner scanner = new Scanner( new File("C:\\Users\\Serg\\Desktop\\QA-academy\\JAVA TESTING\\TestGoogle\\src\\main\\resources\\TestData.csv"));
            scanner.useDelimiter(DELIMITER);

            return new Iterator<Object[]>() {
                @Override
                public boolean hasNext() {
                    return scanner.hasNext();
                }

                @Override
                public Object[] next() {
                    //apply split here
                    return new Object[]{scanner.next().split(";")[0]};
                }
            };
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
