package com.tbl.test.selenium;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static com.tbl.test.selenium.base.constantsOfNoah.CHROME_DRIVER;
import static com.tbl.test.selenium.base.constantsOfNoah.URL_OF_NOAH;
import static com.tbl.test.selenium.sysPrint.print;


/**
 * @Auther: Aikachin
 * @Date: 2018/11/9 15:29
 * @Description: 测试登录
 * @Modified by: Aikachin 添加测试用例 2019/2/11
 */
public class LoginTest {

    WebDriver driver;

    //@BeforeMethod
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage(URL_OF_NOAH);
    }

    @BeforeClass
    public void beforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage(URL_OF_NOAH);
    }

    @Test
    // Case1.成功
    public void testLogin() throws Exception {
        // 判断是否能进入登录页
        if (MainPage.ifLoginPage()) {

            // 打开Noah首页
            System.out.println("------Case1.开始测试登录成功...");
            // 使用账号密码进行登录
            try {
                MainPage.login("noah", "123456");
            } catch (NoSuchElementException e) {
                print("Case1测试失败！");
                //如果登录失败
                driver.close();
                driver.quit();
            }
            // 注销
            MainPage.logout();
            print("Case1测试成功！");
        } else {
            print("未能进入登录页，Case1测试失败！");
        }
        Thread.sleep(2000);
    }

    @Test
    // Case2.密码错误，登录失败
    public void testLoginFailed() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
        // 判断是否能进入登录页
        if (MainPage.ifLoginPage()) {
            // 打开Noah首页
            System.out.println("------Case2.开始测试密码错误，登录失败...");
            // 使用账号密码进行登录
            try {
                MainPage.login("admin", "hqks-admi");
                print("Case2测试失败！");
                // 注销
                MainPage.logout();
            } catch (NoSuchElementException ex) {
                print("Case2测试成功！");
            }
        } else {
            print("未能进入登录页，Case2测试失败！");
        }
        Thread.sleep(2000);
    }

    @Test
    // Case3.不输入密码，登录失败
    public void testLoginFailed2() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
        // 判断是否能进入登录页
        if (MainPage.ifLoginPage()) {
            // 打开Noah首页
            System.out.println("------Case3.开始测试不输入密码，登录失败...");
            // 使用账号密码进行登录
            try {
                MainPage.login("admin", "");
                print("Case3测试失败！");
                // 注销
                MainPage.logout();
            } catch (NoSuchElementException ex) {
                print("Case3测试成功！");
            }

        } else {
            print("未能进入登录页，Case3测试失败！");
        }
        Thread.sleep(2000);
    }

    @Test
    // Case4.用户名错误，登录失败
    public void testLoginFailed3() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
        // 判断是否能进入登录页
        if (MainPage.ifLoginPage()) {
            // 打开Noah首页
            System.out.println("------Case4.开始测试用户名错误，登录失败...");
            // 使用账号密码进行登录
            try {
                MainPage.login("admin1", "sonriku");
                print("Case4测试失败！");
                // 注销
                MainPage.logout();
            } catch (NoSuchElementException ex) {
                print("Case4测试成功！");
            }
        } else {
            print("未能进入登录页，Case4测试失败！");
        }
        Thread.sleep(2000);
    }

    @Test
    // Case5.用户名为空，登录失败
    public void testLoginFailed4() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
        // 判断是否能进入登录页
        if (MainPage.ifLoginPage()) {
            // 打开Noah首页
            System.out.println("------Case5.开始测试用户名为空，登录失败...");
            // 使用账号密码进行登录
            try {
                MainPage.login("", "sonriku");
                print("Case5测试失败！");
                // 注销
                MainPage.logout();
            } catch (NoSuchElementException ex) {
                print("Case5测试成功！");
            }
        } else {
            print("未能进入登录页，Case5测试失败！");
        }
        Thread.sleep(2000);
    }


    //@AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }

    @AfterClass
    public void afterClass() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }

//    @DataProvider(name = "Name")
//    public static Object[][] Name() {
//        return null;
//    }
}
