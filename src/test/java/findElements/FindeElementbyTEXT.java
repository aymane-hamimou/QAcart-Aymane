package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindeElementbyTEXT {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Trouver un élément par son texte de lien exact et récupérer son texte
        // Cela ne fonctionne que si l'élément est une balise <a> (lien hypertexte) / "href"
        String element1 = driver.findElement(By.linkText("Go to About Page")).getText();

        // Afficher le texte récupéré dans la console
        System.out.println(element1);

        // Trouver un élément en utilisant un texte partiel du lien hypertexte
        // Cette méthode permet de rechercher un lien contenant "About Page"
        String element2 = driver.findElement(By.partialLinkText("About Page")).getText();

        // Afficher le texte récupéré dans la console
        System.out.println(element2);

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}
