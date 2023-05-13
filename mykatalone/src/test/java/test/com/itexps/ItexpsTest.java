/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ganes
 */
public class ItexpsTest {
      private WebDriver driver;
    
    public ItexpsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
          System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe..");
//            ChromeOptions op= new ChromeOptions();
//            op.addArguments("--disable-web-security");
                driver = new ChromeDriver();

            
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
      @Test
  public void testItexps() throws Exception {
    driver.get("https://www.google.com/search?q=basketball&oq=basketball&aqs=chrome.0.0i433i512j46i131i433i512j0i433i512j0i131i433i512j0i433i512j0i131i433i512j0i512j0i131i433i512l3.61367j0j15&sourceid=chrome&ie=UTF-8");
    driver.manage() .window() .maximize();
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).clear();
    driver.findElement(By.id("APjFqb")).sendKeys("itexps.com");
    driver.get("https://www.google.com/search?q=itexps.com&sxsrf=APwXEddhB3NuNS6MPa8PATat-QLK9GtEkg%3A1683569618193&ei=0jtZZIKcC_KZptQP5rqM4Ac&ved=0ahUKEwiCza_Iqeb-AhXyjIkEHWYdA3wQ4dUDCBE&uact=5&oq=itexps.com&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzoKCAAQRxDWBBCwAzoKCAAQigUQsAMQQzoKCC4QigUQsAMQQzoHCCMQigUQJzoHCAAQigUQQzoLCAAQgAQQsQMQgwE6DQgAEIoFELEDEIMBEEM6CggAEIoFELEDEEM6BQgAEIAEOhAIABCABBAUEIcCELEDEIMBOhMILhCDARDHARCxAxDRAxCKBRBDOg0ILhCDARCxAxCKBRBDOgsIABCABBCxAxDJAzoICAAQigUQkgM6CAgAEIAEEJIDOhAILhCDARDUAhCxAxCKBRBDOiEILhCDARDHARCxAxDRAxCKBRBDEJcFENwEEN4EEOAEGAE6BwgjELECECc6DQgAEIAEELEDEIMBEAo6BwgjELACECc6DQgAEA0QgAQQsQMQgwE6EwgAEA0QgAQQsQMQgwEQsQMQgwE6CggAEA0QgAQQsQM6DQguEA0QrwEQxwEQgAQ6DQguEA0QgAQQxwEQrwE6CQgAEA0QgAQQCjoHCAAQDRCABDoICAAQHhANEAo6BggAEB4QDToICAAQHhANEA86GwguEA0QrwEQxwEQgAQQlwUQ3AQQ3gQQ4AQYAToHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoPCAAQigUQ6gIQtAIQQxgCOg0ILhCvARDHARCKBRAnOggILhCABBDUAjoLCC4QgAQQsQMQgwE6EQguEIAEELEDEIMBEMcBENEDOgsIABCKBRCxAxCDAToKCC4Q1AIQigUQQzoKCC4QigUQ1AIQQzoHCC4QigUQQzoNCC4QigUQsQMQ1AIQQzoOCC4QigUQsQMQgwEQ1AI6GQguEK8BEMcBEIoFEJcFENwEEN4EEOAEGAE6DQguEIoFEMcBEK8BECc6CwgAEIoFELEDEJECOggIABCABBCxAzoZCC4QigUQxwEQrwEQlwUQ3AQQ3gQQ4AQYAToOCC4QgAQQsQMQxwEQ0QM6CwguEIAEEMcBEK8BOgQIABAeOgoILhANEIAEENQCOgoILhANENQCEIAESgQIQRgAUGlYzn1gopsBaAxwAXgDgAGsAYgB6BqSAQUxMC4xOZgBAKABAbABFMgBCsABAdoBBggBEAEYFNoBBggCEAEYAQ&sclient=gws-wiz-serp");
    driver.manage() .window() .maximize();
    //    driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/span")).click();
    driver.findElement(By.id("APjFqb")).clear();
    driver.get("https://www.itexps.net/?gclid=Cj0KCQjwu-KiBhCsARIsAPztUF1QPGBSHUc7qqKwlWmMUUUvbr7FX83wKWTAoGvSdG6iwMuW1KQMGyUaAvZ5EALw_wcB");
    driver.manage() .window() .maximize();
    driver.findElement(By.id("DrpDwnMn03label")).click();
    driver.get("https://www.itexps.net/proctoring-services");
    driver.manage() .window() .maximize();
    driver.findElement(By.id("DrpDwnMn04label")).click();
    driver.findElement(By.id("DrpDwnMn05label")).click();
    driver.get("https://www.itexps.net/services");
    driver.manage() .window() .maximize();
    driver.findElement(By.id("DrpDwnMn06label")).click();
    driver.get("https://www.itexps.net/about-us");
    driver.manage() .window() .maximize();
    driver.findElement(By.id("DrpDwnMn01label")).click();
    driver.findElement(By.id("DrpDwnMn00label")).click();
    driver.get("https://www.itexps.net/");
    driver.manage() .window() .maximize();
    driver.close();
  }
}
