
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Caso de teste responsável: Matheus Augusto
public class CasoTeste01 {



    public void pesquisaQuestion(WebDriver driver) {
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
