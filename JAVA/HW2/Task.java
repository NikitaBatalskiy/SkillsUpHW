package HW2;

import java.util.Scanner;

public class Task {
    public void discriminant(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        double sqrtD = Math.sqrt(D);
        double x1 = (-b + sqrtD) / 2 * a;
        double x2 = (-b - sqrtD) / 2 * a;
        System.out.println("D = " + D + "; D^(1/2) = " + sqrtD);
        System.out.println("X1 = " + x1 + "; X2 = " + x2);
        System.out.println();
        System.out.println();
    }

    public void vieta() {

    }

    public void fibonachi(int count) {
        int first = 0;
        int second = 1;
        int next;
        System.out.println(first + " " + second + " ");
        for (int i = 2; i <= count; i++) {
            next = first + second;
            System.out.println(next + "");
            first = second;
            second = next;
        }
        System.out.println();
        System.out.println();
    }


    public void table() {
        for (int first = 0; first <= 10; first++) {
            for (int second = 0; second <= 10; second++) {
                System.out.printf(first + "*" + second + "=" + first * second + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void eve() {
        for (int index1 = 0; index1 < 8; index1++) {
            for (int index2 = 0; index2 <= index1; index2++) {
                System.out.printf("*");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }

    public void reverseEve() {
        for (int index1 = 8; index1 > 0; index1--) {
            for (int index2 = 0; index2 < index1; index2++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public void hello() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input time in hours (0-23): ");
        int time = scan.nextInt();
        if (time >= 22 && time <= 3) System.out.println("Good night.");
        if (time >= 4 && time <= 11) System.out.println("Good morning.");
        if (time >= 12 && time <= 18) System.out.println("Good afternoon.");
        if (time >= 19 && time <= 21) System.out.println("Good evening.");
        System.out.println();
        System.out.println();
    }

    public void lotery() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your lotery number(1-20): ");
        double numberOfRandom = (int) (Math.random() * 19) + 1;
        System.out.println(numberOfRandom);
        int number = scan.nextInt();
        while (number != numberOfRandom) {
            System.out.println("Not this time! Try again.");
            number = scan.nextInt();
        }
        System.out.println("Congrats! You have won!");
        System.out.println();
        System.out.println();
    }

    public void niechet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input [a;b] niechet");
        System.out.println("a: ");
        int a = scan.nextInt();
        System.out.println("b: ");
        int b = scan.nextInt();
        System.out.println("Niechet: ");
        while (a<=b){
            if (a % 2 != 0) System.out.println(a);
            a++;
        }
        System.out.println();
        System.out.println();
    }

    public void chet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input [a;b] chet");
        System.out.println("a: ");
        int a = scan.nextInt();
        System.out.println("b: ");
        int b = scan.nextInt();
        System.out.println("Chiet: ");
        while (a<=b) {
            if (a % 2 == 0) System.out.println(a);
            a++;
        }
        System.out.println();
        System.out.println();
    }
}
