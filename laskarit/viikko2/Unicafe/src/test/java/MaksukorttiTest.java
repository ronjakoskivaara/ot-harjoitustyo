/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MaksukorttiTest {
    
    Maksukortti kortti;
    
    @Before
    public void setUp() {
        kortti = new Maksukortti(1000);
    }
    @Test
    public void saldoPalautuuOikein() {
        assertEquals(1000, kortti.saldo());
    }
    @Test
    public void rahanLataaminenKasvattaaSaldoa() {
        kortti.lataaRahaa(525);
        assertEquals("saldo: 15.25", kortti.toString());
    }
    @Test
    public void saldoVaheneeOikeinKunTarpeeksiRahaa() {
        kortti.otaRahaa(500);
        assertEquals("saldo: 5.0", kortti.toString());
    }
    @Test
    public void saldoEiMuutuKunRahaaEiTarpeeksi() {
        kortti.otaRahaa(1500);
        assertEquals("saldo: 10.0", kortti.toString());
    }
    @Test
    public void liianVahanRahaaPalauttaaFalse() {
        assertEquals(false, kortti.otaRahaa(1500));
    }
    @Test
    public void tarpeeksiRahaaPalauttaaTrue() {
        assertEquals(true, kortti.otaRahaa(500));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
