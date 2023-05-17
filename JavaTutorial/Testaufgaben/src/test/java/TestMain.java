import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testaufgaben.operatoren.Rechenoperatoren;

public final class TestMain {
    @Test
    void testeRechenoperatoren() {
        testAddition();
        testSubtrakation();
        testMultiplikation();
        testModulo();
        testMaximum();
        testMinimum();
        testAbsoluterBetrag();
    }

    @Test
    void testAddition() {
        Assertions.assertEquals(5, Rechenoperatoren.addiereInteger(2,3));
        Assertions.assertEquals(-1, Rechenoperatoren.addiereInteger(-5, 4));
        Assertions.assertEquals(2460, Rechenoperatoren.addiereInteger(1230, 1230));
        Assertions.assertEquals(0, Rechenoperatoren.addiereInteger(-5000, 5000));
    }

    @Test
    void testSubtrakation() {
        Assertions.assertEquals(40, Rechenoperatoren.subtrahiereFloat(50, 10));
        Assertions.assertEquals(3.5f, Rechenoperatoren.subtrahiereFloat(7, 3.5f));
        Assertions.assertEquals(-20.4f, Rechenoperatoren.subtrahiereFloat(0, 20.4f));
        Assertions.assertEquals(20.4f, Rechenoperatoren.subtrahiereFloat(0, -20.4f));
    }

    @Test
    void testMultiplikation() {
        Assertions.assertEquals(25, Rechenoperatoren.multipliziereDouble(5d, 5d));
        Assertions.assertEquals(-500, Rechenoperatoren.multipliziereDouble(-5d, 100d));
        Assertions.assertEquals(6.25d, Rechenoperatoren.multipliziereDouble(2.5, 2.5));
        Assertions.assertEquals(4, Rechenoperatoren.multipliziereDouble(-2, -2));
    }

    @Test
    void testModulo() {
        Assertions.assertEquals(1, Rechenoperatoren.moduloVon(25, 4));
        Assertions.assertEquals(0, Rechenoperatoren.moduloVon(16, 4));
        Assertions.assertEquals(1, Rechenoperatoren.moduloVon(-5, 2));
        Assertions.assertEquals(-1, Rechenoperatoren.moduloVon(5, -2));
    }

    @Test
    void testMaximum() {
        Assertions.assertEquals(50, Rechenoperatoren.maximumVon(50, 20));
        Assertions.assertEquals(50412, Rechenoperatoren.maximumVon(50, 50412));
        Assertions.assertEquals(-50, Rechenoperatoren.maximumVon(-50, -100));
        Assertions.assertEquals(0, Rechenoperatoren.maximumVon(0, -2));
    }

    @Test
    void testMinimum() {
        Assertions.assertEquals(20, Rechenoperatoren.minimumVon(50, 20));
        Assertions.assertEquals(50, Rechenoperatoren.minimumVon(50, 50412));
        Assertions.assertEquals(-100, Rechenoperatoren.minimumVon(-50, -100));
        Assertions.assertEquals(0, Rechenoperatoren.minimumVon(0, 2));
    }

    @Test
    void testAbsoluterBetrag() {
        Assertions.assertEquals(40, Rechenoperatoren.absoluterWert(40));
        Assertions.assertEquals(40, Rechenoperatoren.absoluterWert(-40));
    }
}