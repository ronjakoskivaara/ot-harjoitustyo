/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.unicafe.Kassapaate;
import com.mycompany.unicafe.Maksukortti;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koskiron
 */
public class KassapaateTest {
    
    Kassapaate kassa;
    Maksukortti kortti;
    
    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(500);
    }
    @Test 
    public void uudenKassanRahamaaraOikein() {
        assertEquals(100000, kassa.kassassaRahaa());
    }
    @Test
    public void uudenKassanEdullisiaMyytyNolla() {
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    @Test 
    public void uudenKassanMaukkaitaMyytyNolla() {
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    @Test
    public void kateisellaEdullisestiRahamaaraKasvaaOikein() {
        kassa.syoEdullisesti(500);
        assertEquals(100240, kassa.kassassaRahaa());
    }
    @Test
    public void kateisellaEdullisestiOikeaVaihtoraha() {
        assertEquals(260, kassa.syoEdullisesti(500));
    }
    @Test
    public void kateisellaEdullisestiLounaatKasvaa(){
        kassa.syoEdullisesti(240);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void kateisellaEdullisestiLiianVahanRahaaVaihtoraha() {
        assertEquals(200, kassa.syoEdullisesti(200));
    }
    @Test
    public void kateisellaEdullisestiLiianVahanRahaaLounasmaara() {
        kassa.syoEdullisesti(150);
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void kateisellaMaukkaastiRahamaaraKasvaaOikein() {
        kassa.syoMaukkaasti(500);
        assertEquals(100400, kassa.kassassaRahaa());
    }
    @Test
    public void kateisellaMaukkaastiOikeaVaihtoraha() {
        assertEquals(100, kassa.syoMaukkaasti(500));
    }
    @Test
    public void kateisellaMaukkaastiLounaatKasvaa() {
        kassa.syoMaukkaasti(400);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    @Test
    public void kateisellaMaukkaastiLiianVahanRahaaVaihtoraha() {
        assertEquals(300, kassa.syoMaukkaasti(300));
    }
    @Test
    public void kateisellaMaukkaastiLiianVahanRahaaLounasmaara() {
        kassa.syoMaukkaasti(200);
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void kortillaEdullisestiSummaVeloitetaan() {
        kassa.syoEdullisesti(kortti);
        assertEquals(260, kortti.saldo());
    }
    @Test
    public void edullisestiKortillaTarpeeksiRahaaPalauttaaTrue() {
        assertEquals(true, kassa.syoEdullisesti(kortti));
    }
    @Test
    public void edullisestiKortillaLounaatKasvaa() {
        kassa.syoEdullisesti(kortti);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void edullisestiKortillaLiianVahanRahaaSaldoEiMuutu() {
        kortti.otaRahaa(300);
        kassa.syoEdullisesti(kortti);
        assertEquals(200, kortti.saldo());
    }
    @Test
    public void edullisestiKortillaLiianVahanRahaaPalauttaaFalse() {
        kortti.otaRahaa(300);
        assertEquals(false, kassa.syoEdullisesti(kortti));
    }
    @Test
    public void edullisestiKortillaLiianVahanRahaaLounasmaara() {
        kortti.otaRahaa(300);
        kassa.syoEdullisesti(kortti);
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void edullisestiKortillaKassanRahamaaraEiMuutu() {
        kassa.syoEdullisesti(kortti);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void kortillaMaukkaastiSummaVeloitetaan() {
        kassa.syoMaukkaasti(kortti);
        assertEquals(100, kortti.saldo());
    }
    @Test
    public void maukkaastiKortillaTarpeeksiRahaaPalauttaaTrue() {
        assertEquals(true, kassa.syoMaukkaasti(kortti));
    }
    @Test
    public void maukkaastiKortillaLounaatKasvaa() {
        kassa.syoMaukkaasti(kortti);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    @Test
    public void maukkaastiKortillaLiianVahanRahaaSaldoEiMuutu() {
        kortti.otaRahaa(200);
        kassa.syoMaukkaasti(kortti);
        assertEquals(300, kortti.saldo());
    }
    @Test
    public void maukkaastiKortillaLiianVahanRahaaPalauttaaFalse() {
        kortti.otaRahaa(150);
        assertEquals(false, kassa.syoMaukkaasti(kortti));
    }
    @Test
    public void maukkaastiKortillaLiianVahanRahaaLounasmaara() {
        kortti.otaRahaa(200);
        kassa.syoMaukkaasti(kortti);
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    @Test
    public void maukkaastiKortillaKassanRahamaaraEiMuutu() {
        kassa.syoMaukkaasti(kortti);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void kortilleLatausSaldoKasvaaOikein() {
        kassa.lataaRahaaKortille(kortti, 500);
        assertEquals(1000, kortti.saldo());
    }
    @Test
    public void kortilleLadatessaKassanRahamaaraKasvaa() {
        kassa.lataaRahaaKortille(kortti, 500);
        assertEquals(100500, kassa.kassassaRahaa());
    }
    @Test
    public void kortilleNegatiivistaLadatessaSaldoEiMuutu() {
        kassa.lataaRahaaKortille(kortti, -5);
        assertEquals(500, kortti.saldo());
    }
   
}

