import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        /* System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver"); */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alfre\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Meaghan Lewis");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}

