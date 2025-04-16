package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;

public class DriverSetup {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeEach
    public void setUp() {
        // Setup WebDrivers
        driver = new ChromeDriver();
         wait = new WebDriverWait(driver, ofSeconds(10));

        // URL
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterEach
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
