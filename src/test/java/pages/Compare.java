package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compare {
    WebDriver driver;
    public Compare(WebDriver driver){
    this.driver=driver;}

    public void goToItem(){
        WebElement womenCategory= driver.findElement(By.cssSelector("a[id='ui-id-4'] span:nth-child(2)"));
        womenCategory.click();
//        WebElement womenTops= driver.findElement(By.cssSelector("a[id='ui-id-9'] span:nth-child(2)"));
//        womenTops.click();
        WebElement womenJackets= driver.findElement(By.xpath("//a[contains(text(),'Jackets')]"));
        womenJackets.click();
        System.out.println("11");
    }

    public void selectItem(){
        goToItem();
        WebElement item1= driver.findElement(By.xpath("//li[3]//div[1]//div[1]//div[4]//div[1]//div[2]//a[2]"));
        item1.click();
        WebElement item2= driver.findElement(By.xpath("//li[11]//div[1]//div[1]//div[4]//div[1]//div[2]//a[2]"));
        item2.click();
        ToCompare();
    }
    public void ToCompare(){

        WebElement addToCompare = driver.findElement(By.xpath("//span[normalize-space()='Compare']"));
        addToCompare.click();

    }
    public void itemToCArt(){
WebElement item1Reviews= driver.findElement(By.cssSelector("body > div:nth-child(5) > main:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > table:nth-child(1) > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)"));
String a=item1Reviews.getText();
WebElement item2Reviews= driver.findElement(By.cssSelector("body > div:nth-child(5) > main:nth-child(3) > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > table:nth-child(1) > tbody:nth-child(3) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)"));
String b=item2Reviews.getText();

driver.findElement(By.xpath("//tbody/tr/td[1]/div[3]/div[1]/form[1]/button[1]")).click();
driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
driver.findElement(By.xpath("//div[@id='option-label-color-93-item-52']")).click();
driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();


    }
    public  void removeItems(){
        driver.findElement(By.xpath("//a[@title='Compare Products']")).click();
driver.findElement(By.xpath("//thead//td[1]//a[1]")).click();
driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
driver.findElement(By.xpath("//thead//td[2]//a[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();
    }
}
