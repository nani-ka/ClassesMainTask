package by.learn.maintask.main;

import by.learn.maintask.action.TrainAction;
import by.learn.maintask.entity.train.CargoTrain;
import by.learn.maintask.entity.train.PassengerTrain;
import by.learn.maintask.entity.wagon.CargoWagon;
import by.learn.maintask.entity.wagon.PassengerWagon;
import by.learn.maintask.reporter.Reporter;

public class Main {

    public static void main(String[] args) {

        PassengerTrain t1 = new PassengerTrain("Moscow Express");

        PassengerWagon pw = new PassengerWagon(40, 7);

        t1.addWagon(pw);
        t1.addWagon(new PassengerWagon(32, 2));
        t1.addWagon(new PassengerWagon(54, 5));
        t1.addWagon(new PassengerWagon(42, 7));
        t1.addWagon(new PassengerWagon(38, 9));
        t1.addWagon(new PassengerWagon(27, 1));

        System.out.println(t1);

        int left = 30;
        int right = 50;
        System.out.println("\nWagons in range " + left + "-" + right);
        System.out.println(TrainAction.findWagonsByPassengersNumber(t1, 30, 50));

        System.out.println("\nAfter sorting by comfortability:\n");
        TrainAction.sortWagonsByComfortability(t1);
        System.out.println(t1);


        CargoTrain train2 = new CargoTrain("Servtrans");

        CargoWagon cargoWagon = new CargoWagon(1000);

        train2.addWagon(cargoWagon);
        train2.addWagon(new CargoWagon(900));
        train2.addWagon(new CargoWagon(1500));
        train2.addWagon(new CargoWagon(700));
        train2.addWagon(new CargoWagon(1000));
        train2.addWagon(new CargoWagon(850));

        System.out.println(train2);

        System.out.print("\nTotal cargo weight of " + train2.getName() + ": ");
        System.out.println(TrainAction.countTotalCargoWeight(train2));

    }

}
