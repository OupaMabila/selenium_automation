/*
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BaseTest {

    WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Setup WebDriver with WebDriverManager and initialize the ChromeDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, ofSeconds(10));

        // Navigate to the desired URL
        driver.get("https://the-internet.herokuapp.com");
    }

    @Test
    public void testHeadingText() {
        // Find the heading element using CSS selector
        WebElement heading = driver.findElement(By.cssSelector("h1.heading"));

        // Get the text of the heading
        String headingText = heading.getText();

        // Print the heading text to the console
        System.out.println("Page Heading: " + headingText);

        // Assert that the heading text matches the expected value
        assertEquals("Welcome to the-internet", headingText, "Heading does not match!");
    }
    @Test
    public void testForgotPassword() {
        WebElement forgotPasswordLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Form Authentication')]"))
        );
        forgotPasswordLink.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("oupabrilliant@outlook.com");

        WebElement retrievePasswordButton = driver.findElement(By.className("icon-signin"));
        retrievePasswordButton.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));
        assertTrue(confirmationMessage.getText().contains("email has been sent"),
                "Password reset confirmation not displayed!");
    }


    @AfterEach
    public void tearDown() {
        // Close the browser after each test
        if (driver != null) {
            driver.quit();
        }
    }
}
*/
