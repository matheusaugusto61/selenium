import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Caso de teste. Responsável: Israel Gomes
public class CasoTeste02 {
        
    //O Método generateApiUrl verifica se a URL da API está sendo gerada, com o parametro number default.
    public void generateApiUrl(WebDriver driver) {
        
        WebElement element = driver.findElement(By.id("trivia_amount"));
        String valor = element.getAttribute("value");
        element.submit();

        WebElement teste = driver.findElement(By.className("alert-success"));
        if (teste != null) {
            System.out.println("URL da API gerada com sucesso, com o parametro Number of Questions = "+valor);
        } else {
            System.out.println("Erro ao gerar a URL da API");
        }
        driver.close();
    }
}
