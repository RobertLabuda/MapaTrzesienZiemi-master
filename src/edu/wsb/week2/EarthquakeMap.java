package edu.wsb.week2;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

/**
 * Created by hyperion on 06.06.17.
 * @author Adrian Kozłowski
 * @author Robert Labuda
 */
public class EarthquakeMap extends PApplet {

    UnfoldingMap map;

    Location m1 = new Location(65.0,65.0);
    SimplePointMarker mark1 = new SimplePointMarker(m1);

    double[] długośćGeograficzna = new double[]{54.609195,15.0,33.0,45.0}; // 4 nowe zmienne długośćGeograficzna
    double[] szerokośćGeograficzna = new double[]{18.175481,16.0,39.0,40.0}; // 4 nowe zmienne szerokośćGeograficzna

    public static SimplePointMarker marker(double długośćGeograficzna, double szerokośćGeograficzna){
        return new SimplePointMarker(new Location(długośćGeograficzna,szerokośćGeograficzna));
    }

    public void setup(){

        size(950, 600, OPENGL);
        map = new UnfoldingMap(this,200,50,650,600,new Google.GoogleMapProvider());
        map.zoomToLevel(2);
        MapUtils.createDefaultEventDispatcher(this, map);
    }


    public void draw() {
        background(10);
        map.draw();

        int i=0;
        int j=0;
        do {
            map.addMarker(marker(długośćGeograficzna[i],szerokośćGeograficzna[j]));
            i++;
            j++;
        }
        while (i<długośćGeograficzna.length&&j<szerokośćGeograficzna.length);
        /*
         Todo: Dodać pętle for lub while, a poniższą linijkę tak zmodyfikować, by
          todo na mapie zostały zaznaczone wszystkie punkty, a nie jeden jak w kodzie
          todo     poniżej
        */


    }

}
