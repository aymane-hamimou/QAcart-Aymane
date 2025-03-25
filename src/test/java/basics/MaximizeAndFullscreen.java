package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullscreen {
    public static void main(String[] args) {
        // Création d'une instance de WebDriver pour contrôler le navigateur Chrome
        WebDriver driver = new ChromeDriver();
        // Mettre la fenêtre du navigateur en mode maximisé l'aide de la methode manage().window()
        driver.manage().window().maximize();
        //Mettre la fenêtre en mode plein écran (supprime la barre d'adresse et les boutons)(F11)
        driver.manage().window().fullscreen();
        // Ouvrir une page HTML locale située sur l'ordinateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");
        // Fermer le navigateur après exécution (bonne pratique)
        driver.quit();

    }
}
