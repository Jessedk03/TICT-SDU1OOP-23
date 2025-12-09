import com.oop.Voetbalclub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoetbalclubTest {

    private Voetbalclub v;

    @BeforeEach
    public void setup() {
        v = new Voetbalclub();
    }

    @Test
    public void constructorSetsDefaultClubNameToFC() {
        assertEquals("FC", v.getName());
    }

    @Test
    public void constructorSetsClubNameCorrectlyWhenProvided() {
        v.setNaam("FC Utrecht");

        assertEquals("FC Utrecht", v.getName());
    }

    @Test
    public void calculateScoreWithCorrectLowercaseInput() {
        v.verwerkResultaat('w'); // 3
        v.verwerkResultaat('v'); // 0
        v.verwerkResultaat('g'); // 1

        assertEquals(4, v.aantalPunten()); // amount of points is 4, w=3 v=0 g=1.
        assertEquals(3, v.aantalGespeeld()); // amount of matches played is 3
    }

    @Test
    public void calculateScoreWithCorrectUppercaseInput() {
        v.verwerkResultaat('W');
        v.verwerkResultaat('V');
        v.verwerkResultaat('G');

        assertEquals(0, v.aantalPunten()); // amount of points is 0 since the method looks for a lowercase
        assertEquals(0, v.aantalGespeeld()); // amount of matches played is 0
    }

    @Test
    public void calculateScoreWithIncorrectInput() {
        v.verwerkResultaat('x');

        assertEquals(0, v.aantalPunten());
        assertEquals(0, v.aantalGespeeld());
    }

    @Test
    public void calculateScoreWithCorrectUnicodeInput() {
        v.verwerkResultaat('\u0077'); // w in unicode
        v.verwerkResultaat('\u0076'); // v in unicode
        v.verwerkResultaat('\u0067'); // g in unicode

        assertEquals(4, v.aantalPunten());
        assertEquals(3, v.aantalGespeeld());
    }

    @Test
    public void calculateScoreWithIncorrectUnicodeInput() {
        v.verwerkResultaat('\u0000'); // NULL character
        v.verwerkResultaat('\uFFFF'); // Invalid Unicode character

        assertEquals(0, v.aantalPunten());
        assertEquals(0, v.aantalGespeeld());
    }


    /**
     * Tests whether the points of 'w', 'g' and 'v' are added and represented correctly in the toString method.
     *
     * We reverse the array since the name position is the only array index that has a variable length,
     * since we split the output of the toString method by spaces.
     *
     * [4, 1, 1, 1, 3, 3, 17, J.O., Utrecht, FC] result of the reverse toString method.
     * The array reversed is as follows on array index:
     * 0: aantalPunten
     * 1: aantalVerloren
     * 2: aantalGelijk
     * 3: aantalGewonnen
     * 4: aantalGewonnenPunten
     * 5: aantalGespeeld
     * 6+: naam
     *
     */
    @Test
    public void pointsAreVisibleInTheToStringMethod() {
        v.setNaam("FC Utrecht J.O. 17");

        v.verwerkResultaat('w');
        v.verwerkResultaat('g');
        v.verwerkResultaat('v');

        String[] toStringMethodSplitted = v.toString().split("\s");

        for (int i = 0; i < toStringMethodSplitted.length / 2; i++) {
            String reversedArray = toStringMethodSplitted[i];
            toStringMethodSplitted[i] =  toStringMethodSplitted[toStringMethodSplitted.length - i - 1];
            toStringMethodSplitted[toStringMethodSplitted.length - i - 1] = reversedArray;
        }

        System.out.println(Arrays.toString(toStringMethodSplitted));

        assertTrue(toStringMethodSplitted[4].contains("3")); // aantal gewonnen

        assertTrue(toStringMethodSplitted[2].contains("1")); // aantal gelijk

        assertTrue(toStringMethodSplitted[1].contains("1")); // aantal verloren
    }

    @Test
    public void calculatingPointsAfterManyRepeatedResults() {
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');
        v.verwerkResultaat('w');

        assertEquals(18, v.aantalPunten());
    }
}
