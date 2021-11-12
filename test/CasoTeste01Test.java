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
 * @author Matheus
 */
public class CasoTeste01Test {
    
    static WebDriver driver;
    static CasoTeste01 cs01;
    
    public CasoTeste01Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        String url = "https://opentdb.com/browse.php";
        String caminho = "E:\\Downloads\\chromedriver.exe";
        File file = new File(caminho);
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get(url);
        cs01 = new CasoTeste01();
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
     * Test of pesquisaQuestion method, of class CasoTeste01.
     */
    @Test
    public void testPesquisaQuestion() {
        cs01.pesquisaQuestion(driver);
    }

}
