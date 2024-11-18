import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class StartUp extends functions{
    @Test
    public void VerifyNajWebsite(){
        getUrl("https://www.naj.ae/");
        URLvalidator("https://www.naj.ae/");
        click(By.xpath("//*[@id=\"__next\"]/div/div[1]/div/div[4]/div/div[1]/a[2]"));
//        URLvalidator("https://www.naj.ae/auth/newAccount/");
    }
}
