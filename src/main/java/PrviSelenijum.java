import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrviSelenijum {
    public static void main(String[] args) {

        //Domaći: Otići na kupujemprodajem.com, u pretragu ukucati iphone 13, kliknuti na prvi rezultat.
        // Proveriti da je naslov oglasa onaj koji smo uočili i tokom manuelnog izvođenja kejsa.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jovan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.kupujemprodajem.com/");
        // driver.navigate().to("https://www.kupujemprodajem.com/");

        // class kpBoxCloseButton
        WebElement  elpop = driver.findElement(By.className("kpBoxCloseButton"));
        elpop.click();

        // id searchKeywordsInput
        WebElement el = driver.findElement(By.id("searchKeywordsInput"));
        el.sendKeys("iphone 13");
        el.submit();

        // xpath   //*[@id='adDescription7321776']/div/section[2]/div[1]/div[1]/a
        WebElement element = driver.findElement(By.xpath("//*[@id='adDescription7321776']/div/section[2]/div[1]/div[1]/a"));
        element.sendKeys(Keys.ENTER);

        String title=driver.getTitle();
        String expected="iPhone 13, iPhone 12, iPhone 11 - NOVO! - KupujemProdajem";

        if (title.equals(expected)) {
            System.out.println("Title is valid!");
        } else {
            System.out.println("Title is not valid!");
        }

        //driver.close();
    }
}
