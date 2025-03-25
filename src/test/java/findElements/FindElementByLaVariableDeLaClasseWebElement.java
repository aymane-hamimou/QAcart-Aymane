package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLaVariableDeLaClasseWebElement {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        WebElement aymane =  driver.findElement(By.id("welcome"));

        //utilisation de la variable déclaré
        String element = aymane.getText();
        System.out.println(element);
        driver.quit();
    }
}
