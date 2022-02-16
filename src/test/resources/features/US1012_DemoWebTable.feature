Feature: US1012 Kullanici istedigi basliktaki tum bilgileri listeler
@DemoGuru
  Scenario: TC17 Kullanici istedigi basliktaki bilgileri listeleyebilmeli

    Given kullanici "DemoGuruUrl" sayfasina gider
    And  kullanici cookies i kabul eder
    And "Conpany", sutunundaki tum degerleri yazdirir

