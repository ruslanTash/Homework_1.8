import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] racionals = {1.57, 7.654, 9.986};
        //Произвольный массив. Тип и количество данных определите сами.
        //Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        char[] qwe = new char[3];
        qwe[0] = 'q';
        qwe[1] = 'w';
        qwe[2] = 'e';

        System.out.println("Задача 2.");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i]);
            if (i != 2) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(racionals[i]);
            if (i != 2) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(qwe[i]);
            if (i < 2) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        System.out.println("Задача 3.");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        //В конце строки запятую ставить не надо.
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(racionals[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(qwe[i]);
            if (i > 0) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        System.out.println("Задача 4.");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

