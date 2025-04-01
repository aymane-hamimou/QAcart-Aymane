package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AcceptAndAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Trouve le bouton avec la classe "alert" et clique dessus (ce qui déclenche l’alerte)
        driver.findElement(By.className("alert")).click();
//
        // Passe au contexte de l'alerte JavaScript, puis l'accepte (équivalent à cliquer sur "OK")
        driver.switchTo().alert().accept();
        // String p= driver.switchTo().alert().getText();
       // System.out.println(p);

        //driver.switchTo().alert().sendkeys("hello");


    }
}
