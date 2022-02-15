
Feature: D17_CreateHotel

  Scenario: Hotel add

  Given kullanici "HMCUrl" sayfasina gider
  And login linkine tiklar
  Then kullanici adi olarak "HMCValidUsername" girer
  And password olarak "HMCValidPassword" girer
  And login butonuna tiklar
  Then Hotel Management  butonuna tiklar
  And  Hotel Rooms butonuna tiklar
  And  addHotelRoom butonuna basar
  Then Açılan sayfadaki tüm metin kutularına istediğiniz verileri girer
  And  Save butonuna tıklayın.
  And 10 saniye bekler
  When “Hotel was inserted successfully” textinin göründüğünü test eder
  Then OK butonuna tıklayın





