
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Caso de teste responsável: Felipe Dutra
public class CasoTeste05 {

    public void testeDeLogin() {
        String url = "https://opentdb.com/login.php";
        String caminho = "C:\\Users\\Alba\\Downloads\\chromedriver_win32\\chromedriver.exe";
        AbrirChrome abrir = new AbrirChrome();
        WebDriver driver = abrir.abrirChrome(url, caminho);
        driver.findElement(By.id("username")).sendKeys("FelipeDtra");
        driver.findElement(By.id("password")).sendKeys("senha321" + Keys.ENTER);
        WebElement mensagem = driver.findElement(By.className("fa-user"));
        System.out.println("Deu certo!!");

        driver.close();
    }
}
