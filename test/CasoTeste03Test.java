/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Leonardo
 */
public class CasoTeste03Test {
    static WebDriver driver;
    static CasoTeste03 cs03;
    public CasoTeste03Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/register.php";
        String caminho = "C:\\Users\\Leonardo\\Desktop\\CI&T\\selenium2\\chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        cs03 = new CasoTeste03();
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
     * Test of testeCadastro method, of class CasoTeste03.
     */
    @Test
    public void testTesteCadastro() {
        cs03.testeCadastro(driver);
    }
    
}
