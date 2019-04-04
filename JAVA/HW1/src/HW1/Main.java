package HW1;

public class Main {
    public static void main(String[] args) {
        double Pi = 3.14;
        ForCalculating calc = new ForCalculating();
        calc.reshenie(3f,-4f,1);
        System.out.println(calc.SRound(Pi,3f));
        System.out.println(calc.CRound(Pi,5f));
        System.out.println(calc.hipotenusa(3f,4f));
        System.out.println(calc.getRootsByViet(1, 4,3));
    }
}
