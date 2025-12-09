import com.oop.Zwembad;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZwembadTest {

    @Test
    public void testBerekendeInhoudMetPositieveGetallen() {
        Zwembad zwembad = new Zwembad();

        zwembad.setBreedte(50.0);
        zwembad.setLengte(10.0);
        zwembad.setDiepte(20.0);

        assertEquals(10000.0, zwembad.inhoud());
    }

    @Test
    public void testBerekendeInhoudMetNegatiefGetal() {
        Zwembad zwembad = new Zwembad();

        zwembad.setBreedte(-50.0);
        zwembad.setLengte(10.0);
        zwembad.setDiepte(20.0);

        assertEquals(-10000.0, zwembad.inhoud());
    }
}
