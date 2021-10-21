package main.company;

import java.util.*;

/**
* Classname: Benutzer
* Die Klasse hat: eienen Konstruktor, Getters, Setters und Implementierungen der Methoden
*/
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /**
     * Get VorName Benutzer
     *
     * @return VorName Benutzer
     */
    public String getVorName() {
        return vorName;
    }

    /**
     * @param vorName = vorName Benutzer
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Get nachName Benutzer
     *
     * @return nachName Benutzer
     */
    public String getNachName() {
        return nachName;
    }

    /**
     * @param nachName = nachName Benutzer
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     * Get Liste mit Sportarten der Benutzer
     *
     * @return Liste mit Sportarten der Benutzer
     */
    public List<Sport> getSport() {
        return sport;
    }

    /**
     * @param sport = Sportart in der Liste der Benutzer
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     * @param sport = Liste von Sportarten
     * die Methode gibt alle Sportarten aus dem Array heraus
     */
    public void printSport(List<Sport> sport){
        for (Sport value : sport) {
            System.out.println(value.getClass().getSimpleName());
        }
    }

    /**
     * @return zeit = gesamte Zeitspanne aller Sportarten
     * die Methode berechnet die gesamte Zeit aus der Sportliste der Benutzer
     */
    public double kalkuliereZeit(){
        int zeit=0;
        for(Sport sport1: sport){
            zeit += sport1.kalkuliereZeit();
        }
        return zeit;
    }

    /**
     * @param sport = einen Sportart aus der Liste der Benutzer
     * @return sum = gesamte Zeit die, der Benutzer einen Sportart treibt
     * die Methode berechnet die gesamte Zeit einer Sportart
     */
    public double kalkuliereZeit(Sport sport){
        double sum = 0;
        for (Sport value : this.sport) {
            if (value.getClass() == sport.getClass())
                sum += sport.kalkuliereZeit();
        }
        return sum;
    }

    /**
     * @return durchsnittszeit = die durchsnittliche Zeit indem er alle Sportarten treibt
     * die Methode berechnet die Durchschnittszeit aller Sportarten aus der Sportliste der Benutzer
     */
    public double kalkuliereDurchsnittszeit(){
        double durchsnittszeit;
        double zeit = kalkuliereZeit();
        durchsnittszeit = zeit/sport.size();
        return durchsnittszeit;
    }

}
