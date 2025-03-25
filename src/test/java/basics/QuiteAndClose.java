package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuiteAndClose {
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

        // Ferme toutes les fenêtres ouvertes du navigateur
        driver.quit();

        /// /////////////////////////////////////////////////////

        driver.get("https://www.selenium.dev/");

        // Ouvre une nouvelle fenêtre
        driver.get("https://www.google.com");

        // Ferme uniquement l'onglet actif (Google), Selenium reste connecté à la première fenêtre
        driver.close();

    }
}
