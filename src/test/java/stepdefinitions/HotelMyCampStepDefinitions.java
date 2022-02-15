package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Fakat;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HMCPAge;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class HotelMyCampStepDefinitions {

    HMCPAge hotelMyCampPage=new HMCPAge();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hotelMyCampPage.ilkLoginLinki.click();

    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciAdi) {
    hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty(kullaniciAdi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("login butonuna tiklar")
    public void login_butonuna_basar() {
        hotelMyCampPage.loginButonu.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue( hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
    }

    @Then("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
    }


    @Then("scenario outline'dan kullanici adi olarak{string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hotelMyCampPage.usernameBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak{string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hotelMyCampPage.passwordBox.sendKeys(password);
    }



    @Then("Hotel Management  butonuna tiklar")
    public void hotel_management_butonuna_tiklar() {
        hotelMyCampPage.hotelManagementLinki.click();
    }
    @Then("Hotel Rooms butonuna tiklar")
    public void hotel_rooms_butonuna_tiklar() {
        hotelMyCampPage.hotelRoomsLinki.click();
    }
    @Then("Açılan sayfadaki tüm metin kutularına istediğiniz verileri girer")
    public void açılan_sayfadaki_tüm_metin_kutularına_istediğiniz_verileri_girer() {
        Faker faker=new Faker();
        Select select=new Select(hotelMyCampPage.addTableIDHotelBox);
        select.selectByIndex(faker.random().nextInt(1,hotelMyCampPage.addTableIDHotelRoomsList.size()-1));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(faker.code().ean13())
                .sendKeys(Keys.TAB).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.TAB).sendKeys(faker.letterify("Deneme"))
                .sendKeys(Keys.TAB).sendKeys(faker.number().digit()).perform();
        Select select1=new Select(hotelMyCampPage.roomTypeBox);
        select1.selectByIndex(faker.random().nextInt(0,9));

        actions.sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).click().perform();


    }
    @Then("Save butonuna tıklayın.")
    public void save_butonuna_tıklayın() {
       hotelMyCampPage.roomsEklemeSaveButonu.click();
    }
    @When("“Hotel was inserted successfully” textinin göründüğünü test eder")
    public void hotel_was_inserted_successfully_textinin_göründüğünü_test_eder() {
        Assert.assertTrue(hotelMyCampPage.basariliOdaEklendiYazisi.isDisplayed());
    }
    @Then("OK butonuna tıklayın")
    public void ok_butonuna_tıklayın() {
        hotelMyCampPage.basariliGirisYazisindanSonrakiOkButonu.click();
    }

    @And("addHotelRoom butonuna basar")
    public void addhotelroomButonunaBasar() {
        hotelMyCampPage.addHotelRoomButtonu.click();
    }
}
