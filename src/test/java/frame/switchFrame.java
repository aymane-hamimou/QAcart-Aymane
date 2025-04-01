package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchFrame {
    public static void main(String[] args) {
        // Crée une instance de WebDriver pour ouvrir le navigateur Chrome
                WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur pour un affichage optimal
                driver.manage().window().maximize();

        // Accéder à la page web contenant des frames (cadres HTML imbriqués)
                driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");

        // Changer le contexte de Selenium vers la frame nommée "menu"
        // Car l'élément qu'on veut cliquer se trouve à l'intérieur de cette frame
                driver.switchTo().frame("menu");

        // Trouver l’élément <a> ayant les classes "button" et "locators" à l’intérieur de la frame
        // Puis effectuer un clic dessus
                driver.findElement(By.cssSelector(".button.locators")).click();






    }
}
