package de.lubowiecki.aufgaben;

public class Aufgabe16 {

    /*
    Schreibe eine Klasse für einen Logger als ein Singleton.
    Dieser soll beim Aufruf der Methode log(String msg, String level) einen Logeintrag an zentraler Stelle produzieren.
    Die Log-Einträge werden in Form eines Strings nach folgender Vorlage festgehalten:
    Datum/Uhrzeit - Level - Nachricht

    z.B.
    20.02.2026/17:55:35 - INFO - Methode sowieso wurde aufgerufen

    Level könnte INFO, ERROR, DEBUG, WARNING sein. Es ist einfach ein Label, der den Grund des Log-Eintrags beschreibt.
    INFO = Allgemeine Information z.B. Hinweis auf Aufruf einer bestimmten Methode
    ERROR = Aktuelles Problem z.B. Wert einer Variable ungültig
    DEBUG = z.B. Zustand einer Variable
    WARNING = Hinweis auf mögliche zukünftige Probleme

    Über die Methode printLog() bekommt man alle Einträge auf ein mal angezeigt.
    Je ein Eintrag pro Zeile.

    Teste die Klasse, indem du die log-Methode an verschiedenen Stellen deines Programms aufrufst.

    Erweiterung:
    Schreibe eine zusätzliche Methode setSilent(boolean silent) über die man steuern kann, ob eine Ausgabe in
    printLog() auch wirklich auf der Console erfolgt oder unterdrückt werden soll.
    Der silent-Modus ist per default deaktiviert.
     */
}
