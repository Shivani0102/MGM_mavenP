import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends PageObject {
    private final String email_textbox = "automation@practicallogix.com";
    private final String email_Password = "JNpR4dWX:A3cn";

    @FindBy(xpath = "//a[@class='logo-img']//img")
    private WebElement homeclick;

    @FindBy(xpath = "//div[@class='carousel-item active']//div[@class='movie-content']//div[@class='btn-container']//div//button[@class='btn-view available-text d-none d-sm-block'][contains(text(),'Watch Now')]")
    private WebElement watchnowclick;

    @FindBy(xpath = "//div[@class='close tele-close']//img[@class='close-btn-image']")
    private WebElement closeplayer;

    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    private WebElement nextmovie;

    @FindBy(xpath = "//span[contains(text(),'Volume/Mute')]/ancestor::button")
    private WebElement mutebutton;

    @FindBy(xpath = "//button[contains(text(),'Resume watching')]")
    private WebElement resumebutton;

    @FindBy(xpath = "//span[contains(text(),'Play/Pause')]/ancestor::div[@class='bmpui-ui-playbacktoggle-overlay']/div/button")
    private WebElement playbutton;

    @FindBy(xpath = "//div[@class='carousel-item active']//button[@class='cui-btn btn-movie'][contains(text(),'ADD TO LIST')]")
    private WebElement addtolistcarousel;

    @FindBy(xpath = "//div[@class='createNewList']")
    private WebElement createlist;

    public homePage(WebDriver driver) {
        super(driver);
    }


    public boolean verify_watchnow() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        Thread.sleep(8000);
        try {
            WebElement watchnow = this.watchnowclick;
            if (watchnow.isDisplayed()) {
                this.watchnowclick.click();
            } else {
                this.nextmovie.click();
            }
        } catch (Exception e) {
            this.nextmovie.click();
        }
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 35);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.closeplayer));
        boolean verify = this.closeplayer.isDisplayed();
        return verify;
    }

    public void verify_popupmutecontrols() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 35);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.resumebutton));
            WebElement data = this.resumebutton;
            if (data.isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.resumebutton));
                this.resumebutton.click();
            }
        } catch (Exception e) {
            System.out.println("not in try");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.mutebutton));
        this.closeplayer.getAttribute("class");
    }

}
