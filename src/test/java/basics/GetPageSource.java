package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
    public static void main(String[] args) {
        // Création d'une instance de WebDriver pour ouvrir Google Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir le site web de Selenium
        driver.get("https://www.selenium.dev/");

        // Récupérer le code source HTML de la page ouverte
        String pageSource = driver.getPageSource();

        // Afficher une partie du code source
        System.out.println("Le code source de la page commence par :\n" + pageSource);

        // Fermer le navigateur après l'exécution (bonne pratique)
        driver.quit();
    }
}
