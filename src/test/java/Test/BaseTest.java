package Test;

import Framework.Browser;
import Utils.DataReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.Iterator;

public class BaseTest {
    @BeforeMethod
    public void beforeTest()
    {
        System.out.println("beforeTest");
        Browser.Get();
    }

    @AfterMethod
    public void afterTest()
    {
        System.out.println("afterTest");
        Browser.Close();
    }

    //@DataProvider(name="text", parallel=true)
    @DataProvider(name="text")
    public static Iterator<Object[]> dbData() throws IOException {
        return DataReader.readCsv("TestData.csv");
    }
}
