package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class lumaTest {
    HomePage HomePage;
    LogIn logIn;
    MyAccount myAccount;
    Wishlist wishlist;
    Compare compare;
    Cart cart;
        WebDriver driver;
       // String driverPath="/usr/bin/chromedriver";
@BeforeTest
        public void setUp(){
            //System.setProperty("webdriver.chrome.driver",driverPath);
            driver=new ChromeDriver();
            driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://magento.softwaretestingboard.com/");

        }
        @Test(priority =0,description = "verifying Home Page Title")
        void verifyingTitle(){
            HomePage=new HomePage(driver);
            HomePage.verifyHomePage();
        }

        @Test(priority = 1,description = "verifying Sigin Functionality")
                void verifyingSignIn(){
            logIn = new LogIn(driver);
            logIn.SignIn();

        }

        @Test(priority = 2, description = "Verifying my Account button and adding Address")
    void verfyingAddress(){
            try {
                myAccount = new MyAccount(driver);
                Thread.sleep(3000);
                myAccount.visitMyAccount();
                myAccount.addAddress();
                myAccount.updateAddress();
            }catch(Exception e){
                System.out.println(e);
                }

        }
        @Test(priority = 3,description = "Verifying Wishlist Functionality")
        void verifyingWishlistFunctions(){

try{
    wishlist =new Wishlist(driver);
    wishlist.addItemTOWishlist();
    Thread.sleep(3000);
    wishlist.removeFirstItem();
    Thread.sleep(3000);
    wishlist.addLastItemToCart();
}catch(Exception e){
    System.out.println(e);
}
        }
        @Test(priority = 4,description = "verifying Comparing Items ")
        void verifyingCompareItems(){
    try{
compare=new Compare(driver);

compare.selectItem();
        Thread.sleep(3000);
        compare.CompareList();

compare.itemToCArt();
        Thread.sleep(3000);
compare.removeItems();
    }
    catch(Exception e){
        System.out.println(e);
    }

        }
        @Test(priority = 5,description = "verify cart functionality")
        void cart(){
    cart=new Cart(driver);
            try { cart.visitCart();

                driver.manage().wait(10);

            cart.sizeOfCart();

            cart.increaseQuantityOfItem();

                cart.printOrderTotal();

                driver.manage().wait(10);
cart.chooseFixedShipping();

                driver.manage().wait(10);
cart.placeOrder();

                driver.manage().wait(10);
cart.printOrderNumber();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//    @AfterTest
//
//    public void tearDown(){
//
//        driver.quit();
//    }
//    }


