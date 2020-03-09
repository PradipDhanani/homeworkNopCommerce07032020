package threebrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETesting {//class
    public static void main(String[] args) {//main method

        String baseUrl = "https://demo.nopcommerce.com/";//url of website
        System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");//providing browser path
        WebDriver driver = new InternetExplorerDriver();//object creation of driver reference type
        driver.manage().window().maximize();//window opening and maximize method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//website stay open for 10 seconds
        driver.get(baseUrl);//get method calling browser
        String title = driver.getTitle();//get method calling browser
        System.out.println("Main page " + title);//printing statement
        driver.quit();//closing browser method


    }
}
