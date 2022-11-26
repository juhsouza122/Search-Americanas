package com.example.demo.webscrapings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.DisposableBean;

public abstract class HelperWebScraping implements DisposableBean {
    protected WebDriver webDriver = null;

    public HelperWebScraping() {
        //altere na linha 14 o caminho do drive caso for outro sistema operacional
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");

        this.webDriver = new ChromeDriver();
        this.webDriver.manage().window().maximize();
    }

    protected String getDomAttributeByTagName(WebElement element, String tagName, String attributeName) {
        return element.findElement(By.tagName(tagName)).getDomAttribute(attributeName);
    }

    protected Double getDoubleByClassName(WebElement element, String className) {
        return Double.parseDouble(this.getTextByClassName(element, className).replace("R$", "").trim().replace(",", "."));
    }

    protected String getTextByClassName(WebElement element, String className) {
        return element.findElement(By.className(className)).getText();
    }

    protected String getImgByClassName(WebElement element, String className, String attributeName) {
        return element.findElement(By.className(className)).getDomAttribute(attributeName);
    }

    public void quit() {
        this.webDriver.quit();
        this.webDriver = null;
    }

    @Override
    public void destroy() throws Exception {
        if (this.webDriver != null)
            this.quit();
    }
}
