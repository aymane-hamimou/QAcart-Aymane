package waitsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {
    public static void main(String[] args) {
        // Crée une instance de WebDriver pour lancer le navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Ouvre un fichier HTML local dans le navigateur (exécuté en local depuis ton projet)
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Définit un temps d'attente implicite de 3 secondes :
        // Cela signifie que si un élément n'est pas immédiatement présent dans le DOM,
        // WebDriver attendra jusqu'à 3 secondes avant de lancer une exception (NoSuchElementException)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Agrandit la fenêtre du navigateur pour un affichage optimal
        driver.manage().window().maximize();
    }

}
