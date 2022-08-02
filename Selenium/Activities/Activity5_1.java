package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.PublicKey;

public class Activity5_1 {
     public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/dynamic-controls ");
         String title = driver.getTitle();
        System.out.println("Title of the page is" + title);
         WebElement checkBoxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
         System.out.println("The checkbox Input is displayed: " + checkBoxInput.isDisplayed());
         //click remove checkbox
         driver.findElement(By.id("toggleCheckbox")).click();
         System.out.println("The checkbox Input is displayed: " + checkBoxInput.isDisplayed());
        driver.close();
}
}
