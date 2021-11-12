/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Alba
 */
public class CasoTeste05Test {
    
   static WebDriver driver;
   static CasoTeste05 cs05;
   
    
    public CasoTeste05Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         String url = "https://opentdb.com/login.php";
         String caminho = "C:\\Users\\Alba\\Downloads\\chromedriver_win32\\chromedriver.exe";
         
         File file = new File(caminho);
         System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
         driver = new ChromeDriver();
         driver.get(url);
         cs05 = new CasoTeste05();
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
     * Test of testeDeLogin method, of class CasoTeste05.
     */
    @Test
    public void testTesteDeLogin() {
        cs05.testeDeLogin(driver);
    }
    
}
