import com.oop.Fiets;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FietsTest {

    @Test
    public void testOfHuidigeWaardeKloptNaZesJaar() {
        // Hier zorg ik ervoor dat het bouwjaar altijd 6 terug de tijd is.
        int zesJaarTerugVanNu = LocalDate.now().getYear() - 6;

        Fiets fiets = new Fiets("Batavus", 500.0, zesJaarTerugVanNu, 120120);
        assertEquals(200.0, fiets.huidigeWaarde());
    }

    @Test
    public void testOfHuidigeWaardeKloptWanneerDeFietsDitJaarGemaaktIs() {
        // Hier zorg ik ervoor dat het bouwjaar altijd het huidige jaar is.
        int huidigJaar = LocalDate.now().getYear();

        Fiets fiets = new Fiets("Batavus", 500.0, huidigJaar, 120120);
        assertEquals(500.0, fiets.huidigeWaarde());
    }
}
