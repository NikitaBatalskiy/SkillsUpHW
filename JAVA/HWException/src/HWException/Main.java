package HWException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите сумму в гривнах, которую Bы готовы потратить у нас: ");
        int amountOfUsersMoney = scanner.nextInt();
        System.out.println();
        int MinPrice = (int) (Math.random()*2000) + 8000;
        System.out.println("Минимальная стоимость продукта у нас такова: " + MinPrice);
        System.out.println();
        try {
            if (MinPrice > amountOfUsersMoney) {
                throw new MoneyNotEnoughException("Простите, но у Вас недостаточно денег для покупки какого-либо продукта у нас.");
            }
            else System.out.println("Удачной покупки!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
