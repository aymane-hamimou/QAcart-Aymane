package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInselenium {
    public static void main(String[] args) throws InterruptedException {
        // Création d'une instance WebDriver pour Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir Google
        driver.get("https://google.com");

        // Attendre 2 secondes pour observer l'ouverture de Google
        Thread.sleep(2000);

        // Naviguer vers un autre site web (QAcart)
        driver.navigate().to("https://qacart.com/home");

        // Attendre 2 secondes avant de revenir en arrière
        Thread.sleep(2000);

        // Revenir à la page précédente (Google)
        driver.navigate().back();

        // Attendre 2 secondes avant d'aller en avant
        Thread.sleep(2000);

        // Aller à la page suivante (QAcart)
        driver.navigate().forward();

        // Attendre 2 secondes avant de rafraîchir
        Thread.sleep(2000);

        // Rafraîchir la page actuelle
        driver.navigate().refresh();

        // Attendre 2 secondes avant de fermer le navigateur
        Thread.sleep(2000);

        // Fermer le navigateur après exécution
        driver.quit();
    }
}
