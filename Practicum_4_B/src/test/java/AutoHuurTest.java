import com.oop.Auto;
import com.oop.AutoHuur;
import com.oop.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {

    private Klant k;
    private AutoHuur ah;

    @BeforeEach
    public void setup() {
        k = new Klant("Jesse de Koe");
        k.setKorting(10);
        ah = new AutoHuur();
    }

    @Test
    public void rentCarWithCustomerWithoutDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        k.setKorting(0);
        
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(66, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithCustomerWithIncorrectDiscount() {
        k.setKorting(-10);
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(66, ah.totaalPrijs()); // no discount applied
    }

    @Test
    public void rentCarWithCustomerWithDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 22.0);
        
        ah.setHuurder(k);
        ah.setGehuurdeAuto(a);
        ah.setAantalDagen(3);

        assertEquals(59.4, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithCustomerWithHundredPercentDiscount() {
        k.setKorting(101);
        Auto a = new Auto("Ford Fiesta Ecoboost", 500);
        
        ah.setAantalDagen(20);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithFreePricePerDayWithCustomerWithDiscount() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 0);
        
        ah.setAantalDagen(3);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithNegativeSetDaysOfRent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Auto a = new Auto("Ford Fiesta Ecoboost", 10);

            ah.setAantalDagen(-3);

            ah.setGehuurdeAuto(a);
            ah.setHuurder(k);

        });

        String expectedMessage = "Zero or Negative aD parameter not allowed";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void rentCarWithZeroSetDaysOfRent() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 22);

        ah.setAantalDagen(0);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithZeroValues() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 0);

        ah.setAantalDagen(0);
        k.setKorting(0);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        assertEquals(0, ah.totaalPrijs());
    }

    @Test
    public void rentCarWithNegativeSetPricePerDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Auto a = new Auto("Ford Fiesta Ecoboost", -10);

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
        
        ah.setAantalDagen(3);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);

        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputForTotalPriceWithoutCar() {
        ah.setHuurder(k);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputForTotalPriceWithoutCustomer() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 50);
        
        ah.setGehuurdeAuto(a);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.endsWith(String.format("%.2f", ah.totaalPrijs())));
    }

    @Test
    public void toStringMethodOutputWithNoCar() {
        ah.setHuurder(k);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen auto bekend"));
    }

    @Test
    public void toStringMethodOutputWithNoCustomer() {
        Auto a = new Auto("Ford Fiesta Ecoboost", 50);
        
        ah.setGehuurdeAuto(a);
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen huurder bekend"));
    }

    @Test
    public void toStringMethodOutputWithNoCustomerAndNorCar() {
        String toStringMethod = ah.toString();

        assertTrue(toStringMethod.contains("er is geen huurder bekend"));
        assertTrue(toStringMethod.contains("er is geen auto bekend"));
    }
}
