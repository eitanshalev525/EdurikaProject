package com.qa.testscript;

import org.openqa.selenium.Webdriver;
import org.openqa.selenium.chrome.ChromDriver;
import org.testing.annotation.Test;

public class DevOpsEduTest {
    public void OpenBrowserTest()
    {
        WebDriver driver = new ChromDriver();
        driver.get("18.191.99.242:8888");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageloadTimeout(5,TimeUnit.SECOND);

    }
}