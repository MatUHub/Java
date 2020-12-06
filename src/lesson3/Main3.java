/*package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Игра угадай число от 0 до 9");
        guessNumber();
        chooseAnswer();
    }



    private static void guessNumber() {
        Random random = new Random();
        int aSupposed = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int counter = 3;
        while (true) {
            if (counter < 1) {
                System.out.println("Ваши попытки закончились! Загаданное число было " + aSupposed);
                break;
            }
            System.out.printf("У вас %d попытки%nВведите предполагаемое значение загаданного числа: %n", counter);
            int aPlayer = scanner.nextInt();

            if (aPlayer == aSupposed) {
                System.out.println("Поздравляю, вы угадали число!\n");
                break;
            } else if (aPlayer < aSupposed) {
                counter--;
                System.out.println("Загаданное число больше предполагаемого числа\n");
            } else if (aPlayer > aSupposed) {
                counter--;
                System.out.println("Загаданное число меньше предполагаемого числа\n");
            }
        }

    }
    private static void chooseAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Повторить игру еше раз? 1 - да/ 0 - нет");
        int playOrNot = scanner.nextInt();

        switch (playOrNot) {
            case 1: guessNumber();
                    chooseAnswer();
            break;
            case 0: System.out.println("Спасибо за игру!");

        }
    }

}

*/
