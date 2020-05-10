# Päässälaskusovellus

Sovelluksella voi harjoitella helppoja matematiikan plus- ja miinuspäässälaskuja.  

## Releaset
[Loppupalautus](https://github.com/ronjakoskivaara/ot-harjoitustyo/releases/tag/loppupalautus)
[Viikko 5](https://github.com/ronjakoskivaara/ot-harjoitustyo/releases)

## Dokumentaatio
[Käyttöohje](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/kayttoohje.md)  
[Työaikakirjanpito](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/tuntikirjanpito.md)  
[Vaatimusmäärittely](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/vaatimusmaarittely.md)  
[Arkkitehtuurikuvaus](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/arkkitehtuuri.md)  

## Komentorivitoiminnot
### Testaus
Testit komennolla  
`mvn test`  
Testikattavuusraportti komennolla  
`mvn jacoco:report`  
Kattavuusraporttia voi tarkastella avaamalla selaimella tiedoston target/site/jacoco/index.html  
### Suoritettavan jarin generointi
Komento  
`mvn package`  
luo hakemistoon target suoritettavan jar-tiedoston PaassalaskuHarjoitus-1.0-SNAPSHOT.jar  
### JavaDoc
JavaDoc generoidaan komennolla  
`mvn javadoc:javadoc`  
JavaDocia voi tarkastella avaamalla selaimella tiedoston target/site/apidocs/index.html  
### Checkstyle
Tiedostoon [checkstyle.xml](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla  
`mvn jxr:jxr checkstyle:checkstyle`  
Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html  






