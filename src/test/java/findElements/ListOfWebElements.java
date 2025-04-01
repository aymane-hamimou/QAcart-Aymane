package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfWebElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");
        List<WebElement> elements= driver.findElements(By.cssSelector(".course-list li"));
        // récupérer un element de la liste
        // WebElement first = elements.get(0);
        //System.out.println(first.getText());

        // sovoir le nombre d'élement dans la list
        System.out.println(elements.size());
        driver.quit();
    }
}

