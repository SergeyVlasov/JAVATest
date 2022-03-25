package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reader {
    public Iterator<Object[]> provider() throws InterruptedException {
        List<Object[]> testCases = new ArrayList<>();
        String[] data = null;

        //this loop is pseudo code
        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {
            // use comma as separator
            data = line.split(cvsSplitBy);
            testCases.add(data);
        }

        return testCases.iterator();
    }
}
