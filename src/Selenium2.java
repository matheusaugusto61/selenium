import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;

public class Selenium2 {
    public static void main(String[] args) {
        //Objetos:
        CasoTeste01 ct01 = new CasoTeste01();
        CasoTeste02 ct02 = new CasoTeste02();
        CasoTeste05 ct05 = new CasoTeste05();
        //Executando os métodos:
        ct02.generateApiUrl();
        ct05.testeDeLogin();
        ct01.pesquisaQuestion();
    }
    
   

}
