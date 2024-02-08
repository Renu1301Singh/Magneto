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
}
public void sizeOfCart(){
WebElement size= driver.findElement(By.cssSelector("span[data-bind=\"text: getCartParam('summary_count')\"]"));
var total =size.getText();
System.out.println(total);
}
public void increaseQuantityOfItem(){
WebElement increaseQuantity= driver.findElement(By.xpath("//input[@id='cart-item-612102-qty']"));
increaseQuantity.sendKeys("2");
}
public void printOrderTotal(){
WebElement orderTotal= driver.findElement(By.cssSelector(".amount.price-container"));
var total = orderTotal.getText();
System.out.println(total);
    }
public void chooseFixedShipping(){
WebElement checkout= driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
checkout.click();
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
