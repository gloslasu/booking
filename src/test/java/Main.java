import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Main {

    @Test
public void main() {

    WebDriver driver = getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://www.booking.com");
}



    public WebDriver getDriver(String browser)
    {
        switch (browser) // w zalezności od wartości browswer będziemy chciec wykonać rózne akcje
        {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
                return new ChromeDriver(); // ponieważ mamy tutaj return to w kolejnej linii nie jest nam potrzebny break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.31.0-win64\\geckodriver.exe");
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browswer name");
        }

    }


}
