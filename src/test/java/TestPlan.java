import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestPlan {


    public loginPage login;
    public Home home;
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void mainSuite() {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);

    }

    @Test(priority = 1, testName = "1) Login a MGM logins")
    @Description("Verify Carousel image and login with email and password")
    public static void verifycarousalimage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        loginPage login = new loginPage(driver);
        Assert.assertEquals(login.load(), "Log in to MGM ROAR");
        Assert.assertTrue(login.CarouselImage());
        Assert.assertTrue(login.DifferentCarouselImage());
        Assert.assertTrue(login.VerifyNextButton());
        Assert.assertTrue(login.VerifyRequestAnAccount());
        Assert.assertTrue(login.VerifyNextButton());
    }

    @Test(priority = 2, testName = "2) Login a MGM logins")
    @Description("Enter login crendentail and login successful")
    public static void logindetail() throws InterruptedException {
        loginPage login = new loginPage(driver);
        Assert.assertTrue(login.enterEmailName());
        login.ClickNext();
        login.EnterPassword();
        login.ClickNext();
        Thread.sleep(5000);
        Assert.assertTrue(login.VerifyLogin());

    }

    @Test(priority = 3, testName = "3) Verify elements present in global header")
    @Description("Verify homepage elements")
    public static void test_ElementsGlobalHeader() throws InterruptedException {
        Home home = new Home(driver);
        Thread.sleep(5000);
        System.out.println("Yes");
        Assert.assertTrue(home.HomePageLogo());
//        Assert.assertTrue(home.HeaderMovies());
//        Assert.assertTrue(home.HeaderTelevision());
//        Assert.assertTrue(home.HeaderMylist());
//        Assert.assertTrue(home.HeaderLogoutButton());
//        Thread.sleep(12000);
////        home.MovieListViewDetailButton();
    }

//    @Test(priority = 4, testName = "4) Verify functionality of View Details button")
//    @Description("Verify the Title is underlined(highlighted) when carousel moves to that slider")
//    public static void test_FunctionalityViewDetailButton() throws InterruptedException {
//        Home home = new Home(driver);
//        System.out.println("2nd one");
//        home.accept_cookies();
//        Thread.sleep(5000);
//        String title = home.MovieListViewDetailButton();
//        Assert.assertEquals(title, "ROAR | Home");
//        Assert.assertTrue(home.VerifySynopsisTitle());
//        Assert.assertTrue(home.ClickLogo());
//        Assert.assertTrue(home.SliderTitleHighlighted());
//        Assert.assertTrue(home.VerifyScroll());
//    }
//
//
//    @Test(priority=5, testName = "5) Verify maximum 4 titles are shown on the Progress Bar")
//    @Description("Verify Movie links are clickable and redirects to correct page")
//    public static void test_MenuLinksClickable() throws InterruptedException {
//        Home home = new Home(driver);
//        home.refeshpage();
//        Assert.assertEquals(home.Maximum4Titles(),4);
//        Assert.assertTrue(home.ClickMovies());
//        home.ClickLogo();
//        Assert.assertTrue(home.ClickTelevision());
//        home.ClickLogo();
//        Assert.assertTrue(home.ClickLists());
//        home.ClickLogo();
//    }

    @Test(priority=6, testName = "6) Verify on click of Logout button, user is successfully logged out")
    @Description("Verify Element Present in homepage")
    public static void test_ElementsHomepage() throws InterruptedException {
        Home home = new Home(driver);
//        Assert.assertTrue(home.ClickLogoutButton());
//        logindetail();
        Assert.assertTrue(home.HomepageElementHeader());
        Assert.assertTrue(home.HomepageMainCarousel());
        Assert.assertTrue(home.HomepageMovieList1());
        Assert.assertTrue(home.HomepageMovieList3());
        Assert.assertTrue(home.HomepageMovieList4());
        Assert.assertTrue(home.HomepageMovieList5());
        Assert.assertTrue(home.HomepageMovieList6());
        Assert.assertTrue(home.HomepageMovieList7());
        Assert.assertTrue(home.HomepageExploreAllTvShows());
        Assert.assertTrue(home.HomepageExploreAllMovies());
        Assert.assertTrue(home.HomepageFooterLogo());
        Assert.assertTrue(home.HomepageFooterPrivacy());
        Assert.assertTrue(home.HomepageFooterTerms());
        Assert.assertTrue(home.HomepageFooterSupport());
        Assert.assertTrue(home.MovieImageSlider());
        Assert.assertTrue(home.ProgressBar());
        Assert.assertTrue(home.ProgressBarPreviousArrow());
    }

    @Test(priority=7, testName = "7) Verify elements present in Movie image slider")
    @Description("Verify on click of Add to List button, Add List pop up is opened")
    public static void test_ElementsMovieImageSlider() throws InterruptedException {
        Home home = new Home(driver);
        Assert.assertTrue(home.ProgressBarNextArrow());
        Assert.assertTrue(home.movie_logoCarousel());
        Assert.assertTrue(home.WatchNowButton());
        Assert.assertTrue(home.AddToListButton());
//        Assert.assertTrue(home.ClickViewDetailsButton());
        Assert.assertTrue(home.ViewDetailsButton());
    }


    @Test(priority=8, testName = "8) Verify user is able to enter name and create new list from Carousel")
    @Description("Verify elements in Add To List pop")
    public static void test_AddToListPopUp() throws InterruptedException {
        Home home = new Home(driver);
        home.ClickMainCarouselAddToList();
        Assert.assertTrue(home.AddToListSearchBox());
        home.ListName("Demo"+home.rand_int2);
        home.ClickCreateList();
        Assert.assertTrue(home.CreatedList());
        Thread.sleep(6000);
        Assert.assertEquals(home.NewList(),"Demo"+home.rand_int2);
        Thread.sleep(5000);
        home.ListName("Test"+home.rand_int2);
        home.ClickCreateList();
        Assert.assertTrue(home.CreatedList());
        Thread.sleep(4000);
        Assert.assertTrue(home.AddToListSearchBox());
        Assert.assertTrue(home.AddToListClearButton());
        Assert.assertTrue(home.AddToListCreatedList());
        Assert.assertTrue(home.AddToListToggelButton());
        Assert.assertTrue(home.AddToListCreateList());
    }

    @Test(priority=9, testName = "9) Verify user is able to add the movie in the created list")
    @Description("Verify added Movie")
    public static void test_AddToList() throws InterruptedException {
        Home home = new Home(driver);
        home.AddMovieToList();
        Assert.assertTrue(home.verify_success_text());
        home.ClickLogo();
        home.ClickMainCarouselAddToList();
        Thread.sleep(8000);
        home.ClickToggleButtonTest();
        home.AddMovieToList();
        Assert.assertTrue(home.AddToListAddedButton());
        home.ClickLogo();
        home.ClickMainCarouselAddToList();
        Assert.assertTrue(home.VerifySelectList());

    }

    @Test(priority=10, testName = "10) Verify user is able to un-select any selected list(s)")
    @Description("Verify user is abe to search a list from the search bar")
    public static void test_AddToListToggelButton() throws InterruptedException {
        Home home = new Home(driver);
        Assert.assertFalse(home.VerifySelectList());
        home.SearchList("Test" + home.rand_int2);
        Assert.assertTrue(home.VerifySearchedList());
        Assert.assertTrue(home.MovieCardVerifySelectUnselectList());
        Assert.assertFalse(home.MovieCardVerifySelectUnselectList());


    }


    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
