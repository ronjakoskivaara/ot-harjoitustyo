# Testausdokumentti  
Ohjelmaa on testattu yksittäisillä JUnit-testeillä, sekä manuaalisesti ohjelmaa käytettäessä.  

## Yksikkö- ja integraatiotestaus  

### Sovelluslogiikka
Sovelluslogiikkaa testataan yksikkötesteillä testausten pakkauksessa domain luokissa RandomGeneratorForSubtractionTest, 
RandomGeneratorForSumTest, SubtractionTest ja SumTest. Koska luokat käyttävät randomeilla arvottuja numeroita testaus perustuu enimmäkseen siihen, että metodit todella palauttavat numeroita, eivät esimerkiksi tekstiä.

### Testauskattavuus
Testauskattavuus on yli vaaditun 70 prosentin. Koska luokat käyttävät randomeita, olisi testikattavuus vaikeaa rakentaa korkeammaksi.

## Järjestelmätestaus
Järjestelmätestaus on suoritettu manuaalisesti käyttämällä ohjelmaa. Vaatimusmäärittelyn toiminnallisuudet toimivat kaikki. 

## Sovellukseen jääneet laatuongelmat
Jos sovellus jostain syystä kaatuu kokonaan jostain virheestä, ei tule virheilmoitusta. Sovelluksen voi lopettaa vain sulkemalla sen raksista. 
Testaus ei ole ehkä niin mielekästä, kuin se voisi olla paljon käytettyjen satunnaisten lukujen vuoksi.
