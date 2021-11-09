import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;

public class Selenium2 {
    public static void main(String[] args) {
        abrirChrome();
    }

    private static void abrirChrome() {
        File file = new File("C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://opentdb.com/");
        String i = driver.getCurrentUrl();
        System.out.println(i);
        driver.close();
    }

}
