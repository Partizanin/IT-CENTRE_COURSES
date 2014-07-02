package BASE.Homework.HomeWork3;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User:Partizanin
 * MyDate:03.01.14
 * Time: 12:36.
 * To change this template use File|Settings|File Templates.
 * <p/>
 * 3.12*. Строки. Ввод пароля.
 * Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
 * - длинна пароля должна быть от 8 до 20 символов
 * - в пароле должны быть как маленькие так и большие буквы
 * - должны быть цифры
 * - не должен содержать слов 'password', 'pass', 'gfhjkm'
 */
public class Task3dot12 {

    public static void main(String[] args) {

        new Task3dot12().createPassword();
    }

    private String password;


    public void createPassword() {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        for (; ; ) {
            if (stop) {
                break;
            }
            String tempPassword;
            System.out.print("Input password: ");

            tempPassword = sc.nextLine();

            if (passwordScanner(tempPassword)) {
                System.out.println("Your password is good");

                for (; ; ) {
                    System.out.println("Input your password again");
                    String temp = sc.nextLine();
                    if (temp.equals(tempPassword)) {
                        System.out.println("Congratulation!");
                        password = tempPassword;

                        stop = true;
                        break;
                    } else {

                        System.out.println("You input different value\nPleas try again");
                    }
                }
            } else {
                System.err.println("Your password is bad,pleas try again");
            }
        }
    }

    private boolean passwordScanner(String password) {

        boolean result = false;

        if (!(password.length() > 8) && !(password.length() <= 201)) {
            return false;
        }

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                result = true;
                break;
            }
        }

        for (char c : password.toCharArray()) {

            if (Character.isLowerCase(c)) {
                result = true;
                break;
            }
        }

        if (!result) {
            return false;
        } else {
            result = false;
        }

        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        for (int i = 0; i < password.length(); i++) {

            for (char number : numbers) {

                if (password.charAt(i) == number) {

                    result = true;
                    break;
                }

                if (result) {
                    break;
                }
            }
        }

        if (!result) {
            return false;
        }

        String[] words = {"gfhjkm", "password", "pass "};

        for (String word : words) {
            if (password.contains(word)) {
                return false;
            }
        }


        return true;
    }


}
