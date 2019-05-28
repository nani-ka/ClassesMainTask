package by.learn.maintask.reporter;

import by.learn.maintask.entity.train.PassengerTrain;
import by.learn.maintask.entity.wagon.PassengerWagon;

import java.util.ArrayList;

public class Reporter {

    public static void printWagons(PassengerTrain train) {
        ArrayList<PassengerWagon> wagons = train.getWagons();

        System.out.println("Train " + train.getName() + ":");
        System.out.printf("%5s %10s %14s\n", "Wagon", "Passengers", "Comfortability");
        for (int i = 0; i < wagons.size(); i++) {
            PassengerWagon tempWagon = wagons.get(i);

            System.out.printf("%5s %10s %14s\n", tempWagon.getNumber(),
                    tempWagon.getPassengersAmount(), tempWagon.getComfortability());

        }

    }

}
