
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Caso de teste responsável: Felipe Dutra
public class CasoTeste05 {

    public void testeDeLogin(WebDriver driver) {
        

        WebElement usuario = driver.findElement(By.id("username"));
        usuario.sendKeys("FelipeDtra");
        WebElement senha = driver.findElement(By.id("password"));
        senha.sendKeys("senha321" + Keys.ENTER);
        WebElement mensagem = driver.findElement(By.className("fa-user"));
        System.out.println("Login realizado!!");

        driver.close();
    }
}
