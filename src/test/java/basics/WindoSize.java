package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoSize {
    public static void main(String[] args) {
        // Création d'une instance WebDriver pour contrôler le navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Ouvrir une page HTML locale située sur l'ordinateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Définir une dimension spécifique (largeur x hauteur) pour simuler un iPhone XR
        Dimension iphoneXR = new Dimension(414, 896);

        // Appliquer la nouvelle taille de fenêtre au navigateur
        driver.manage().window().setSize(iphoneXR);

        // Fermer le navigateur après exécution (bonne pratique)
        driver.quit();
    }
}
