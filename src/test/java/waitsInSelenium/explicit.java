package waitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicit {
    public static void main(String[] args) throws InterruptedException {
        // Maximiser la fenêtre du navigateur
        WebDriver driver = new ChromeDriver();

        // Ouvre un fichier HTML local dans le navigateur (exécuté en local depuis ton projet)
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");


        // Attente explicite : attendre que l'élément avec la classe "primary" devienne visible, puis cliquer dessus
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("primary")))
                .click();
        // ⚠️ Exceptions que tu peux rencontrer :

        // NoSuchElementException :
        // → L'élément n'existe pas du tout dans le DOM au moment de l'appel (même avec un wait implicite).

        // TimeoutException :
        // → L'élément attendu n'est toujours pas trouvé ou pas visible/cliquable au bout du délai défini dans WebDriverWait.

        // ElementNotInteractableException :
        // → L'élément est bien trouvé mais ne peut pas être cliqué ou manipulé (souvent parce qu’il est caché ou désactivé).

        // StaleElementReferenceException :
        // → L’élément a été trouvé, mais il n’est plus valide (ex. : la page s’est rechargée ou l’élément a été mis à jour dans le DOM).

        // InvalidSelectorException :
        // → Le sélecteur CSS ou XPath est mal formé (ex. : mauvais symbole, syntaxe incorrecte).

        // Si besoin, tu peux entourer le bloc avec try-catch pour mieux gérer les erreurs :
    /*
    try {
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.className("primary")))
            .click();
    } catch (TimeoutException e) {
        System.out.println("Élément non trouvé dans le délai imparti !");
    }
    */
        /// //////////////////////////////////////////////////////////////////////////////////////////////////
        // Crée un objet WebDriverWait pour une attente explicite de 10 secondes maximum
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Attendre que l'élément avec la classe "primary" soit visible, puis cliquer dessus
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary"))).click();

        // Attendre que l'élément avec la classe "cover" soit visible
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));

        // Attendre à nouveau la visibilité d'un autre (ou même) élément avec la classe "cover"
        // Cela peut être redondant si rien ne change dans le DOM entre les deux appels
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));

    }
}
