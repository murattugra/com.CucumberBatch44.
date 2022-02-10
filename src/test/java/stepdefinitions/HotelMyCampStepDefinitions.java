package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;

public class HotelMyCampStepDefinitions {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
        hotelMyCampPage.ilkLoginLinki.click();

    }
    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullaniciAdi) {
    hotelMyCampPage.usernameBox.sendKeys(kullaniciAdi);
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        hotelMyCampPage.passwordBox.sendKeys(password);

    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hotelMyCampPage.loginButonu.click();

    }
    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue( hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
    }

}
