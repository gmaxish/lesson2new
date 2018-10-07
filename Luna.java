package com.MGrigorovich.lemon.lesson2;

/*
  Сила тяжести на Луне примерно равна 17%. Напищите программу, которая вычисляет ваш вес на Луне.

 @author MGrigorovich
 @version 0.01

 */
public class Luna {
    public static void main(String[] args) {
        int moon = 17;
        int weight = 79;
        int earth = 100;
        double result = weight*moon/earth;
        System.out.println("Ваш Вес на луне составляет " +result+" кг.");
    }

}
