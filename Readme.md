
Repository zum lernen von Java.

# Setup:

- IntelliJ Community Edition
- Git Bash
- GitHub Account

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