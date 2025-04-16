package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HeadingTest extends DriverSetup {


    @Test
    public void testHeadingText() {

        // Find the heading element
        WebElement heading = driver.findElement(By.cssSelector("h1.heading"));
        String headingText = heading.getText();


        // Print  the console
        System.out.println("Page Heading: " + headingText);

        // Assert that the heading text matches
        assertEquals("Welcome to the-internet0", headingText, "Heading does not match!");
    }
}

