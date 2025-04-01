package windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleAndHandles {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome via WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Récupérer l'identifiant (handle) de la fenêtre principale
        String parent = driver.getWindowHandle();

        // Afficher l'identifiant de la fenêtre principale dans la console
        System.out.println(parent);

        // Afficher tous les identifiants des fenêtres ouvertes (il peut y en avoir plusieurs si des pop-ups sont ouvertes)
        System.out.println(driver.getWindowHandles());

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}
