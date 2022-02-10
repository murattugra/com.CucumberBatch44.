package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@hotel",
        dryRun = false

)

public class Runner {

    // Runner class inin body sine hicbir kod yazmiyoruz
    // Bu clas icin onemli olan kullanacagimiz iki adaet notasyon
    //




}
