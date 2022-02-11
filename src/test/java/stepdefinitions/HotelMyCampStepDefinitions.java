package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPAge;
import utilities.ConfigReader;

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
}
