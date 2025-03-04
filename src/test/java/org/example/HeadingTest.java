package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HeadingTest  {
    WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void setUp() {
        // Setup WebDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, ofSeconds(10));

        // Navigate to the desired URL
        driver.get("https://the-internet.herokuapp.com");
    }


    @Test
    public void testHeadingText() {


        // Find the heading element
        WebElement heading = driver.findElement(By.cssSelector("h1.heading"));
        String headingText = heading.getText(); // Get the text of the heading


        // Print  the console
        System.out.println("Page Heading: " + headingText);

        // Assert that the heading text matches
        assertEquals("Welcome to the-internet", headingText, "Heading does not match!");
    }


    @AfterEach
    public void tearDown() {
        // Close the browser after each test
            driver.quit();
        }
    }

