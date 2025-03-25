package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Trouver l'élément avec le nom "description" et récupérer son texte
        String element = driver.findElement(By.name("description")).getText();

        // Afficher le texte récupéré dans la console
        System.out.println(element);

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}
