Feature: Us1011 WenUniversity Window Handle

  Scenario Outline: TC16 Reusable Methods ile window Handle Testi

    Given kullanici "WebUniversityUrl" sayfasina gider
    And Login Portal'a  kadar asagi iner
    And Login Portal'a  tiklar
    Then acilan Diger window'a gecer
    And "<username>" ve  "<password>" kutularina deger yazdirin
    And WebUniversity Login butonuna basar
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    And Ilk sayfaya donuldugunu test eder





    Examples:

      |username|password|
      |Mustafa |Donat   |

