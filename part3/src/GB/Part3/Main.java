package GB.Part3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean retBool = true;
        int answerNum;
        System.out.println("Выберите игру.");
        System.out.println("1. Угадай число.");
        System.out.println("2. Угадай слово.");
        answerNum = readNum();
        if (answerNum == 1) {
            isNumber();
            do {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                answerNum = readNum();
                if (answerNum == 1) {
                    isNumber();
                } else if (answerNum == 0)
                    retBool = false;
            } while (retBool);
        } else if (answerNum == 2){
            isWord();
        } else System.out.println("Такой игры нет.");
    }

    static int readNum() {
        Scanner isReturn = new Scanner(System.in);
        do {
            if (isReturn.hasNextInt()) {
                return isReturn.nextInt();
            }
            isReturn.nextLine();
        } while (true);
    }

    static void isWord() {
        Scanner inNum = new Scanner(System.in);
        String textUser;
        String wordUser="###############";
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int num = rand.nextInt(25);
        //System.out.println("Загаданное слово № " + (num+1) + " - " + words[num]);
        System.out.print("Сыграем в отгадай слово. Введите слово: ");

        do {
            textUser = inNum.nextLine();
            if (textUser.equals(words[num])) {
                System.out.println("Вы угадали слово. Было загадно " + words[num] + ".");
                break;
            } else {
                for (int i = 0; i < words[num].length() & i < textUser.length(); i++) {
                    if (textUser.charAt(i) == words[num].charAt(i))
                        wordUser = wordUser.substring(0, i) + textUser.charAt(i) + wordUser.substring(i + 1, wordUser.length());
                }
                System.out.println("Найдено совпадение по буквам " + wordUser + ".");
                wordUser="###############";
            }
            }while (true);
    }

    static void isNumber() {
        int inNum;
        Random rand = new Random();
        int num = rand.nextInt(10);
        //System.out.println("Загаданное число " + num);
        System.out.println("Сыграем в отгадай число. Дается 3 попытки. Чтобы отгадать загаданное целое число от 0 до 9. Введите первое число.");
        for (int i = 0; i < 3; i++) {
            inNum = readNum();
            if (inNum == num) {
                System.out.println("Вы угадали число. Было загадно " + num + ".");
                break;
            } else if (i == 2) {
                System.out.println("Загаданное число не угадано. Все попытки использованы.");
                System.out.println("Вы проиграли.");
            }else if (inNum<num)
                System.out.println("Загаданное число больше введенного. Попытка " + (i+1) + " из 3. Введите новое число.");
            else
                System.out.println("Загаданное число меньше введенного. Попытка " + (i+1) + " из 3. Введите новое число.");
        }
    }

}
