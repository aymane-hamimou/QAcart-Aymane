package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");

        Actions action = new Actions(driver);
        WebElement source =driver.findElement(By.id("edraggable-1"));
        WebElement distination =driver.findElement(By.id("pp"));
       // action.dragAndDrop(source,distination).build().perform();*
        action.clickAndHold(source).moveToElement(distination).release().build().perform();
    }
}
