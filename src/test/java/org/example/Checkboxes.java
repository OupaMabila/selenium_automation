package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

class checkboxes extends DriverSetup {


    @Test
    public void testCheckAllboxes() {
        // Get all checkboxes
        WebElement check = driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]"));
        check.click();
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));

        // Check each checkbox if it's not already checked
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            // Verify the checkbox is checked
            assertTrue(checkbox.isSelected(), "Checkbox should be checked");

        }
    }
}



