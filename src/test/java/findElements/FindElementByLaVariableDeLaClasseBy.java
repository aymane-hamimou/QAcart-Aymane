package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLaVariableDeLaClasseBy {
    public static void main(String[] args) {
        // déclarer une variable de type "by" et utilisé dans le code
         By aymane = By.id("welcome");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");
        //utilisation de la variable déclaré
        String element = driver.findElement(aymane).getText();
        System.out.println(element);
        driver.quit();
        }

}
