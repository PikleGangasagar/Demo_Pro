package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\rajku\\OneDrive\\Desktop\\Selenium1\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8675364881597855432%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007785%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    
    driver.findElement(By.name("email")).sendKeys("7385421698");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("ap_password")).sendKeys("Milkyway 9");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Faceshop");
    driver.findElement(By.id("nav-search-submit-button")).click();
    driver.findElement(By.id("a-autoid-1")).click();
    //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a")).click();
    //driver.findElement(By.id("submit.add-to-cart")).click();
    
    
}
}
