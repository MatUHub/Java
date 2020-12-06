//package lesson3;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main3_1 {
//    public static void main(String[] args) {
//
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int index = random.nextInt(words.length - 1);
//        String word = words[index];
//        char [] wordAnswer = new char [9];
//
//        while (true) {
//            System.out.println("Введите слово");
//            String wordPlayer = scanner.next();
//
//
//            if(wordPlayer.equals(word)) {
//                System.out.println("pobeda !");
//                break;
//            }
//
//            for (int i = 0; i < word.length(); i++) {
//          char a = word.charAt(i);
//          char b = wordPlayer.charAt(i);
//          if(a == b) wordAnswer[i] = a;
//
//                    }
//        System.out.println(wordAnswer);
//    }
//    }
//
//}
