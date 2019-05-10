import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserTest {
    @Test
    public void testMetod(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://37.59.228.229:3000/");
        driver.findElement(By.cssSelector("i[class='mdi-content-add']")).click();
        driver.findElement(By.id("icon_prefix")).clear();
        driver.findElement(By.id("icon_telephone")).clear();
        driver.findElement(By.id("icon_prefix")).sendKeys("testname");
        driver.findElement(By.id("icon_telephone")).sendKeys("0505050555");
        driver.findElement(By.cssSelector("a[class=\"save-btn waves-effect waves-light btn\"]")).click();
        /*driver.findElement(By.id("test5")).click();
        driver.findElement(By.id("test5")).clear();
        driver.findElement(By.id("test5")).sendKeys("2");
        driver.findElement(By.id("test5")).click();
       driver.findElement(By.cssSelector("a[class=\"save-btn waves-effect waves-light btn\"]")).click();*/
    }
}
