import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageObject
{
    private final String email_textbox= "automation@practicallogix.com";
    private final String email_Password= "JNpR4dWX:A3cn";

    @FindBy(xpath = "//h1[@class='login-text']")
    private WebElement verify_login_title;

    @FindBy(xpath = "//div[@class='auth-component']")
    private WebElement carousal_image;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='o-form-button-bar']/input")
    private WebElement next_button;

    @FindBy(xpath = "//a[contains(text(),'Create an account')]")
    private WebElement request_an_account;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//a[@id='Movies']")
    private WebElement menu_link_movie;

    @FindBy(xpath = "//nav[@class='navbar']")
    private WebElement menuitems;


    public loginPage(WebDriver driver) {
        super(driver);
    }

    public String load(){
        String title= this.verify_login_title.getText();
        System.out.println(title);
        return title;
    }

    public boolean CarouselImage(){
        boolean Image= this.carousal_image.isDisplayed();
        return Image;
    }

    public boolean DifferentCarouselImage(){
        String FirstImage= this.carousal_image.getAttribute("Style");
        driver.navigate().refresh();
        String SecondImage= this.carousal_image.getAttribute("Style");
        driver.navigate().refresh();
        String ThirdImage= this.carousal_image.getAttribute("Style");
        driver.navigate().refresh();
        if (FirstImage == SecondImage && SecondImage == ThirdImage){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean enterEmailName() throws InterruptedException {
        boolean verify= this.email.isDisplayed();
        Thread.sleep(3000);
        this.email.sendKeys(email_textbox);
        return verify;
    }

    public void EnterPassword(){
        this.password.click();
        this.password.sendKeys(email_Password);
    }

    public boolean VerifyNextButton()
    {
        boolean next= this.next_button.isDisplayed();
        return next;
    }

    public boolean ClickNext() throws InterruptedException {
        this.next_button.click();
        Thread.sleep(8000);
        boolean passwrd= false;
        try {
            WebElement passshow = this.password;
            if (passshow.isDisplayed())
            {
                passwrd = true;
            }}
        catch(Exception e)
        {
            passwrd = false;
        }
        return passwrd;
    }

    public boolean VerifyRequestAnAccount()
    {
        boolean next= this.request_an_account.isDisplayed();
        return next;
    }

    public boolean VerifyLogin()
    {
        boolean next= this.menuitems.isDisplayed();
        return next;
    }




}
