package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clikSelenuimANDSENDKEYS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com");
        /**
         * La méthode "sendKeys()" dans Selenium est utilisée pour envoyer du texte
         * à un élément web, généralement un champ de saisie (<input>, <textarea>),
         * mais aussi d'autres éléments interactifs comme les zones de recherche.
         *
         * Elle permet de simuler la saisie au clavier dans un formulaire web.
         *
         * Cette méthode est utile pour :
         * 1. Remplir des formulaires
         * 2. Simuler des raccourcis clavier (Ctrl + A, Ctrl + C, etc.)
         * 3. Envoyer des touches spéciales (Tab, Enter, Backspace, etc.)
         */

        /*
        2. Simuler la pression sur la touche "Entrée"
        inputField.sendKeys(Keys.RETURN); // Équivaut à appuyer sur "Enter"

        3. Effacer un champ avant de saisir du texte
        inputField.clear(); // Supprime le texte existant
        inputField.sendKeys("NouveauTexte"); // Ajouter un nouveau texte

        4. Saisir une combinaison de touches spéciales (Exemple : Sélectionner tout puis supprimer)
        inputField.sendKeys(Keys.CONTROL + "a"); // Sélectionner tout le texte
        inputField.sendKeys(Keys.DELETE); // Supprimer le texte sélectionné

         */

        // Trouver le champ de saisie de l'email en utilisant un sélecteur CSS basé sur l'attribut "data-testid"
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("aymanehamimou@gmail.com");
        // Trouver le champ de saisie du mot de passe en utilisant XPath basé sur l'attribut "id"
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1babaMAMA");
        // Trouver et cliquer sur le bouton de soumission en utilisant un sélecteur CSS basé sur "data-testid"
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();

        Thread.sleep(1000); //drori bach ylh server i3rf bila t9lbat la page

        driver.findElement(By.className("MuiIconButton-root")).click();
        driver.findElement(By.cssSelector("[data-testid=\"new-todo\"]")).sendKeys("sortir");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/button")).click();


        Thread.sleep(7000);

        driver.quit();

    }
}
