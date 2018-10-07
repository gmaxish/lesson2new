package com.MGrigorovich.lemon.lesson2;
/*
 В переменных q и w хранятся два натуральных числа.
 Создайте программу, выводящую на экран результат денениея q на w с остатком
 Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21/8 = 2 и 5 в остатке.

 @author MGrigorovich
 @version 0.01
 */

public class DeleniePoModulu {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int e = q%w;
        System.out.println(e);
    }
}

