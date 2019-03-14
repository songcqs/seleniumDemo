//package com.tbl.test.selenium;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static com.tbl.test.selenium.base.constantsOfNoah.CHROME_DRIVER;
//import static com.tbl.test.selenium.base.constantsOfNoah.URL_OF_NOAH;
//import static com.tbl.test.selenium.sysPrint.print;
//
//
///**
// * @Auther: Aikachin
// * @Date: 2019/2/21
// * @Description: 测试添加角色
// * @Modified by: Aikachin 添加测试用例 2019/2/21
// */
//public class RolePageTest {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() throws Exception{
//        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    // Case1.成功
//    public void testAddRole() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
//        // 打开Noah首页
//        System.out.println("---Case1.开始测试添加角色...");
//        // 使用账号密码进行登录
//        mainPage.login("noah", "123456");
//        int retCode = mainPage.rolePage("测试角色E");
//        if (retCode == 0) {
//            print("Case1测试成功！");
//        } else {
//            print("Case1测试失败！");
//        }
//        Thread.sleep(2000);
//    }
//
//    @Test
//    // Case2.密码错误，登录失败
//    public void testAddRoleFailed() throws Exception {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.openMainPage(URL_OF_NOAH);
//        // 打开Noah首页
//        System.out.println("---Case2.开始测试添加重复名称的角色...");
//        // 使用账号密码进行登录
//        mainPage.login("noah", "123456");
//        int retCode = mainPage.rolePage("测试角色E");
//        if (retCode == 1) {
//            print("Case2测试成功！");
//        } else {
//            print("Case2测试失败！");
//        }
//        Thread.sleep(2000);
//    }
//
//
//    @AfterMethod
//    public void tearDown() throws InterruptedException{
//        Thread.sleep(1000);
//        driver.close();
//        driver.quit();
//    }
//
////    @DataProvider(name = "Name")
////    public static Object[][] Name() {
////        return null;
////    }
//}
