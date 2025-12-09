import com.oop.Cirkel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirkelTest {

    @Test
    public void testRadiusWithNegativeRadius() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(-1, 10, 2);
        });

        assertEquals("Radius moet groter dan 0 zijn!", exception.getMessage());
    }

    @Test
    public void testRadiusWithZeroRadius() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(0, 10, 2);
        });

        assertEquals("Radius moet groter dan 0 zijn!", exception.getMessage());
    }

}
