import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tramontana.ru/");
        driver.findElement(By.xpath("//li[4][@class='nav-item mr-3 has-sub']//a[@class='nav-link']")).click();
        driver.findElement(By.id("heading69")).click();
        driver.findElement(By.linkText("Удочка для встегивания оттяжек KAILAS Clip Up III")).click();
    }

}
