package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

  class ForgotPasswordTest extends DriverSetup {

    @Test
    public void testForgotPassword() {
        WebElement forgotPasswordLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Forgot Password')]"))
        );
        forgotPasswordLink.click();

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        emailField.sendKeys("oupabrilliant@outlook.com");

        WebElement retrievePasswordButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form_submit")));
        retrievePasswordButton.click();

        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        assertTrue(confirmationMessage.getText().contains("Internal Server Error"),
                "Email sent  !");
    }

}
