package firstTest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.*;

public class FirstTest extends BaseTest{

        @Test
        public void startTest() {
            System.out.println("Перый тест");
            String curDir = System.getProperty("user.dir");
            System.out.println(System.getProperty("os.name"));
            String filePath;

            if (System.getProperty("os.name").contains("Windows")){
                filePath=curDir+"\\src\\main\\resources\\test";

            }else {
                filePath=curDir+"src/main/resources/test";
            }

            String line=null;

            try {
                BufferedReader bf = new BufferedReader(new FileReader(filePath));

                line= bf.readLine();

                BufferedReader bf2 = new BufferedReader(new FileReader(filePath));
                bf2.lines().forEach(s -> System.out.println("строка файла "+ s));

            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println(line);

            Assertion a = new Assertion();
            a.assertTrue(line.contains("аушцтао"), "Проверяем что текст содержит");


        }

}
