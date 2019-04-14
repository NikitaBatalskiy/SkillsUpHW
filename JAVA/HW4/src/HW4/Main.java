package HW4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(400, "avto", "Japan", "Toyota", "X5",
                new Engine(80, 60), new Passanger[4], 4, 80);
        Util util = new Util();
        Passanger Nick = new Passanger("Nick", 19);
        Passanger Gleb = new Passanger("Gleb", 17);
        Passanger Anton = new Passanger("Anton", 20);
        Passanger Eduard = new Passanger("Eduard", 21);
        Passanger Sofia = new Passanger("Sofia", 19);
        if(util.enoughFuel(car1)){
            util.sitInCar(car1, Nick);
            util.sitInCar(car1, Gleb);
            util.sitInCar(car1, Anton);
            util.sitInCar(car1, Eduard);
            util.sitInCar(car1, Sofia);
            util.start(car1);
            int stopDistance = (int)(Math.random()* util.distance);
            System.out.println("We drove up to " + stopDistance + " km. We need to stop.");
            util.stop(car1);
            util.getOutOfCar(car1, Nick);
            util.getOutOfCar(car1, 2);
            util.eating(Nick);
            util.sitInCar(car1, Nick);
            util.sitInCar(car1, Anton);
            util.start(car1);
            util.riding(car1);
            System.out.println("The trip is over. We have got to the destination.");
            util.getOutOfCar(car1, 0);
            util.getOutOfCar(car1, 1);
            util.getOutOfCar(car1, 2);
            util.getOutOfCar(car1, 3);
            util.stop(car1);
        } else {
            System.out.println("We can't get there. We need an airplane! :)");
        }
    }
}
