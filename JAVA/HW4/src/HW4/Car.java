package HW4;

import java.util.Arrays;
import java.util.Objects;

public class Car extends Agregat {
    private String mark;
    private String model;
    private Engine engine;
    private Passanger[] passangers;
    private int capasity;
    private double ammountOfFuel;

    public Car(int weight, String type, String countryOfCreater, String mark, String model, Engine engine, Passanger[] passangers, int capasity, double ammountOfFuel) {
        super(weight, type, countryOfCreater);
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.passangers = passangers;
        this.capasity = capasity;
        this.ammountOfFuel = ammountOfFuel;
    }

    public double getAmmountOfFuel() { return ammountOfFuel; }

    public void setAmmountOfFuel(double ammountOfFuel) { this.ammountOfFuel = ammountOfFuel; }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Passanger[] getPassangers() {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers) {
        this.passangers = passangers;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capasity == car.capasity &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(passangers, car.passangers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark, model, engine, capasity);
        result = 31 * result + Arrays.hashCode(passangers);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", passangers=" + Arrays.toString(passangers) +
                ", capasity=" + capasity +
                '}';
    }
}
