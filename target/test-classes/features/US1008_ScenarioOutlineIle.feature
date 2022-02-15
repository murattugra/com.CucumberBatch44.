@SO
Feature: US1008 Scenario Outline kullanarak farki  degerlerle negative login testi

  Scenario Outline: TC13 farkli kullanici adi ve password

    Given kullanici "HMCUrl" sayfasina gider
    And login linkine tiklar
    Then scenario outline'dan kullanici adi olarak"<username>" yazar
    And scenario outline'dan password olarak"<password>" yazar
    And login butonuna tiklar
    Then giris yapilamadigini test eder





    Examples:
    |username|password|
    |MANAGER |MANAGER1 |
    |manager |manager1 |
    |MANaged |MANager1a|
    |        |a        |

