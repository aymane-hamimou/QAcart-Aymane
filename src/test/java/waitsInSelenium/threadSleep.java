package waitsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class threadSleep {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\aymane\\IdeaProjects\\QAcart\\src\\test\\resources\\index.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();

    }
}
