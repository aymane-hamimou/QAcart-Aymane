package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromADropDown  {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");
        Thread.sleep(3000);
        WebElement dropDown = driver.findElement(By.id("courses"));

        Select coursesDropDown = new Select(dropDown);
        // ou Select dropDown1 = new Select(Select dropDown1 = new Select(dropDown)));
        

        //coursesDropDown.selectByVisibleText("appium");
        //coursesDropDown.selectByIndex(3);
        coursesDropDown.selectByValue("cypress");
    }
}
