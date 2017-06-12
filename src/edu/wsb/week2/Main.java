package edu.wsb.week2;

import edu.wsb.StandardInput;
import processing.core.PApplet;

/**
 * Created by hyperion on 01.06.17.
 * @author Adrian Kozłowski
 * @author Robert Labuda
 */
public class Main {


    public static void main(String[] args) {

        String word = StandardInput.readString("By zobaczyć mapę wpisz: Mapa"); // ma
        switch(word){
            case "Mapa":
                PApplet.main(new String[]{"edu.wsb.week2.EarthquakeMap"});
                break;
            case "mapa":
                PApplet.main(new String[]{"edu.wsb.week2.EarthquakeMap"});
                break;
            default:
                System.out.println("Nie poprawne słowo kluczowe!\n");
                System.out.println("Proszę ponownie wpisać słowo kluczowe.");
                break;
        }


    }
}
