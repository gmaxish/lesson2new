package com.MGrigorovich.lemon.lesson2;
/*
Напишите метод переводящий гривны в доллары по заданному курсу. В качестве аргументов передайте кол-во гривен и курс.

 @author MGrigorovich
 @version 0.01
 */


public class Exch {

        static double exchange(double UAH, double USA){
            return UAH * USA;
        }
        public static void main(String[] args) {
            double cu = exchange(1.0,28.15);
            System.out.println("Курс USA/UAH составялет "+cu);
        }
    }

