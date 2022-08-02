package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String args[])
    {
    WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
    String title = driver.getTitle();
        System.out.println("Title of the page is " +title);
        WebElement idFirstName = driver.findElement(By.id("firstName"));
        WebElement idLastName = driver.findElement(By.id("lastName"));
        WebElement idEmail = driver.findElement(By.id("email"));
        WebElement idNumber = driver.findElement(By.id("number"));
        idFirstName.sendKeys("Tumpa");
        idLastName.sendKeys("Mandal");
        idEmail.sendKeys("tumpamandal1301289034@gmail.com");
        idNumber.sendKeys("7550482331");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();


 }
}
