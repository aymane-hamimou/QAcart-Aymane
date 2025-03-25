package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCSSselector {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        //cssSelector ---> #ID
        //String element = driver.findElement(By.cssSelector("#welcome")).getText();

        // si ona classe ---> .classeName
        // String element = driver.findElement(By.cssSelector(".list1")).getText();

        // [attribute ="value"] copie collé sur "[attribute ="value"]" --->" [id=\"welcome\"] "
        //String element = driver.findElement(By.cssSelector("[id=\"welcome\"]")).getText();

        //[attribute =value]
        //String element = driver.findElement(By.cssSelector("[id=welcome]")).getText();

        //pour trouvzer des enfants il faux un Espaces entre les element "cssSelector(".course-list .list1")"
        // si le parent est un "*direct* parent" donc on peut faire  By.cssSelector(".course-list > .list1")
        String element = driver.findElement(By.cssSelector(".course-list > .list1")).getText();



        // Afficher le texte récupéré dans la console
        System.out.println(element);

        // Fermer le navigateur et terminer la session WebDriver
        driver.quit();
    }
}
