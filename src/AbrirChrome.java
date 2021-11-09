import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbrirChrome {
     public WebDriver abrirChrome(String url, String caminho) {
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
}
