import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;

public class Selenium2 {
    public static void main(String[] args) {
        abrirChrome();
        //criando objeto
        CasoTeste01 ct01 = new CasoTeste01();
        //utilizando metodo que se encontra dentro do objeto.
        ct01.teste();
    }
    
   

}
