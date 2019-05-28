package by.learn.maintask.entity.train;

import by.learn.maintask.action.IdGenerator;

public class Train {

    private int trainId;
    private String name;

    public Train(String name) {
        this.name = name;
        trainId = IdGenerator.generateId();
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
