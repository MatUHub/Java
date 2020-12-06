package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    static final int SIZE = 3;

    static final char DOT_EMPTY = '?';
    static final char DOT_HUMAN = 'Х';
    static final char DOT_AI = 'О';

    static final String FIRST_DOT = "½";
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {

        turnGame();

    }

    private static void turnGame() {
        contMap();
        printMap();
        playGame();
    }

    private static void contMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRaw();
    }

    private static void printMapHeader() {
        System.out.print(FIRST_DOT + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRaw() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {

            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rawNumber = 0;
        int columNumber = 0;

        System.out.println("Ход человека!");
        do {
            System.out.println("Введите номер строки:");
            if (in.hasNextInt()) {
                rawNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число от 1 до 3");
                continue;
            }

            System.out.println("Введите номер столбца:");
            if (in.hasNextInt()) {
                columNumber = in.nextInt();
            } else {
                in.next();
                System.out.println("Введите число от 1 до 3");
            }
        } while (!isCellValid(rawNumber, columNumber));
        map[rawNumber - 1][columNumber - 1] = DOT_HUMAN;

    }

    private static boolean isCellValid(int rawNumber, int columNumber) {
        return isCellValid(rawNumber, columNumber, false);

    }

    private static boolean isCellValid(int rawNumber, int columNumber, boolean isAi) {
        if (!isAi && (rawNumber < 1 || rawNumber > SIZE || columNumber < 1 || columNumber > SIZE)) {
            return false;
        }
        if (map[rawNumber - 1][columNumber - 1] != DOT_EMPTY) {
            if (!isAi) {
                System.out.println("Эта ячейка занята! Выберите другую ячейку");
            }
            return false;
        }
        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;
            if (symbol == DOT_HUMAN) {
                winMessage = "Победило человечество!";
            } else winMessage = "Машины победили!";
            isEnd = true;
            System.out.println(winMessage);
        }

    if (isMapFull()) {
        System.out.println("Ничья!");
        isEnd = true;
    }


        if (isEnd)
            System.exit(0);
    }

    private static boolean checkWin(char symb) {
        int i;

        for(char [] chars: map){
            int count = 0;
            for( i = 0; i < SIZE; i++) {
                if(chars[i] == symb) count++;
                if(count == SIZE) return true;
            }

            for(i = 0; i < SIZE; i++) {
                count = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (map[j][i] == symb) count++;
                    if (count == SIZE) return true;
                }
            }
                count = 0;
                for(i = 0; i < SIZE; i++){
                    if(map[i][i]==symb) count++;
                    if(count == SIZE) return true;
                }

                count = 0;
                for(i = 0; i < SIZE; i++){
                    if(map[i][map.length - i - 1]==symb) count++;
                    if(count == SIZE) return true;
                }

        }
        return false;
    }



    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) return false;
            }
        }
        return true;
}

    private static void aiTurn() {
        int rawNumber;
        int columnNumber;
        System.out.println("Ход компьютера!");
        do{
            rawNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) +1;
        } while (!isCellValid(rawNumber,columnNumber,true));
        map[rawNumber - 1][columnNumber - 1] = DOT_AI;

    }
}




