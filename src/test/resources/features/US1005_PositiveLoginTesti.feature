
Feature: Us1005 Positive login testi
@hotel
  Scenario: TC_08 Positive login

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then kullanici adi olarak "ValidUsername" girer
    And password olarak "ValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir

