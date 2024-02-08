package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    WebDriver driver;
    public Cart(WebDriver driver){
        this.driver=driver;
    }
    public  void visitCart(){
    WebElement cart= driver.findElement(By.xpath("//a[@class='action showcart']"));
    cart.click();
    driver.findElement(By.xpath("//span[normalize-space()='View and Edit Cart']")).click();
}
public void sizeOfCart(){
WebElement size= driver.findElement(By.cssSelector(".counter-number"));
var total =size.getText();
System.out.println("Total Number of Quantity in Cart:  "+total);
}
public void increaseQuantityOfItem(){
WebElement increaseQuantity= driver.findElement(By.xpath("//input[@id='cart-613783-qty']"));
increaseQuantity.clear();
increaseQuantity.sendKeys("2");
sizeOfCart();
}
public void printOrderTotal(){
WebElement orderTotal= driver.findElement(By.cssSelector("//span[@data-bind='text: getValue()']"));
var total = orderTotal.getText();
System.out.println("Total Amount:  "+total);
    }
public void chooseFixedShipping(){
//WebElement checkout= driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
//checkout.click();
WebElement fixedMethod= driver.findElement(By.xpath("//input[@name='ko_unique_2']"));
fixedMethod.click();
WebElement next= driver.findElement(By.xpath("//span[normalize-space()='Next']"));
next.click();
}
public void placeOrder(){
        WebElement placeOrder= driver.findElement(By.xpath("//span[normalize-space()='Place Order']"));
        placeOrder.click();
}
public void printOrderNumber(){
        WebElement orderNumber = driver.findElement(By.xpath("//strong[normalize-space()='000043292']"));
        var orderNum=orderNumber.getText();
        System.out.println(orderNum);
}
}
