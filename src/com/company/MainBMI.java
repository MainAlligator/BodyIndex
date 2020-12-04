package com.company;

import java.util.Scanner;

public class MainBMI {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите свое имя: ");

        String name = s.nextLine();
        System.out.println("Введите свой вес: ");
        int weight = s.nextInt();

        System.out.println("Введите свой рост в метрах: ");
        double height = s.nextDouble();
        double mti = BodyMassIndex.calculateBodyMassIndex(weight, height);
        System.out.println("Ваш индекс массы тела: " + mti);

        System.out.println(BodyMassIndex.interpretation(mti));
        System.out.println("******************************");

        System.out.println(BodyMassIndex.printResult ( name, weight,height,mti));


    }


}