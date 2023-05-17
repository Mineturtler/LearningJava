import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testaufgaben.operatoren.ZahlenOperatoren;

public final class TestZahlen {

    @Test
    void testAddition() {
        Assertions.assertEquals(5, ZahlenOperatoren.addiereInteger(2,3));
        Assertions.assertEquals(-1, ZahlenOperatoren.addiereInteger(-5, 4));
        Assertions.assertEquals(2460, ZahlenOperatoren.addiereInteger(1230, 1230));
        Assertions.assertEquals(0, ZahlenOperatoren.addiereInteger(-5000, 5000));
    }

    @Test
    void testSubtrakation() {
        Assertions.assertEquals(40, ZahlenOperatoren.subtrahiereFloat(50, 10));
        Assertions.assertEquals(3.5f, ZahlenOperatoren.subtrahiereFloat(7, 3.5f));
        Assertions.assertEquals(-20.4f, ZahlenOperatoren.subtrahiereFloat(0, 20.4f));
        Assertions.assertEquals(20.4f, ZahlenOperatoren.subtrahiereFloat(0, -20.4f));
    }

    @Test
    void testMultiplikation() {
        Assertions.assertEquals(25, ZahlenOperatoren.multipliziereDouble(5d, 5d));
        Assertions.assertEquals(-500, ZahlenOperatoren.multipliziereDouble(-5d, 100d));
        Assertions.assertEquals(6.25d, ZahlenOperatoren.multipliziereDouble(2.5, 2.5));
        Assertions.assertEquals(4, ZahlenOperatoren.multipliziereDouble(-2, -2));
    }

    @Test
    void testModulo() {
        Assertions.assertEquals(1, ZahlenOperatoren.moduloVon(25, 4));
        Assertions.assertEquals(0, ZahlenOperatoren.moduloVon(16, 4));
        Assertions.assertEquals(1, ZahlenOperatoren.moduloVon(-5, 2));
        Assertions.assertEquals(-1, ZahlenOperatoren.moduloVon(5, -2));
    }

    @Test
    void testMaximum() {
        Assertions.assertEquals(50, ZahlenOperatoren.maximumVon(50, 20));
        Assertions.assertEquals(50412, ZahlenOperatoren.maximumVon(50, 50412));
        Assertions.assertEquals(-50, ZahlenOperatoren.maximumVon(-50, -100));
        Assertions.assertEquals(0, ZahlenOperatoren.maximumVon(0, -2));
    }

    @Test
    void testMinimum() {
        Assertions.assertEquals(20, ZahlenOperatoren.minimumVon(50, 20));
        Assertions.assertEquals(50, ZahlenOperatoren.minimumVon(50, 50412));
        Assertions.assertEquals(-100, ZahlenOperatoren.minimumVon(-50, -100));
        Assertions.assertEquals(0, ZahlenOperatoren.minimumVon(0, 2));
    }

    @Test
    void testAbsoluterBetrag() {
        Assertions.assertEquals(40, ZahlenOperatoren.absoluterWert(40));
        Assertions.assertEquals(40, ZahlenOperatoren.absoluterWert(-40));
    }

}
