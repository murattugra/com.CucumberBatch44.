package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCPAge {


    public HMCPAge(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki ;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[text()='Try again please']")
    public  WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[.='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;


    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSaveSuccesWord;





    //  -->hotelManagement-->HotelRooms--> List Of Hotel Rooms

    @FindBy(xpath = "(//i[@class='icon-calendar'])[3]")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement listOfUsersYazisi;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement listOfHotelYazisi;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoomButtonu;

    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement addTableIDHotelBox;

    @FindBy(xpath = "//select//option")
    public List<WebElement> addTableIDHotelRoomsList;

    @FindBy(id = "IDGroupRoomType")
    public WebElement roomTypeBox;

    @FindBy(xpath = "//div[.='HotelRoom was inserted successfully']")
    public WebElement basariliOdaEklendiYazisi;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement basariliGirisYazisindanSonrakiOkButonu;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement roomsEklemeSaveButonu;

}
