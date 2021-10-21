package main.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //die neuen Objekten sind erstellt
	    Basketball basketball1 = new Basketball();
        Basketball basketball2 = new Basketball();
        Basketball basketball3 = new Basketball();
        Fussball fussball1 = new Fussball();
        Fussball fussball2 = new Fussball();
        Hindernislauf hindernislauf1 = new Hindernislauf();
        Hindernislauf hindernislauf2 = new Hindernislauf();
        Hochsprung hochsprung1 = new Hochsprung();


        //es wird eine Liste erstellt, indem man die Objekte von Typ Sport hinzugefugt
        List<Sport> sportList = new ArrayList<>();
        sportList.add(basketball1);
        sportList.add(fussball1);
        sportList.add(hindernislauf1);
        sportList.add(hindernislauf2);
        sportList.add(hochsprung1);
        sportList.add(basketball2);
        sportList.add(basketball3);
        sportList.add(fussball2);

        //es wird ein Benutzer erstellt
        Benutzer b1 = new Benutzer("Andrei", "Morar", sportList);

        System.out.println("Der Benutzer "+ b1.getVorName()+ " "+ b1.getNachName()+ " nimmt teil an folgende Sportarten in einer Woche: ");
        b1.printSport(sportList);

        //es werden die Methoden gerufen
        System.out.println();
        System.out.println("Die gesamte Zeitspanne fur alle Sportarten die der Benutzer tragt: "+b1.kalkuliereZeit());
        System.out.print("Die gesamte Zeitspanne der Benutzer fur einen bestimmten Sportart tragt: ");
        System.out.print(b1.kalkuliereZeit(new Fussball()));
        System.out.println();
        System.out.print("Die durchschnittliche Zeitspanne einen Benutzer hat um seine Sportarten zu tragen: ");
        System.out.print(b1.kalkuliereDurchsnittszeit());
    }
}
