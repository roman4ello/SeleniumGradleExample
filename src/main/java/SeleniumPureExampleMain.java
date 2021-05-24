import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPureExampleMain {

    public static void runChromeOnMac() throws InterruptedException {
//        /usr/local/bin/ - is default for mac. And we do not need to set path manually. But need to have driver in this path
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(20_000);  // Let the user actually see something!
        driver.quit();
    }

    public static void runFirefoxOnMac() throws InterruptedException {
//        /usr/local/bin/ - is default for mac. And we do not need to set path manually.But need to have driver in this path
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("FirefoxDriver");
        searchBox.submit();
        Thread.sleep(60_000);  // Let the user actually see something!
        driver.quit();
    }

    public static void runChromeOnWindows() throws InterruptedException {
        //PATH_TO_THE_chromedriver - use real path to the chromedriver (For Chrome)
        System.setProperty("webdriver.chrome.driver", "PATH_TO_THE_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }

    public static void runFirefoxOnWindows() throws InterruptedException {
        //PATH_TO_THE_geckodriver - use real path to the geckodriver (For Firefox-Mozilla)
        System.setProperty("webdriver.gecko.driver", "PATH_TO_THE_geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("FirefoxDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }

}
