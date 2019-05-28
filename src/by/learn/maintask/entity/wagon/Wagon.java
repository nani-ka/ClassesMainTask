package by.learn.maintask.entity.wagon;

public class Wagon {

    private int number; //номер вагона в поезде
    private boolean isInTrain; //является ли вагон частью поезда

    public Wagon() {
        isInTrain = false;
    }

    public boolean isInTrain() {
        return isInTrain;
    }

    public void setInTrain(boolean inTrain) {
        isInTrain = inTrain;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
