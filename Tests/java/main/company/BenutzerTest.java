package main.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BenutzerTest {

    @Test
    void getVorName() {
        List<Sport> sportList = null;
        Benutzer b1 = new Benutzer("Calin", "Mihai", sportList);
        assert(Objects.equals(b1.getVorName(), "Calin"));
    }


    @Test
    void getNachName() {
        List<Sport> sportList1 = null;
        Benutzer b2 = new Benutzer("Calin", "Mihai", sportList1);
        assert(Objects.equals(b2.getNachName(), "Mihai"));
    }


    @Test
    void getSport() {
        Sport basket1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        List<Sport> sportList2 = new ArrayList<>();
        sportList2.add(basket1);
        sportList2.add(fussball1);
        sportList2.add(hindernislauf1);
        sportList2.add(hochsprung);
        Benutzer b3 = new Benutzer("Calin", "Mihai", sportList2);
        assert(b3.getSport() == sportList2);
    }


    @Test
    void kalkuliereZeit() {
        Sport basket1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList3 = new ArrayList<>();
        sportList3.add(basket1);
        sportList3.add(fussball1);
        sportList3.add(hindernislauf1);
        sportList3.add(hochsprung);

        Benutzer b4 = new Benutzer("Calin", "Mihai", sportList3);

        assertEquals(b4.kalkuliereZeit(), b4.kalkuliereZeit(basket1) + b4.kalkuliereZeit(fussball1) + b4.kalkuliereZeit(hindernislauf1) + b4.kalkuliereZeit(hochsprung));
        assert b4.kalkuliereZeit() == 170;
    }

    @Test
    void testKalkuliereZeit() {
        Sport basket1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("Calin", "Mihai", Arrays.asList(basket1, fussball1, hindernislauf1, hochsprung));

        assertEquals(benutzer.kalkuliereZeit(basket1), 55);
        assertEquals(benutzer.kalkuliereZeit(fussball1), 65);
        assertEquals(benutzer.kalkuliereZeit(hindernislauf1), 30);
        assertEquals(benutzer.kalkuliereZeit(hochsprung), 20);
    }

    @Test
    void kalkuliereDurchsnittszeit() {
        Sport basket1 = new Basketball();
        Sport fussball1 = new Fussball();
        Sport hindernislauf1 = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        List<Sport> sportList4 = new ArrayList<>();
        sportList4.add(basket1);
        sportList4.add(fussball1);
        sportList4.add(hindernislauf1);
        sportList4.add(hochsprung);

        Benutzer b5 = new Benutzer("Calin", "Mihai", sportList4);

        assertEquals(b5.kalkuliereDurchsnittszeit(), b5.kalkuliereZeit() / b5.getSport().size());
        assert b5.kalkuliereDurchsnittszeit() == 42.5;
    }
}