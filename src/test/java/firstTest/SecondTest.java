package firstTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTest extends BaseTest{

    @DataProvider(name  = "SetEnviroment", parallel = true)
    public Object[][] getData(){
        Object[][] browserVersion = new Object[][]{
                {"Chrome", "89"},
                {"Yandex","13"}

        };
        return browserVersion;
    }

    @Test
    public void startTest() {
        System.out.println("Стартуем тест!");
    }

    @Test(dataProvider = "SetEnviroment")
    public void startTest(String browser, String vers){
        System.out.println("Тест что "+browser + "=" + vers);

        Assertion a= new Assertion();
        a.assertTrue(vers.equalsIgnoreCase("80"));

    }
}
