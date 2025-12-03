import com.oop.Auto;
import com.oop.AutoHuur;
import com.oop.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {

    private Klant k;

    @BeforeEach
    public void setup() {
        k = new Klant("Jesse de Koe");
        k.setKorting(10);
    }

    @Test
    public void rentCarWithCustomerWithoutDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        k.setKorting(0);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(66, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithCustomerWithIncorrectDiscount() {
        k.setKorting(-33);
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(66, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithCustomerWithDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(59.4, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithCustomerWithHundredPercentDiscount() {
        k.setKorting(101);
        Auto a = new Auto("Ford Fiesta Ecoboost", 500);
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(20);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithFreePricePerDayWithCustomerWithDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 0);
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(3);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithNegativeSetDaysOfRent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Auto a = new Auto("Ford Fiesta Ecoboost", 10);
            AutoHuur ah = new AutoHuur();

            ah.setAantalDagen(-3);

            ah.setGehuurdeAuto(a);
            ah.setHuurder(k);

        });

        String expectedMessage = "Zero or Negative aD parameter not allowed";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void rentCarWithNegativeSetPricePerDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Auto a = new Auto("Ford Fiesta Ecoboost", -10);
            AutoHuur ah = new AutoHuur();

            ah.setAantalDagen(3);

            ah.setGehuurdeAuto(a);
            ah.setHuurder(k);
        });

        String expectedMessage = "Zero or Negative prPd parameter not allowed";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * In the toString method of the class AutoHuur we say that the last element added is the totaalPrijs() method.
     * because we know it is the last element we can use the endsWith() method of the String class, if we were to append
     * the toString method we would need to split the array and find a constant to either reverse the array and search
     * on the constant spots we know the searched data will be or use smart searching algorithms.
     */

    @Test
    public void toStringMethodOutputForTotalPrice() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 20);
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(3);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputForTotalPriceWithoutCar() {
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputForTotalPriceWithoutCustomer() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 50);
        AutoHuur ah = new AutoHuur();
        ah.setGehuurdeAuto(a);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputWithNoCar() {
        AutoHuur ah = new AutoHuur();
        ah.setHuurder(k);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen auto bekend"));
    }

    @Test
    public void toStringMethodOutputWithNoCustomer() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 50);
        AutoHuur ah = new AutoHuur();
        ah.setGehuurdeAuto(a);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen huurder bekend"));
    }

    @Test
    public void toStringMethodOutputWithNoCustomerAndNorCar() {
        AutoHuur ah = new AutoHuur();
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen huurder bekend"));
        assertTrue(toStringMethod.contains("er is geen auto bekend"));
    }
}
