import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signup extends functions{
    @Test(priority = 1)
    public void FillUpAllFields() throws InterruptedException {
        clickandsend(By.xpath("//*[@id=\"name\"]"),"MarkTest");
        clickandsend(By.xpath("//*[@id=\"email\"]"),"mark@admin.com");
        clickandsend(By.xpath("//*[@id=\"phone\"]"),"5433835792");
        clickandsend(By.xpath("//*[@id=\"monthly_import\"]"),"1");
        click(By.xpath("//*[@id=\"__next\"]/div/div[4]/form/button"));
        Thread.sleep(1000);
        clickandsend(By.xpath("//*[@id=\"company_name\"]"),"Test Company");

    }
    @Test(priority = 2)
    public void SubmitForm(){
        click(By.xpath("//*[@id=\"__next\"]/div/div[4]/form/button"));
        URLvalidator("https://www.naj.ae/auth/newAccount");
    }
}