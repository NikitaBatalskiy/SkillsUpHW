package HW4;

public class Util {
    int distance = (int) (Math.random() * 1000);

    public void start(Car car) {
        System.out.println("Engine of " + car.getMark() + " " + car.getModel() + " has started.");
    }

    public void stop(Car car) {
        System.out.println("Engine of " + car.getMark() + " " + car.getModel() + " has stoped.");
    }

    public Car sitInCar(Car car, Passanger passanger) {
        boolean canSitDown = false;
        for (Passanger randomPassanger : car.getPassangers()) {
            if (randomPassanger == null) {
                canSitDown = true;
                break;
            }
        }
        if (canSitDown == true) {
            for (int countOfPass = 0; countOfPass < car.getPassangers().length; countOfPass++) {
                if (car.getPassangers()[countOfPass] == null) {
                    car.getPassangers()[countOfPass] = passanger;
                    System.out.println(passanger.getName() + " sit in the " + car.getMark() + " " + car.getModel() + " on seat number " + (++countOfPass) + ".");
                    break;
                }
            }
        } else System.out.println(passanger.getName() + ", sorry, there is no place left for you in this car.");
        return car;
    }

    public boolean isPassInCar(Car car, Passanger passanger) {
        boolean isPassInCar = false;
        for (Passanger pass : car.getPassangers()) {
            if (pass == null) {
                break;
            } else if (pass.equals(passanger)) {
                isPassInCar = true;
                break;
            } else {
                isPassInCar = false;
                System.out.println("This passanger is not in car now.");
            }
        }
        return isPassInCar;
    }

    public Car getOutOfCar(Car car, Passanger passanger) {
        if (isPassInCar(car, passanger) == true) {
            for (int number = 0; number < car.getPassangers().length; number++) {
                if (passanger.equals(null)) {
                    break;
                } else if (passanger.equals(car.getPassangers()[number])) {
                    car.getPassangers()[number] = null;
                    System.out.println(passanger.getName() + " exit from car. " + (++number) + " seat is free.");
                    break;
                }
            }
        }
        return car;
    }

    public Car getOutOfCar(Car car, int numberOfPassanger) {
        for (int number = 0; number < car.getPassangers().length; number++) {
            if (numberOfPassanger == number) {
                car.getPassangers()[number] = null;
                System.out.println((++number) + " person got out of car. " + (number) + " seat is free.");
            }
        }
        return car;
    }

    public boolean enoughFuel(Car car) {
        boolean enoughFuel;
        System.out.println("We need to drive " + distance + " km");
        double fuelUsage = ((double) car.getEngine().getHorsePower() / 1000) * car.getEngine().getSpeed() * 0.2;
        int carDistance = (int) (car.getAmmountOfFuel() / (fuelUsage / 100));
        if (carDistance >= distance) {
            enoughFuel = true;
            System.out.println("Fuel enough!");
        } else {
            enoughFuel = false;
            System.out.println("Fuel not enough!");
        }
        return enoughFuel;
    }

    public void eating(Passanger passanger) {
        System.out.println(passanger.getName() + " is eating now.");
    }

    public void riding(Car car) {
        System.out.println("The " + car.getMark() + " " + car.getModel() + " is riding.");
    }


}
