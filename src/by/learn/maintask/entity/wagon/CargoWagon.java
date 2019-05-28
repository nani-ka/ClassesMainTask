package by.learn.maintask.entity.wagon;

public class CargoWagon extends Wagon {

    private int cargoWeight;

    public CargoWagon(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
