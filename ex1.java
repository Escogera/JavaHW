// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HomeWork.s1hw;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 1;
        System.out.print("Введите число:  ");
        int n = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.printf("Треугольное число от %d равно %d \n", i, i * (i + 1) / 2);
        }

        System.out.println();

        for (int i = 1; i < n + 1; i++) {
            System.out.printf("факториал числа %d равен %d \n", i, res = res * i);
        }
        in.close();
    }
}
