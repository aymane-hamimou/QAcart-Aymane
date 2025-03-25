package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLSelenium {
    public static void main(String[] args) {
        // Création d'une instance de WebDriver pour ouvrir Google Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir le site web de Selenium
        driver.get("https://www.selenium.dev/");

        // Récupérer l'URL actuelle de la page ouverte
        String url = driver.getCurrentUrl();

        // Afficher l'URL dans la console
        System.out.println("L'URL actuelle est : " + url);

        // Fermer le navigateur après l'exécution (bonne pratique)
        driver.quit();
    }
}
