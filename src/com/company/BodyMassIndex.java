package com.company;

public class BodyMassIndex {
    public static double calculateBodyMassIndex(double weight, double height) {
        double mti = weight / (height * height);
        return mti;

    }

    public static String interpretation(double result) {
        if (result < 16) {
            return "Выраженный дефицит массы тела";
        }
        if (16 <= result && result < 18.5) {
            return "Недостаточная (дефицит) масса тела";
        }
        if (18.5 <= result && result < 25) {
            return "Норма";
        }
        if (25 <= result && result < 30) {
            return "Избыточная масса тела (предожирение)";
        }
        if (30 <= result && result < 35) {
            return "Ожирение";
        }
        if (35 <= result && result < 40) {
            return "Ожирение резкое";
        } else {
            return "Очень резкое ожирение";
        }

    }
    public static String printResult (String name, int weight, double height, double mti ){



        System.out.println("Имя: " + name );
        System.out.println("Вес: " + weight );
        System.out.println("Рост: " + height );
        System.out.println("Индекс: " + mti );
        return interpretation(mti);

    }


}






