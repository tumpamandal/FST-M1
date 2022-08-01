package activities;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String args[])
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title=driver.getTitle();
        System.out.println("Title of the page is " +title);
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("text in element:" +idLocator.getText());
        driver.findElement(By.className("button")).getText();
        driver.findElement(By.cssSelector(".green")).getText();
        driver.findElement(By.linkText(" About Us"));
    }
}
