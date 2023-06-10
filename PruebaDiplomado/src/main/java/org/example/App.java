package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        ChromeOptions chromeOptions = new ChromeOption();
        chromeOptions.addArguments("--remote-allow-origins=*")
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-Sauce-Labs-Backpack")).sendKeys("AddToCart");
        driver.findElement(By.id("AddToCart-button")).click();

        driver.findElement(By.id("add-to-cart-Sauce-Labs-Backpack")).sendKeys("AddToCart");
        driver.findElement(By.id("AddToCart-button")).click();
    }


}
