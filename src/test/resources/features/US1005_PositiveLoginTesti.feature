
Feature: Us1005 Positive login testi
@hotel
  Scenario: TC_08 Positive login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna tiklar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir

