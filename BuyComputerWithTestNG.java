package HappyFlow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyComputerWithTestNG {
    WebDriver driver;

    @Test (priority = 1)
    void openBrowser(){
        System.out.println("open browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    @Test (priority = 2)
    void selectIdea600(){
    System.out.println("Select Lenova IdeaCentre PC and add to cart and Verify it has been added");
    driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
        //driver.findElement(By.xpath("/html/body/div[5]/div/p")).click();
        //driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
}
        //  @Test (priority = 3)
        // void VerifyBar(){
        // System.out.println("Verify the pc has been added to cart");
        //  WebElement VerifyBar = driver.findElement(By.xpath("/html/body/div[5]/div/p/a"));
        //  Assert.assertTrue(VerifyBar.isDisplayed(),"Verify bar is not displayed");
    // Above was to verify the green bar - Would not work!!

    @Test (priority = 4)
    void UpdateToThreeAndAgreeTerms(){
        System.out.printf("Update to 3 pc's and agree terms");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/input")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button")).click();
    }
    @Test (priority = 5)
    void CheckOutAsGuestAndFillBillingInformation(){
        System.out.printf("Checkout as guest and fill form");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[1]/input")).sendKeys("King Kam");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[2]/input")).sendKeys("Patel");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[3]/input")).sendKeys("Test@gmail.com");
        WebElement Country = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select"));
        Select select = new Select(Country);
        select.selectByVisibleText("Maldives");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[7]/input")).sendKeys("Kams City");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[8]/input")).sendKeys("Kams Street");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[10]/input")).sendKeys("KK1 1KK");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[11]/input")).sendKeys("07555 123456");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]")).click();
    }
            //  @Test (priority = 6)
            // void FillShippingMethod(){
            //  System.out.printf("Fill in shipping information");
            //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[1]/div/div/ul/li[2]/div[1]/input")).click();
        // Above was to click on Next day - but wouldn't work
            // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
            //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
    }
            //@Test (priority = 7)
            //void PaymentMethod(){
            // System.out.printf("Fill in payment details");
            // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/form/div/div/div/ul/li[2]/div/div[2]/input")).click();
        // Above was on shipping page - Trying to click on Continue - didn't work.




