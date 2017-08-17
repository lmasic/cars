/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.util.ArrayList;

/**
 *
 * @author virtuoso
 */
public class Race {

    private int lenght = 0;
    private ArrayList<RaceResults> results = new ArrayList<RaceResults>();
    private ArrayList<Car> cars = new ArrayList<Car>();
    private boolean ready = false;

    public Race(int len) {
        this.lenght = len;
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public void start() {

        this.ready = true;
    }

    private void getResults() {
        if (!ready) {
            return;
        }
        //čas ujetí závodu pro každé auto
        //výsledek seřadí
        for (Car tmpcar : cars) {
            results.add(
                    new RaceResults(
                            tmpcar, new TimeSpan(
                                    this.lenght / tmpcar.getSpeed()
                                                )
                    )
            );
        }
        //results.sort(timeSpan);

    }
    
    
}
