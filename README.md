# Päässälaskusovellus

Sovelluksella voi harjoitella helppoja päässälaskuja.  

## Releaset
[Viikko 5](https://github.com/ronjakoskivaara/ot-harjoitustyo/releases)

## Dokumentaatio
[Käyttöohje](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/kayttoohje.md)  
[Työaikakirjanpito](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/tuntikirjanpito.md)  
[Vaatimusmäärittely](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/vaatimusmaarittely.md)  
[Arkkitehtuurikuvaus](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/dokumentaatio/arkkitehtuuri.md)  

## Komentorivitoiminnot
### Testaus
Testit suoritetaan komennolla  
`mvn test`  
Testikattavuusraportti luodaan komennolla  
`mvn jacoco:report`  
Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html  
### Suoritettavan jarin generointi
Komento  
`mvn package`  
generoi hakemistoon target suoritettavan jar-tiedoston PaassalaskuHarjoitus-1.0-SNAPSHOT.jar  
### JavaDoc
JavaDoc generoidaan komennolla  
`mvn javadoc:javadoc`  
JavaDocia voi tarkastella avaamalla selaimella tiedosto target/site/apidocs/index.html  
### Checkstyle
Tiedostoon [checkstyle.xml](https://github.com/ronjakoskivaara/ot-harjoitustyo/blob/master/PaassalaskuHarjoitus/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla  
`mvn jxr:jxr checkstyle:checkstyle`  
Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html  






