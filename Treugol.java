package com.MGrigorovich.lemon.lesson2;

/*
Даны катеты прямоугольного треугольника. Найдите площадь, периметр и гипотенузу треугольника.

 @author MGrigorovich
 @version 0.01

*/
public class Treugol {
    public static void main(String[] args) {

        float a = 30f;
        float b = 30f;

        float S;
        float P;

        float hypotenuza = (float) Math.sqrt(a * a + b * b);
        P = a + b + hypotenuza;
        S = (float) 0.5 * (a * b);
        System.out.println("Гипотенуза =" + hypotenuza);
        System.out.println("Периметр =" + P);
        System.out.println("Площадь =" + S);
}
