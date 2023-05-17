package testaufgaben.operatoren;

public final class ZahlenOperatoren {

    /**
     * Zahlen können in Java mit verschiedenen "primitives" deklariert werden. Die Syntax ist in der Methode beispiele() zu finden.
     * <p>
     * Liste von primitives:
     * Byte (byte): Ganzzahlige Zahlenwerte (-128, 127) [8-bit]
     * Short (short): Ganzzahlige Zahlenwerte (-32768, 32767) [16-bit]
     * Integer (int): Ganzzahlige Zahlenwerte (-2^31, 2^31 -1) [32-bit]
     * Long (long): Ganzzahlige Zahlenwerte (-2^64, 2^64-1) [64-bit]
     * Float (float): Zahlenwerte mit Komma
     * Double (double): Zahlenwerte mit Komma
     */
    private ZahlenOperatoren() {
        //do nothing
    }

    /**
     * Die Methode wird über die Main Methode in testaufgaben/operatoren/Main ausgeführt.
     * In der ReadMe Datei befinden sich Hinweise bezüglich Kommentare in Java
     */
    public static void beispiele() {
        short kleinerWert;                      // Eine lokale Variable mit dem Namen "kleinerWert" vom Typ "short" wird initialisiert
        //System.out.println("Initialisierung von kleinerWert ohne Wert: " + kleinerWert);  // Das führt zu einem Fehler, weil noch kein Wert der Variable zugeordnet ist
        kleinerWert = 0;                        // der lokalen Variable "kleinerWert" wird ein expliziter Wert, hier 0 zugewiesen.
        System.out.println("Gespeicherter Wert von kleinerWert: " + kleinerWert);
        short kleinerWertInitialisiert = 5;     // Die lokale Variable "kleinerWert" vom Typ "short wird direkt mit dem Wert 0 intialisiert
        System.out.println("Gespeicherter Wert von kleinerWertInitialisiert: " + kleinerWertInitialisiert);

        // ToDo: Kommentiere die Zeile 22 ein und lasse die Methode über testaufgaben/operatoren/Main laufen. Schau was passiert
        //  Kommentiere die Zeile wieder bevor du mit dem nächsten to_do weiter machst.
        // ToDo: Initialisiere für die restlichen Primitives lokale Variablen und gebe sie über "System.out.println()" aus.
    }

    /**
     * Gib die Summe der Werte a und b zurück
     */
    public static int addiereInteger(int a, int b) {
        return 0;
    }

    /**
     * Subtrahiere b von a
     */
    public static float subtrahiereFloat(float a, float b) {
        return 0f;
    }

    /**
     * Multipliziere a und b
     */
    public static double multipliziereDouble(double a, double b) {
        return 0d;
    }

    /**
     * Bestimme den Restwert bei einer Division mit Hilfe von Modulo.
     * Beispiel: 25 modulo 4 = 1
     *           25/4 = 4 * 6 + 1
     */
    public static int moduloVon(int basis, int modulo) {
        return 0;
    }

    /**
     * Bestimme den absoluten Wert. Der absolute Wert ist immer der positive Wert
     */
    public static float absoluterWert(float wert) {
        return 0;
    }

    /**
     * Gib den größeren Wert von den beiden zurück
     */
    public static int maximumVon(int a, int b) {
        return 0;
    }

    /**
     * Gib den kleineren Wert von den beiden zurück
     */
    public static int minimumVon(int a, int b) {
        return 0;
    }
}
