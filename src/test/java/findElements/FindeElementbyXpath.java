package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*/
 Xpath --->  //tagName[@attribute='value']
  exmpl ----> //h1[@id='welcome']
  dans la console pour tester si tout march bien on fait $x("//h1[@id='welcome']")
 */

public class FindeElementbyXpath {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Trouver l'élément avec le nom "description" et récupérer son texte
        //String element = driver.findElement(By.xpath("//h1[@id='welcome']")).getText();
        //String element = driver.findElement(By.xpath("/html/body/ul[1]/li[1]")).getText();
        //String element = driver.findElement(By.xpath("//ul[@class='country-list']/li[2]")).getText();
        //String element = driver.findElement(By.xpath("//*[@class='country-list']")).getText();

        //contains(@attribut, 'valeur') -> Vérifie la présence d'une valeur dans un attribut
        // String element = driver.findElement(By.xpath("//*[contains(@class,'country-')]")).getText();

        // Sélection par texte ou Filtre par contenu textuel soit le text boutton ou n'import quelle text
        //String element = driver.findElement(By.xpath("//*[text()='Contact us']")).getText();
        String element = driver.findElement(By.xpath("//*[contains(text(),'Contact')]")).getText();
        // Afficher le texte récupéré dans la console
        System.out.println(element);

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}



