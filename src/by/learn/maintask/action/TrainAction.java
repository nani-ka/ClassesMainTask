package by.learn.maintask.action;

import by.learn.maintask.entity.train.CargoTrain;
import by.learn.maintask.entity.train.PassengerTrain;
import by.learn.maintask.entity.wagon.CargoWagon;
import by.learn.maintask.entity.wagon.PassengerWagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TrainAction {

    public static int countTotalPassengers(PassengerTrain train) {
        ArrayList<PassengerWagon> wagons = train.getWagons();
        int count = 0;

        for (PassengerWagon wagon : wagons) {
            if (wagon.getClass() == PassengerWagon.class) {
                count += wagon.getPassengersAmount();
            }
        }
        return count;
    }

    public static int countTotalCargoWeight(CargoTrain train) {
        ArrayList<CargoWagon> wagons = train.getWagons();
        int count = 0;

        for (CargoWagon wagon : wagons) {
            if (wagon.getClass() == CargoWagon.class) {
                count += wagon.getCargoWeight();
            }
        }
        return count;
    }

    public static void sortWagonsByComfortability(PassengerTrain train) {
        ArrayList<PassengerWagon> wagons = train.getWagons();
        Collections.sort(wagons, Comparator.comparingInt(wagon -> wagon.getComfortability()));
    }

    public static ArrayList<Integer> findWagonsByPassengersNumber(PassengerTrain train, int left, int right) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<PassengerWagon> wagons = train.getWagons();

        for (PassengerWagon wagon : wagons) {
            int passengersNumber = wagon.getPassengersAmount();

            if (passengersNumber >= left && passengersNumber <= right) {
                temp.add(wagon.getNumber());
            }
        }
        return temp;
    }

}
