package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> resultOfRead;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.resultOfRead = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    // from question: is on when all sensors are on
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }

        return true;
    }

    public void setOn() {
        this.sensors.forEach(sensor -> sensor.setOn());
    }

    public void setOff() {
        for (int i = new Random().nextInt(this.sensors.size()); i >= 0; i--) {
            this.sensors.get(i).setOff();
        }
    }

    // sensors.read() returns random number, we need to return its avg
    public int read() {
        if (this.sensors.size() == 0 || !this.isOn()) {
            throw new IllegalStateException();
        }
        // read() and return
        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
        }
        int avg = sum / this.sensors.size();

        // for readings()
        this.resultOfRead.add(avg);
        return avg;
    }

    // results of all the reads()
    public List<Integer> readings() {
        return this.resultOfRead;
    }

}
