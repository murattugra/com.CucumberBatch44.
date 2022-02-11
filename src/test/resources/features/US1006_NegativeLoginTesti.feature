@negativeTest
Feature: US1006 NEgative Login Testi

  Scenario: TC09 yanlis username, dogru sifre ile giris yapilamaz


    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login butonuna tiklar
    And giris yapilamadigini test eder

  Scenario: TC10 dogru username, yanlis sifre ile giris tapilamaz

      Given kullanici "HMCUrl" sayfasina gider
      Then login linkine tiklar
      And kullanici adi olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna tiklar
      And giris yapilamadigini test eder

  Scenario: TC11 yanlis username, yanlis sifre ile giris tapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then login linkine tiklar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCWrongPassword" girer
    Then login butonuna tiklar
    And giris yapilamadigini test eder
