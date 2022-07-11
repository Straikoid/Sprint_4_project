package ru.praktikum.string_cheker;

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Веедите имя владельца карты и нажмиите enter:");
            String nameToCheck = in.nextLine();
            Account account = new Account(nameToCheck);
            if (account.checkNameToEmboss()) {
                System.out.println("Успех. Имя владельца карты прошло валидацию,.");
            } else {
                System.out.println("Внимание!!! Введённое имя не валидно и может быть напечатано на карте.");
            }
            System.out.println("Что бы провертить ещё одно имя нажмите Enter. Что бы выйти введите Quit и нажмите Enter.");
        }
        while (!in.nextLine().equals("Quit"));
    }
}
