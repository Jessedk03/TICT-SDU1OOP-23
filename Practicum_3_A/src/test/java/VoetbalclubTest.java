import com.oop.Voetbalclub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTest {

    @Test
    public void checkIfEmptyClubNameIsFCWhenConstructorIsEmpty() {
        Voetbalclub v = new Voetbalclub();

        assertEquals("FC", v.getName());
    }


}
