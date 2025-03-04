package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

  class ForgotPasswordTest {

   WebDriver driver;
   WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Setup WebDriver with WebDriverManager and initialize the ChromeDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, ofSeconds(10));

        // Navigate to the desired URL
        driver.get("https://the-internet.herokuapp.com");
    }

    @Test
    public void testForgotPassword() {
        WebElement forgotPasswordLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Forgot Password')]"))
        );
        forgotPasswordLink.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("oupabrilliant@outlook.com");

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        assertTrue(confirmationMessage.getText().contains("Internal Server Error"),
                "Email sent  !");
    }

}
