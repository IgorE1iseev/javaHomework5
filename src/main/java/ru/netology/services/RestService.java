package ru.netology.services;

public class RestService {

    public int calculate(int income, int expenses, int threshold) {
        int monthCount = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            if (money < threshold) {
                money = money + income;
                money = money - expenses;
            } else {
                monthCount++;
                money = money - expenses;
                money = money - (money - money / 3);
            }
        }
        return monthCount;
    }
}
