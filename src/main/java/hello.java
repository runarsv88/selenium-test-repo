import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hello {
    public static void main(String[] args) {
        System.out.println("Less Hello?");
        System.out.println("Hello");
        WebDriver driver = new FirefoxDriver();
    	driver.get("https://www.google.com");
    	driver.close();
        System.out.println("More Hello");
    }
}
	
