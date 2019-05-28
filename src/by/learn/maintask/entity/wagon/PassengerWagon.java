package by.learn.maintask.entity.wagon;

public class PassengerWagon extends Wagon {

    private int passengersAmount; // вместимость вагона
    private int comfortability; // уровень комфортности от 1 до 10

    public PassengerWagon(int passengersAmount, int comfortability) {
        this.passengersAmount = passengersAmount;
        this.comfortability = comfortability;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public int getComfortability() {
        return comfortability;
    }

    public void setComfortability(int comfortability) {
        this.comfortability = comfortability;
    }
}
