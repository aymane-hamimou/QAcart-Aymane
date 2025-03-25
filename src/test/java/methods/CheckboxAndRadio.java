package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadio {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com");
        // Trouver le champ de saisie de l'email en utilisant un sélecteur CSS basé sur l'attribut "data-testid"
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("aymanehamimou@gmail.com");
        // Trouver le champ de saisie du mot de passe en utilisant XPath basé sur l'attribut "id"
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1babaMAMA");
        // Trouver et cliquer sur le bouton de soumission en utilisant un sélecteur CSS basé sur "data-testid"
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

        Thread.sleep(1000); //drori bach ylh server i3rf bila t9lbat la page

        //checkbox
        driver.findElement(By.cssSelector("[data-testid=complete-task]")).click();

        Thread.sleep(7000);

        driver.quit();

    }

}
