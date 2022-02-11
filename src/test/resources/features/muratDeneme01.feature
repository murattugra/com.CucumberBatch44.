Feature: Murat Deneme01

  Scenario: TC_01 Murat Deneme

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    And kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCWrongPassword" girer
    And login butonuna basar
    Then giris yapilamadigini test eder
    Then sayfayi kapatir