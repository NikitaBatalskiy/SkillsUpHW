package HW2;

public class HW2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Task calculation = new Task();
        System.out.println("3x^2 - 4x + 1 = 0");
        System.out.println("Input a:");
        int one = scan.nextInt();
        System.out.println("Input b:");
        int two = scan.nextInt();
        System.out.println("Input c:");
        int three = scan.nextInt();
        System.out.println(one + "x^2 - " + two + "x + " + three + " = 0");
        calculation.discriminant(one, two, three);
        calculation.hello();
        calculation.lotery();
        calculation.niechet();
        calculation.chet();
        calculation.fibonachi(8);
        calculation.eve();
        calculation.reverseEve();
        calculation.table();
    }
}
