Feature: Parametre ile istenen Sayfaya gitme

  Scenario: TC06 Eski usul amazona gitme

    Given kullanici amazon sayfasina gider
   # Then kullanici techproeducation sayfasina gider

  Scenario: TC07 parametre ile istenen sayfaya gitme

    Given kullanici "AmazonUrl" sayfasina gider
    Then kullanici "DemoqaUrl" sayfasina gider

