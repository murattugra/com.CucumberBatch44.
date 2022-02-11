
Feature: US1009 Scenario Outline ile editor database sayfasina kayit
@Editor
  Scenario :TC14 kullanici yeni kayit ekleyebilmeli

    Given kullanici editor sayfasina gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And Start date olarak "<startDate>" yazar
    And Salary olarak "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunde "<firstname>" oldugunu dogrular



