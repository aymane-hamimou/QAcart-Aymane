package visitingWebSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // visiter un site web
        driver.get("https://www.google.com");
    }
}
