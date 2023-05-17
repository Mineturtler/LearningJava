
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
   5) Öffne JavaTutorial/Taschenrechner/src/main/java/taschenrechner/run/TaschenrechnerRun 
   6) Auf den grünen Pfeil neben ``public class TaschenrechnerRun`` drücken und ``Run..`` auswählen

### Ersten eigenen Branch erstellen und pushen
1) In Git Bash neuen Branch erstellen
   2) ``git checkout -b meinErsterBranch``
3) Unter JavaTutorial/Taschenrechner/src/main/java/taschenrechner/gui/TaschenrechnerGUI die Anweisungen bei ``ToDo`` befolgen
4) Änderungen testen indem der Taschenrechner gestartet wird
5) Änderungen in Git Bash commiten und pushen
   6) ``git status`` zeigt dir an welche Dateien alle geändert worden sind
   7) ``git diff`` zeigt dir an welche Änderungen vorgenommen wurden
   8) ``git commit -a -m "Meine ersten Änderungen``
   9) ``git push --set-upstream origin meinErsterBranch``

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


## ToDo: Einfache Java Befehle ergänzen