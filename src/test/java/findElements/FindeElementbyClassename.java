package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindeElementbyClassename {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Trouver l'élément avec le nom de la classe "about" et récupérer son texte
        String element1 = driver.findElement(By.className("about")).getText();

        // Afficher le texte récupéré dans la console
        System.out.println(element1);

        // si il y a un élement avec 2 classe name ou plus comme celle-ci list1 et web<li class="list1 web mobile">Cypress</li>
        //il faux utilisé un classeNAME seulement sinon erreur
        String element2 = driver.findElement(By.className("list1")).getText();

        // Afficher le texte récupéré dans la console
        System.out.println(element2);

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}
