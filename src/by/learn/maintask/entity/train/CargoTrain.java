package by.learn.maintask.entity.train;

import by.learn.maintask.entity.wagon.CargoWagon;

import java.util.ArrayList;

public class CargoTrain extends Train {
    private static int MAXIMUM_WAGONS = 10;

    ArrayList<CargoWagon> wagons;

    public CargoTrain(String name) {
        super(name);
        wagons = new ArrayList<>();
    }

    public boolean addWagon(CargoWagon wagon) {
        if (wagons.size() >= MAXIMUM_WAGONS || wagon.isInTrain()) {
            return false;
        }
        wagons.add(wagon);
        wagon.setInTrain(true);
        wagon.setNumber(wagons.size());
        return true;
    }

    public boolean removeWagon(CargoWagon wagon) {
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

    public ArrayList<CargoWagon> getWagons() {
        return wagons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Train " + getName() + ":\n");
        sb.append(String.format("%5s %12s\n", "Wagon", "Cargo weight"));

        for (CargoWagon wagon : wagons) {
            sb.append(String.format("%5s %12s\n", wagon.getNumber(), wagon.getCargoWeight()));
        }

        return sb.toString();


    }
}
