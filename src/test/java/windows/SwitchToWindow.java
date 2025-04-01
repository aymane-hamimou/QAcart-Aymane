package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchToWindow {
    public static void main(String[] args) {
        // Création d'une instance du navigateur Chrome via WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximiser la fenêtre du navigateur pour une meilleure visibilité
        driver.manage().window().maximize();

        // Ouvrir un fichier HTML local (interface de test) dans le navigateur
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        // Récupérer le "handle" (identifiant unique) de la fenêtre principale (celle actuellement ouverte)
        String parent = driver.getWindowHandle();

        // Afficher cet identifiant pour référence (utile pour revenir à cette fenêtre plus tard)
        System.out.println(parent);

        // Trouver un élément HTML dont l'attribut "id" est "qacart", puis effectuer un clic dessus
        // Ce clic est censé ouvrir une nouvelle fenêtre ou un nouvel onglet
        driver.findElement(By.id("qacart")).click();

        // Récupérer tous les handles (identifiants) des fenêtres actuellement ouvertes
        Set<String> allWindows = driver.getWindowHandles();

        // Afficher cette liste de handles dans la console (elle doit contenir au moins deux valeurs après le clic)
        System.out.println(allWindows);

        // Boucle sur chaque handle (fenêtre) détecté
        for (String window : allWindows) {
            // Affiche chaque handle pour le suivi
            System.out.println(window);

            // Vérifie si ce handle est différent de celui de la fenêtre principale
            if (!window.equalsIgnoreCase(parent)) {
                // Si c'est une nouvelle fenêtre, on bascule (switch) le contrôle de Selenium vers cette fenêtre
                driver.switchTo().window(window);

                driver.switchTo().window(parent);

                // Ici, tu peux ajouter des actions à faire dans la nouvelle fenêtre, comme lire du texte, cliquer, etc.
            }
        }

        // Optionnel : tu peux fermer les fenêtres ou revenir à la fenêtre parent si nécessaire.
    }

}
