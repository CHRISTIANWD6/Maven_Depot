package calcul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalcul {


    class CalculatriceTest {

        Calculatrice calculatrice = new Calculatrice();

        // ➕ Test addition
        @Test
        void testAddition() {
            assertEquals(5, calculatrice.addition(2, 3));
        }

        // ➖ Test soustraction
        @Test
        void testSoustraction() {
            assertEquals(1, calculatrice.soustraction(3, 2));
        }

        // ✖️ Test multiplication
        @Test
        void testMultiplication() {
            assertEquals(6, calculatrice.multiplication(2, 3));
        }

        // ➗ Test division
        @Test
        void testDivision() {
            assertEquals(2.0, calculatrice.division(6, 3));
        }

        // 🚫 Test division par zéro
        @Test
        void testDivisionParZero() {
            Exception exception = assertThrows(
                    IllegalArgumentException.class,
                    () -> calculatrice.division(5, 0)
            );

            assertEquals("Division par zéro interdite", exception.getMessage());

        }
    }
}
