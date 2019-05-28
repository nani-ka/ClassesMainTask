package by.learn.maintask.entity.train;

import by.learn.maintask.entity.wagon.PassengerWagon;

import java.util.ArrayList;
import java.util.Formatter;

public class PassengerTrain extends Train {
    private static int MAXIMUM_WAGONS = 10;

    ArrayList<PassengerWagon> wagons;

    public PassengerTrain(String name) {
        super(name);
        wagons = new ArrayList<>();
    }

    public boolean addWagon(PassengerWagon wagon) {
        if (wagons.size() >= MAXIMUM_WAGONS || wagon.isInTrain()) {
            return false;
        }
        wagons.add(wagon);
        wagon.setInTrain(true);
        wagon.setNumber(wagons.size());
        return true;
    }

    public boolean removeWagon(PassengerWagon wagon) {
        if (!wagons.contains(wagon)) {
            return false;
        }
        wagons.remove(wagon);
        wagon.setInTrain(false);
        wagon.setNumber(0);
        return true;
    }

    public static int getMaximumWagons() {
        return MAXIMUM_WAGONS;
    }

    public static void setMaximumWagons(int maximumWagons) {
        MAXIMUM_WAGONS = maximumWagons;
    }

    public ArrayList<PassengerWagon> getWagons() {
        return wagons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Train " + getName() + ":\n");
        sb.append(String.format("%5s %10s %14s\n", "Wagon", "Passengers", "Comfortability"));

        for (PassengerWagon wagon : wagons) {
            sb.append(String.format("%5s %10s %14s\n", wagon.getNumber(),
                    wagon.getPassengersAmount(), wagon.getComfortability()));
        }

        return sb.toString();
    }
}
