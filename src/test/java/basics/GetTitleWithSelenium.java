package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleWithSelenium {
    public static void main(String[] args) {
        // Création d'une instance de WebDriver pour ouvrir Google Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir le site web de Selenium
        driver.get("https://www.selenium.dev/");

        // Récupérer le titre actuel de la page ouverte
        String title = driver.getTitle();

        // Afficher le titre dans la console
        System.out.println("Le titre actuel est : " + title);

        // Fermer le navigateur après l'exécution (bonne pratique)
        driver.quit();
    }
}
