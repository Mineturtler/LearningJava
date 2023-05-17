import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testaufgaben.operatoren.ZahlenOperatoren;

public final class TestMain {
    @Test
    void testeRechenoperatoren() {
        // ToDo: Ergänze alle Methoden in der Klasse ZahlenOperatoren damit sämtliche Tests erfolgreich durchlaufen können.
        TestZahlen zahlenTest = new TestZahlen();
        zahlenTest.testAddition();
        zahlenTest.testSubtrakation();
        zahlenTest.testMultiplikation();
        zahlenTest.testModulo();
        zahlenTest.testMaximum();
        zahlenTest.testMinimum();
        zahlenTest.testAbsoluterBetrag();
    }
}