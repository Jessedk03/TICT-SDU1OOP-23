import com.oop.Auto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoTest {

    @Test
    public void testOfHuidigeWaardeVanAutoOokKloptNaZesJaar() {
        int zesJaarTerugVanNu = LocalDate.now().getYear() - 6;

        Auto auto = new Auto("Ford Fiesta", 7000, zesJaarTerugVanNu, "GNR-41-L");
        assertEquals(700.0, auto.huidigeWaarde());
    }

    @Test
    public void testOfHuidigeWaardeVanAutoOokKloptMetBouwjaarVanDitJaar() {
        int bouwJaarNu = LocalDate.now().getYear();

        Auto auto = new Auto("Ford Fiesta", 7000, bouwJaarNu, "GNR-41-L");
        assertEquals(7000, auto.huidigeWaarde());
    }
}
