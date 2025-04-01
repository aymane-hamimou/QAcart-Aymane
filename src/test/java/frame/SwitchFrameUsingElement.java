package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrameUsingElement {
    public static void main(String[] args) {
        // Crée une instance de WebDriver pour ouvrir le navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur pour un affichage optimal
        driver.manage().window().maximize();

        // Accéder à la page web contenant des frames (cadres HTML imbriqués)
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        // Trouver l'élément <frame> ayant l'attribut id="menu"
        // On stocke cet élément dans une variable de type WebElement
        WebElement frame = driver.findElement(By.id("menu"));

        // Changer le contexte de Selenium vers cette frame en utilisant l'objet WebElement
        driver.switchTo().frame(frame);

        // À l'intérieur de cette frame, trouver un lien <a> avec les classes CSS "button" et "locators"
        // Puis cliquer dessus
        driver.findElement(By.cssSelector(".button.locators")).click();

        driver.switchTo().parentFrame();
    }
}
