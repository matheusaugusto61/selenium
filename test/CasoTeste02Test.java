import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CasoTeste02Test {
    
    static WebDriver driver;
    static CasoTeste02 cs02; 
        
    public CasoTeste02Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/api_config.php";
        String caminho = "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe";   
        
        File file = new File(caminho); 
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 
        driver = new ChromeDriver();
        driver.get(url);
        cs02 = new CasoTeste02(); 
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generateApiUrl method, of class CasoTeste02.
     */
    @Test
    public void testGenerateApiUrl() {
        cs02.generateApiUrl(driver);
    }
    
}
