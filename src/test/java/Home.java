import jdk.nashorn.internal.ir.CatchNode;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Home extends PageObject {

    Random rand = new Random();
    int rand_int2 = rand.nextInt(10099);
    String stringNum = String.valueOf(rand_int2);



    @FindBy(xpath = "https://mgm-roar-dev.practicallogix.com/")
    private WebElement URL;

    @FindBy(xpath = "//a[@class='logo-img']//img")
    private WebElement header_logo;

    @FindBy(xpath = "//h2[contains(text(),'My Lists')]")
    private WebElement your_lists_sec;

    @FindBy(xpath = "//ul[@class='menu-items']//a[@id='Films']")
    private WebElement header_movie;

    @FindBy(xpath = "//ul[@class='menu-items']//a[@id='Series']")
    private WebElement header_television;

    @FindBy(xpath = "//ul[@class='menu-items']//a[@id='My Lists']")
    private WebElement header_mylist;

    @FindBy(xpath = "//button[@class='user-logout-btn']/span[text()='log out']")
    private WebElement header_logout_button;

    @FindBy(xpath = "//div[@class='banner-text']")
    private WebElement all_movies_television;

    @FindBy(xpath = "//div[@class='body-content']")
    private WebElement lists;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement email_textbox;

    @FindBy(xpath = "//div[@class='header']")
    private WebElement header;

    @FindBy(xpath = "//div[@class='carousel']")
    private WebElement carousel;

    @FindBy(xpath = "(//h2[contains(text(),'Bond')]/ancestor::div[3]/following-sibling::div[1]//button[text() = 'View details'])[1]")
    private WebElement movie_card_view_details;

    @FindBy(xpath = "//h2[text()='My Lists']")
    private WebElement movie_list_Mylist;

    @FindBy(xpath = "//h2[contains(text(),'Recently Watched')]")
    private WebElement movie_list_recentlywatched;

    @FindBy(xpath = "//h2[text()='Black History Month']")
    private WebElement movie_list_historymonth;

    @FindBy(xpath = "//h2[text()='Bond']")
    private WebElement movie_list_bond;

    @FindBy(xpath = "//h2[text()='Action']")
    private WebElement movie_list_actionhits;

    @FindBy(xpath = "//h2[text()='Christmas']")
    private WebElement movie_list_christmas;

    @FindBy(xpath = "//h2[text()='Halloween']")
    private WebElement movie_list_halloween;

    @FindBy(xpath = "//h2[text()='TV Unscripted']")
    private WebElement movie_list_legallyblonde;

    @FindBy(xpath = "//div//button[text()=' SEE ALL TV SHOWS ']")
    private WebElement see_all_tv_shows;

    @FindBy(xpath = "//div//button[text()=' SEE ALL MOVIES ']")
    private WebElement see_all_movies;

    @FindBy(xpath = "//section//img[@alt='footer-logo']")
    private WebElement footer_logo;

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    private WebElement privacy_policy;

    @FindBy(xpath = "//li//a[text()='Terms of use']")
    private WebElement terms_of_use;

    @FindBy(xpath = "//div//a[text()='Support']")
    private WebElement support;

    @FindBy(xpath = "//div[@class='carousel-inner']")
    private WebElement movie_image_slider;

    @FindBy(xpath = "//span[@class='carousel-control-next-icon']")
    private WebElement next_navigation;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Hansel & Gretel Witch Hunters']")
    private WebElement progress_bar_witch_hunter;

    @FindBy(xpath = "//img[@alt='logo-image']")
    private WebElement movie_logo;

    @FindBy(xpath = "//div[@class='carousel-item active']//div[@class='movie-content']//div[@class='btn-container']//div//button[contains(text(),'Watch Now')]")
    private WebElement watchnow_button;

    @FindBy(xpath = "//span[@class='carousel-control-prev-icon']")
    private WebElement previous_navigtion;

    @FindBy(xpath = "//div[@class='synopsis-title']")
    private WebElement synopsis_title;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']")
    private WebElement carousel_progress_bar;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Spectre']")
    private WebElement progress_bar_spectre;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Army Of Darkness']")
    private WebElement progress_bar_armyofdarkness;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='The Magnificent Seven (2016)']")
    private WebElement progress_bar_magnificent;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Fargo']")
    private WebElement progress_bar_fargo;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='No Time To Die']")
    private WebElement progress_bar_no_time_die;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Rocky II']")
    private WebElement progress_bar_rocky;

    @FindBy(xpath = "//div[@class='col-7 right active']/p[1]")
    private WebElement syn_title;

    @FindBy(xpath = "//div[@class='row']//a[@class='see-all-text']")
    private WebElement see_all_button;

    @FindBy(xpath = "(//div[@class='btn-container']//button[text()=' ADD TO LIST '])[2]")
    private WebElement maincarousel_add_to_list_movie2;

    @FindBy(xpath = "//div[@class='ng-scroll-content']//div[@class='movie-poster']")
    private WebElement movie_poster;

    @FindBy(xpath = "(//div//a[@role='button']/i[@class='next-icon icon'])[2]")
    private WebElement movie_list_next_button;

    @FindBy(xpath = "(//div[@class='btn-container']//button[text()=' View details '])[1]")
    private WebElement view_details;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Three Amigos!']")
    private WebElement progress_bar_amigos;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']//a[text()='Legally Blonde']")
    private WebElement progress_bar_legally_blonde;

    @FindBy(xpath = "//mgm-video-player-popup//img[@class='close-btn-image']")
    private WebElement movie_close_btn;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']/li[@class='carousel-menu active']")
    private WebElement titles_underligned;

    @FindBy(xpath = "//div[@id='bitmovin-player']")
    private WebElement player_popup;

    @FindBy(xpath = "//div//h2[text()='Recently Watched']")
    private WebElement recently_watched;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement cookies_accept;

    @FindBy(xpath = "(//div//a[@role='button']/i[@class='next-icon icon'])[1]")
    private WebElement Recently_watched_next_button;

    @FindBy(xpath = "//div[@class='movie-poster']//p")
    private WebElement movie_name;

    @FindBy(xpath = "//div[@class='search-content']/input")
    private WebElement add_to_list_search;

    @FindBy(xpath = "//div[@class='atl-searchclear']//span")
    private WebElement add_to_list_clear;

    @FindBy(xpath = "//ul[@class='carousel-menu-list']/li")
    private String carousel_4_titles;

    @FindBy(xpath = "//p[text()='Your Lists']")
    private WebElement your_list;

    By toggle_button_test = By.xpath("//div[@class='single-toggle']//span[text()= ' test" + stringNum + " ']");
    By toggle_button_test2 = By.xpath("//div[@class='single-toggle']//span[text()= ' test2" + stringNum + " ']");
    By toggle_button_test1 = By.xpath("//div[@class='single-toggle']//span[text()= ' test1" + stringNum + " ']");

    @FindBy(xpath = "//div[@class='btn-container']//button[text()=' ADD TO LIST ']")
    private WebElement add_to_list_button;


    @FindBy(xpath = "//div[@class='carousel-item active']//button[contains(text(),'ADD TO LIST')]")
    private WebElement add_listCarosel;

    @FindBy(xpath = "//div[@class='toggle-btn-item']")
    private WebElement add_to_list_list_name;

    @FindBy(xpath = "//div[@class='atl-newlistadd']//span")
    private WebElement add_to_list_create_list;

    @FindBy(xpath = "//div[text()='Creating...']")
    private WebElement add_to_list_creating;

    @FindBy(xpath = "//div[@class='createdListItem']//span[text()=' Created! ']")
    private WebElement add_to_list_created;

    By add_to_list_toggle_button_demo = By.xpath("//div[@class='single-toggle']//span[text()=' Demo"+rand_int2+ " ']");
    By demo_toggle_button = By.xpath("//span[text()=' Demo" + rand_int2+ " ']/ancestor::label/input");
    By test1_toggle_button = By.xpath("//span[text()=' test1" + rand_int2+ " ']/ancestor::label/input");
    By test_toggle_button = By.xpath("//span[text()=' test" + rand_int2+ " ']/ancestor::label/input");
    By add_to_list_toggel_button1= By.xpath("//div[@class='single-toggle']//span[text()=' test" + rand_int2 + " ']");

    @FindBy(xpath = "//div[@class='atl-add-btn']//span[text()=' Added! ']")
    private WebElement add_to_list_added_button;

    @FindBy(xpath = "//div[@class='atl-add-form']//input")
    private WebElement add_to_list_enter_name;

    @FindBy(xpath = "//input[@placeholder='My New List Name']")
    private WebElement input_list_create;

    @FindBy(xpath = "(//div[@class='toggle-btn-item']//label/span[@class='slider round'])[1]")
    private WebElement add_to_list_toggel_button;

    @FindBy(xpath = "(//div[@class='toggle-btn-item'])[1]")
    private WebElement new_list;

    @FindBy(xpath = "//div[@class='single-toggle']//input[@class='ng-valid ng-dirty ng-touched']")
    private WebElement selected_list;

    @FindBy(xpath = "//div[@class='atl-add-btn']//span")
    private WebElement add_to_list;

    @FindBy(xpath = "//div[@class='atl-add-btn']//span[@class='ie11fix uppercase']")
    private WebElement success_created;

    @FindBy(xpath = "//button[@class='watch-again-btn btn-view']")
    private WebElement play_begining;

    @FindBy(xpath = "//li[@class='carousel-menu active']")
    private WebElement carosel_active_movie;


    public Home(WebDriver driver)
    {
        super(driver);
    }

    public boolean HomePageLogo(){
        boolean logo= this.header_logo.isDisplayed();
        return logo;
    }

    public boolean HeaderMovies(){
        boolean header= this.header_movie.isDisplayed();
        return header;
    }

    public boolean HeaderTelevision(){
        boolean tv= this.header_television.isDisplayed();
        return tv;
    }

    public boolean HeaderMylist(){
        boolean header= this.header_mylist.isDisplayed();
        return header;
    }

    public boolean HeaderLogoutButton(){
        boolean logout= this.header_logout_button.isDisplayed();
        return logout;
    }

    public boolean ClickMovies() throws InterruptedException {
        sleep(8000);
        this.header_movie.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(this.all_movies_television));
        boolean movie= this.all_movies_television.isDisplayed();
        return movie;
    }

    public String MovieListViewDetailButton() throws InterruptedException {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        sleep(4000);
        WebElement title= this.movie_card_view_details;
//        je.executeScript("arguments[0].scrollIntoView(true);",title);
        je.executeScript("window.scrollBy(0, 800)",title);
        sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(title).perform();
        title.click();
        String mgmtitle=driver.getTitle();
        System.out.println(mgmtitle);
        return mgmtitle;
    }

    public boolean VerifySynopsisTitle() throws InterruptedException {
        sleep(10000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement title= this.synopsis_title;
        je.executeScript("window.scrollBy(0, 600)",title);
        sleep(3000);
        boolean name= title.isDisplayed();
        return name;
    }

    public boolean ClickLogo() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(this.your_lists_sec));
        boolean movie= this.header_movie.isDisplayed();
        return movie;
    }

    public void accept_cookies(){
        this.cookies_accept.click();
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.cookies_accept));
            WebElement data = this.cookies_accept;
            if (data.isDisplayed()) {
                wait.until(ExpectedConditions.visibilityOfElementLocated((By) this.cookies_accept));
                this.cookies_accept.click();
            }
        } catch (Exception e) {
            System.out.println("not in try");
        }
    }
    public boolean SliderTitleHighlighted() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 80);
        wait.until(ExpectedConditions.visibilityOf(this.your_lists_sec));
        sleep(5000);
        boolean movie= this.titles_underligned.isDisplayed();
        return movie;
    }

    public boolean VerifyScroll() throws InterruptedException {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(this.see_all_movies));
        WebElement condition= this.see_all_movies;
        je.executeScript("window.scrollBy(0, 1200)",condition);
        sleep(3000);
        boolean display= this.see_all_movies.isDisplayed();
        return display;
    }

    public void refeshpage() throws InterruptedException {
        driver.navigate().refresh();
        sleep(5000);
    }

    public boolean ClickTelevision()
    {
        this.header_television.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(this.all_movies_television));
        boolean movie= this.all_movies_television.isDisplayed();
        return movie;
    }

    public int Maximum4Titles() throws InterruptedException {
        sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, 45);
        wait.until(ExpectedConditions.visibilityOf(this.your_lists_sec));
        sleep(10000);
        List<WebElement> ele= driver.findElements(By.xpath("//ul[@class='carousel-menu-list']/li"));
        int i= ele.size();
        System.out.println(i);
        return i;

    }

    public boolean ClickLists()
    {
        this.header_mylist.click();
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(this.lists));
        boolean movie= this.lists.isDisplayed();
        return movie;
    }

    public boolean ClickLogoutButton() throws InterruptedException {
        sleep(6000);
        this.header_logout_button.click();
        sleep(6000);
        boolean email= this.email_textbox.isDisplayed();
        return email;
    }

    public boolean HomepageElementHeader() throws InterruptedException {
        sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(this.header_movie));
        boolean header= this.header.isDisplayed();
        return header;
    }

    public boolean HomepageMainCarousel(){
        boolean header= this.carousel.isDisplayed();
        return header;
    }

    public boolean HomepageMovieList1() throws InterruptedException {
        Thread.sleep(3000);
        boolean header= this.movie_list_Mylist.isDisplayed();
        return header;
    }

    public boolean HomepageMovieList3(){
        Actions builder = new Actions(driver);
        for (int i = 0; i < 3; i++) {
            builder.sendKeys(Keys.PAGE_DOWN).perform();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        boolean header= this.movie_list_bond.isDisplayed();
        return header;
    }



    public boolean HomepageMovieList4(){
        boolean header= this.movie_list_actionhits.isDisplayed();
        return header;
    }

    public boolean HomepageMovieList5(){
        boolean header= this.movie_list_halloween.isDisplayed();
        return header;
    }

    public boolean HomepageMovieList6(){
        boolean header= this.movie_list_christmas.isDisplayed();
        return header;
    }


    public boolean HomepageMovieList7(){
        boolean header= this.movie_list_legallyblonde.isDisplayed();
        return header;
    }

    public boolean HomepageExploreAllTvShows(){
        boolean header= this.see_all_tv_shows.isDisplayed();
        return header;
    }

    public boolean HomepageExploreAllMovies(){
        boolean header= this.see_all_movies.isDisplayed();
        return header;
    }
    public boolean HomepageFooterLogo(){
        boolean header= this.footer_logo.isDisplayed();
        return header;
    }

    public boolean HomepageFooterPrivacy(){
        boolean header= this.privacy_policy.isDisplayed();
        return header;
    }

    public boolean HomepageFooterTerms(){
        boolean header= this.terms_of_use.isDisplayed();
        return header;
    }

    public boolean HomepageFooterSupport(){
        boolean header= this.support.isDisplayed();
        return header;
    }

    public boolean MovieImageSlider(){
        boolean header= this.movie_image_slider.isDisplayed();
        return header;
    }

    public boolean ProgressBar(){
        boolean header= this.carousel_progress_bar.isDisplayed();
        return header;
    }

    public boolean ProgressBarSpectre(){
        boolean header= this.progress_bar_spectre.isDisplayed();
        return header;
    }
    public boolean ProgressBarArmyOfDarkness(){
        boolean header= this.progress_bar_armyofdarkness.isDisplayed();
        return header;
    }

    public boolean ProgressBarMagnificent(){
        boolean header= this.progress_bar_magnificent.isDisplayed();
        return header;
    }

    public boolean ProgressBarRockey(){
        boolean header= this.progress_bar_rocky.isDisplayed();
        return header;
    }

    public boolean ProgressBarPreviousArrow(){
        boolean header= this.previous_navigtion.isDisplayed();
        return header;
    }
    public boolean ProgressBarNextArrow(){
        boolean header= this.next_navigation.isDisplayed();
        return header;
    }

    public boolean ProgressBarWitchHunter(){
        boolean header= this.progress_bar_witch_hunter.isDisplayed();
        return header;
    }

    public boolean movie_logoCarousel(){
        try {
            WebElement logo = driver.findElement(By.xpath("//div[@class='carousel-item active']//img[@class='movie-logo image-loaded']"));
            if (logo.isDisplayed())
            {
                System.out.println("if");
            }
            else {
                driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
            }
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        }
        boolean element= driver.findElement(By.xpath("//div[@class='carousel-item active']//img[@class='movie-logo image-loaded']")).isDisplayed();
        return element;
    }


    public boolean WatchNowButton(){
        try {
            WebElement logo = driver.findElement(By.xpath("//div[@class='carousel-item active']//div[@class='movie-content']//div[@class='btn-container']//div//button[contains(text(),'Watch Now')]"));
            if (logo.isDisplayed())
            {
                System.out.println("if");
            }
            else {
                driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
            }
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        }
        boolean element= driver.findElement(By.xpath("//div[@class='carousel-item active']//div[@class='movie-content']//div[@class='btn-container']//div//button[contains(text(),'Watch Now')]")).isDisplayed();
        return element;
    }

    public boolean AddToListButton(){
        try {
            WebElement logo = driver.findElement(By.xpath("//div[@class='carousel-item active']//button[contains(text(),'ADD TO LIST')]"));
            if (logo.isDisplayed())
            {
                System.out.println("if");
            }
            else {
                driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
            }
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        }
        boolean element= driver.findElement(By.xpath("//div[@class='carousel-item active']//button[contains(text(),'ADD TO LIST')]")).isDisplayed();
        return element;
    }

    public boolean ViewDetailsButton() throws InterruptedException {
        sleep(5000);
        try {
            WebElement logo = driver.findElement(By.xpath("//div[@class='carousel-item active']//button[contains(text(),'View details')]"));
            if (logo.isDisplayed())
            {
                System.out.println("if");
            }
            else {
                driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
            }
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        }
        boolean element= driver.findElement(By.xpath("//div[@class='carousel-item active']//button[contains(text(),'View details')]")).isDisplayed();
        return element;
    }


    public boolean ClickViewDetailsButton() throws InterruptedException {
        this.view_details.click();
        sleep(3000);
        driver.navigate().refresh();
        sleep(8000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement title= this.synopsis_title;
        je.executeScript("window.scrollBy(0, 800)",title);
        sleep(3000);
        boolean bool= title.isDisplayed();
        return bool;
    }

    public void ClickMainCarouselAddToList() throws InterruptedException {
        sleep(5000);
        try {
            WebElement logo = driver.findElement(By.xpath("//div[@class='carousel-item active']//button[contains(text(),'ADD TO LIST')]"));
            if (logo.isDisplayed())
            {
                logo.click();
                System.out.println("if");
            }
            else {
                driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
            }
        }
        catch (Exception e) {
            driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']")).click();
        }
    }

    public boolean AddToListSearchBox() throws InterruptedException {
        Thread.sleep(5000);
        boolean header= this.add_to_list_search.isDisplayed();
        return header;
    }

    public boolean AddToListClearButton(){
        boolean header= this.add_to_list_clear.isDisplayed();
        return header;
    }

    public boolean AddToListCreatedList(){
        boolean header= this.add_to_list_list_name.isDisplayed();
        return header;
    }

    public void ListName(String name){
        this.add_to_list_enter_name.sendKeys(name);
    }

    public boolean ClickCreateList() throws InterruptedException {
        Thread.sleep(5000);
        this.add_to_list_create_list.click();
        sleep(3000);
        boolean list= this.add_to_list_creating.isDisplayed();
        return list;
    }

    public boolean CreatedList() throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(this.add_to_list_created));
        boolean movie= this.add_to_list_created.isDisplayed();
        sleep(5000);
        return movie;
    }

    public String NewList() throws InterruptedException {
        sleep(8000);
        String list= driver.findElement(add_to_list_toggle_button_demo).getText();
        return list;
    }

    public boolean AddToListToggelButton(){
        boolean header= this.add_to_list_toggel_button.isDisplayed();
        return header;
    }
    public boolean AddToListCreateList(){
        boolean header= this.add_to_list_create_list.isDisplayed();
        return header;
    }

    public void AddMovieToList() throws InterruptedException {
        this.add_to_list.click();
        sleep(5000);
    }

    public boolean verify_success_text() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOf(this.success_created));
        boolean text= this.success_created.isDisplayed();
        return text;
    }

    public boolean AddToListAddedButton() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.until(ExpectedConditions.visibilityOf(this.add_to_list_added_button));
        boolean text= this.add_to_list_added_button.isDisplayed();
        return text;
    }

    public void ClickToggleButtonTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(toggle_button_test).click();
        Thread.sleep(5000);
    }

    public void ClickToggleButtonTest2() throws InterruptedException {
        driver.findElement(toggle_button_test2).click();
        Thread.sleep(5000);
    }

    public void ClickToggleButtonTest1() throws InterruptedException {
        driver.findElement(toggle_button_test1).click();
        Thread.sleep(5000);
    }

    public boolean VerifySelectList()
    {
        driver.findElement(add_to_list_toggle_button_demo).click();
        boolean b= driver.findElement(demo_toggle_button).isSelected();
        return b;
    }

    public void SearchList(String name)
    {
        this.add_to_list_search.sendKeys(name);
    }

    public boolean VerifySearchedList()
    {
        boolean b= driver.findElement(add_to_list_toggel_button1).isSelected();
        return b;
    }
    public boolean MovieCardVerifySelectUnselectList()
    {
        driver.findElement(add_to_list_toggel_button1).click();
        boolean b= driver.findElement(test_toggle_button).isSelected();
        return b;
    }

}
