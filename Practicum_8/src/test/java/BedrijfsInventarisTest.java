import com.oop.Auto;
import com.oop.BedrijfsInventaris;
import com.oop.Computer;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BedrijfsInventarisTest {

    @Test
    public void testOfAlleGoederenArrayListUniekZijn() {
        BedrijfsInventaris bi = new BedrijfsInventaris("HU", 50000);
        Computer c1 = new Computer("Commodore Amiga 2000", "00:80:10:00:00:01", 1300.00, 1989);
        Computer c2 = new Computer("Commodore Amiga 2000", "00:80:10:00:00:01", 1300.00, 1989);
        Auto auto = new Auto("Ford F-150 Raptor", 49900, 2020, "VFN-48-H");

        bi.schafAan(c1);
        bi.schafAan(c2);
        bi.schafAan(auto);

        assertEquals(2, bi.getAlleGoederen().size());
    }

    @Test
    public void testOfErGoederenGekochtKunnenWordenMetTeWeinigBudget() {
        // Het huidige jaar pak ik zodat de kortingen er niet af gaan.
        int huidigJaar = LocalDate.now().getYear();
        BedrijfsInventaris bi = new BedrijfsInventaris("HU", 50000);
        Computer computer = new Computer("Commodore Amiga 2000", "00:80:10:00:00:01", 1300.00, 1989);
        Auto auto = new Auto("Ford F-150 Raptor", 49900, huidigJaar, "VFN-48-H");

        bi.schafAan(computer);
        bi.schafAan(auto);

        assertEquals(1, bi.getAlleGoederen().size());
    }
}
