package HW4;

import java.util.Objects;

public class Passanger {
    private String name;
    private int age;

    public Passanger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passanger passanger = (Passanger) o;
        return age == passanger.age &&
                Objects.equals(name, passanger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Passanger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Car sitInCar(Car car, Passanger passanger) {
        if (car.getCapasity() > 1 && car.getCapasity() <= 4) {
            for (int countOfPass = 0; countOfPass < car.getPassangers().length; countOfPass++) {
                if (car.getPassangers()[countOfPass] == null) {
                    car.getPassangers()[countOfPass] = passanger;
                    break;
                } else System.out.println("Sorry, no place for you this time :(");
            }
        }

        return car;
    }

    public Car getOutOfCar(Car car, Passanger passanger) {
        for (int count = 0; count < car.getPassangers().length; count++) {
            if (car.getPassangers()[count].equals(passanger)) {
                car.getPassangers()[count] = null;
                System.out.println("This place is free to sit.");
            }
        }


        return car;
    }
}
