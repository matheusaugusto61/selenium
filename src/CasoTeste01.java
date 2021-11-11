
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Caso de teste responsável: Matheus Augusto
public class CasoTeste01 {

    private String url = "https://opentdb.com/browse.php";
    private String caminho = "E:\\Downloads\\chromedriver.exe";

    public void pesquisaQuestion() {
        AbrirChrome abrir = new AbrirChrome();
        WebDriver driver = abrir.abrirChrome(url, caminho);
        WebElement element = driver.findElement(By.id("query"));
        element.sendKeys("game");
        element.submit();
        try {
            element = driver.findElement(By.className("alert-danger"));
            System.out.println("Não encontrou resultado");
        } catch (Exception e) {
            System.out.println("Encontrou");
        }
        driver.close();
    }
}
