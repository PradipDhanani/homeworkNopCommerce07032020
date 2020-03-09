package threebrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTesting {//class

    public static void main(String[] args) {//main method


        String baseurl = "https://demo.nopcommerce.com/";//url of website
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");//providing browser path
        WebDriver driver = new FirefoxDriver();//object creation of driver reference type
        driver.manage().window().maximize();//window opening and maximize method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//window opening and maximize method
        driver.get(baseurl);//get method calling browser
        String title = driver.getTitle();//get method calling browser
        System.out.println("Main page " + title);//printing statement
        //driver.quit();//closing browser method


    }
}
