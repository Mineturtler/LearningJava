
Repository zum lernen von Java.

# Setup:

- IntelliJ Community Edition
- Git Bash
- GitHub Account
## Erste Schritte
### Repository laden
1) Git Bash installieren und anschließend öffnen
2) In das bevorzugte Verzeichnis wechseln in das das Repository geladen werden soll
3) ```git clone https://github.com/Mineturtler/LearningJava.git```
4) ```cd Learning Java```
5) ``git status``

### Repository in IntelliJ öffnen
1) IntelliJ öffnen
2) ``Open -> {Pfad zum Repository}/LearningJava``
3) Unten rechts in der Ecke: "Load Maven"
4) Taschenrechner starten
   - Öffne JavaTutorial/Taschenrechner/src/main/java/taschenrechner/run/TaschenrechnerRun 
   - Auf den grünen Pfeil neben ``public class TaschenrechnerRun`` drücken und ``Run..`` auswählen

### Ersten eigenen Branch erstellen und pushen
1) In Git Bash neuen Branch erstellen
   - ``git checkout -b meinErsterBranch``
3) Unter JavaTutorial/Taschenrechner/src/main/java/taschenrechner/gui/TaschenrechnerGUI die Anweisungen bei ``ToDo`` befolgen
4) Änderungen testen in dem der Taschenrechner gestartet wird
5) Änderungen in Git Bash commiten und pushen
   - ``git status`` zeigt dir an welche Dateien alle geändert worden sind
   - ``git diff`` zeigt dir an welche Änderungen vorgenommen wurden
   - ``git commit -a -m "Meine ersten Änderungen"``
   - ``git push --set-upstream origin meinErsterBranch``
  - Im Repository auf GitHub ein ``Pull Request`` (PR) erstellen

### Testaufgaben vervollständigen
1) Für jede Testaufgabe einen neuen Branch erstellen
   - z.B. ein Branch für die Tests von Zahlenoperatoren, ein Branch für die Tests von Textoperatoren
3) Die entsprechenden ``ToDo's`` bearbeiten
4) Testen
5) Commiten
6) Pushen
7) PR erstellen

# Git Befehle:

### Das Repository klonen:
>git clone https://github.com/Mineturtler/LearningJava.git
### Neuen Branch erstellen
>git branch "Branchname"
### Branch wechseln
>git checkout "Branchname"
### Liste aller vorhandenen Branches
>git branch
### Branch erstellen und wechseln
>git checkout -b "Branchname"
### Aktuellen Zustand der veränderten Dateien anzeigen
>git status
### Alle Änderungen anzeigen lassen
>git diff
### Änderungen einer Datei zum publishen markieren
>git add "pfad zur Datei"
>>Wird nur ein Teilpfad verwendet, werden alle Dateien in den Unterordner zum publishen markiert
### Änderungen committen
>git commit -m "Commit-Nachricht. Z.b. Neue Klasse Abc hinzugefügt"
>> Nur Dateien die zum publishen markiert sind, werden in einem Commit gepackt.
### Änderungen ins Repository hochladen
>git push --set-upstream origin "Branchname"
### Aktuellen Zustand aus dem Repository laden
>git pull
>> Es empfiehlt sich nur den aktuellen Zustand zu laden wenn man keine Änderungen auf dem aktuellen Branch hat.
> Es kann ansonsten zu einem sogenannten Merge-Konflikt kommen.
> Mit "git status" überprüfen ob Änderungen vorhanden sind bevor "git pull" aufgerufen wird.


# Hilfreiches zu Java

## Klassen
Klassen können als Baupläne betrachtet werden die eine bestimmte Funktion erfüllen sollen.
Eine Klasse wird folgendermaßen deklariert:
```
public class MeineKlasse {
}
```
Eine Klasse enthält dabei beliebig viele globale Variablen und Methoden.
Globale Variablen sind überall in der Klasse sichtbar und können darauf zugegriffen werden.
```
public class MeineKlasse {
   private static int globaleZahl = 2;
   private static String globalerText = "Hallo";
   
   public static void methode1() {
      int lokaleZahl = 5;
      int ergebnis = globaleZahl + lokaleZahl;
      System.out.println(ergebnis);
   }
   
   public static void methode2() {
      String lokalerText = " du!";
      String verknuepfung = globalerText + lokalerText;
      System.out.println(verknuepfung);
   }
}
```
Die Methoden ``methode1`` und ``methode2`` können jeweils auf die globalen Variablen
``globaleZahl`` und ``globalerText`` zugreifen und sogar den Wert verändern. 
``methode1`` kann aber z.B. nicht auf die lokale Variable ``lokalerText`` in ``methode2`` zugreifen. 
## Methoden
Eine Methode enthält eine Reihe von Befehlen die nach und nach abgearbeitet werden.
Jeder Befehl in Java muss mit ``;`` beendet werden. Ansonsten kommt es zu einem Compilerfehler.
Ein Befehl kann z.B.:
- initialisieren einer Variable
- Veränderung einer Variable
- Neuberechnung einer Variable
- Aufrufen einer anderen Methode
- Start einer Schleife
- Start einer If-Else Bedingung

sein. 

Wir können einer Methode auch Parameter jeglichen Typs übergeben. Die Parameter können dann innerhalb der Methode
verwendet werden. Schauen wir uns folgende Methode an:
```
public static void methode(int parameter1, String parameter2) {
   int basisWert = 5;                           //1
   int neuerWert = basisWert + parameter1;      //2
   methode2();                                  //3
   System.out.println(parameter2);              //4
   System.out.println(neuerWert);               //5
}

public static void main(String[] args) {
   methode(5, "Mein neuer Wert:");              //6
}
```
Ergibt beim Ausführen von ``main`` folgende Ausgabe:
>"Hallo du!"
>
> "Mein neuer Wert:"
> 
> 10

Die einzelnen Befehle in den Zeilen bewirken Folgendes:
1) Initialisiere die lokale Variable ``basisWert`` mit Value ``5``
2) Initialisiere die lokale Variable ``neuerWert`` mit Value ``5 + parameter1``
3) Führe ``methode2`` aus Abschnitt ``Klasse`` aus
4) Schreibe in die Konsole den Wert von ``parameter2``
5) Schreibe in die Konsole den Wert von ``neuerWert``
6) Führe ``methode`` aus mit den Parameterwerten: ``parameter1 = 5``, ``parameter2 = "Mein neuer Wert"``

## static vs non-static
In den vorherigen Abschnitten kommt öfters das Wort ``static`` vor. ``static`` ist dabei
eine Deklarierung, ob eine Methode oder globale Variable Klassenspezifisch oder Objektspezifisch ist.
Klassenspezifische Methoden und Variablen werden mit dem Wort ``static`` beschrieben.

Fürs Erste beschränken wir uns auf Klassenspezifische Methoden und Variablen. Den genauen
Unterschied werden wir zu einem späteren Zeitpunkt betrachten.


## Kommentare
### Einzeilige Kommentare
Einzeilige Kommentare beginnen mit ``//`` und kommentieren die gesamte Zeile aus. 
IntelliJ graut die gesamte Zeile dann ein damit man einen Kommentar schnell erkennt.
### Mehrzeilige Kommentare, Blockkommentare
Mehrzeilige Kommentare oder Blockkommentare beginnen mit ``/*`` und enden mit `*/`. Jede Zeile dazwischen beginnt mit einem ``*``
```
/* Das ist ein Kommentar
* der über mehrere Zeilen geht
*/
```
### JavaDoc Notation
Ein Blockkommentar der mit ``/**`` beginnt, wird als Java Dokumentation gesehen. 
Damit können Klassen oder Methoden beschrieben werden bezüglich ihrer Funktion.
So sieht man z.B. schnell die Funktionalität einer Methode ohne sich lange den Quelltext
anschauen zu müssen.
