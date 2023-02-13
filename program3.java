// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;

public class program3 {

    public static boolean isPalindrome(String s) {
        String text = s.toLowerCase(); // .replaceAll("[^a-zA-Z0-9]", "") чтобы убрать из строки все знаки и числа
        String reversed = new StringBuffer(text).reverse().toString();
        return reversed.equals(text);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите строку для проверки на палиндром: ");
        String s = scan.next();
        System.out.println(isPalindrome(s));
        scan.close();
    }
}