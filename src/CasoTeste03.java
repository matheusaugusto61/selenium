
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Caso de teste responsável: Leonardo Marinho

public class CasoTeste03 {

    public void testeCadastro(WebDriver driver) {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("leonardo");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("tetinha03");
        WebElement passwordAgain = driver.findElement(By.id("password_again"));
        passwordAgain.sendKeys("tetinha03");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("leuzinho48@gmail.com");

        email.submit();
        

        try {
            WebElement teste = driver.findElement(By.className("alert-danger"));
            System.out.println("O user já existe.");
        } catch (Exception e) {
            System.out.println("O user ainda não existia");
        }

        driver.close();

    }
}
