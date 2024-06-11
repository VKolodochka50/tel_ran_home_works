package de.telran.homeWork_05_10_2;

public class PizzaCaloricCalc {
    public static void main(String[] args) {

        int defaultPizza = 24; //According to requirements - this is default Pizza size in cm.
        int newPizza = 28; //Extended Pizza for people who thinking that they are too skinny.
        int cmCalory = 40; //Default nutritive value per square cm.
        double pi = Math.PI;
        //Temporary variables for the Area and nutrition calculation results, just to make output command shorter
        int defAreaCircle = circleArea(defaultPizza, pi);
        int newAreaCircle = circleArea(newPizza, pi);
        int defPizzaCalory = caloryCalc(circleArea(defaultPizza, pi), cmCalory)/100;
        int newPizzaCalory = caloryCalc(circleArea(newPizza, pi), cmCalory)/100;


        System.out.println("Вычисляем радиус и питательность нашей пиццы");
        System.out.println("Диаметр Пиццы по умолчанию = " +defaultPizza);
        System.out.println("Радиус пиццы по умолчанию = " +radius(defaultPizza));
        System.out.println("Радиус увеличенной пиццы = " +radius(newPizza));
        System.out.println("Площадь пиццы по умолчанию в см^2= " +defAreaCircle);
        System.out.println("Питательность пиццы по умлочанию кКал = " +defPizzaCalory);
        System.out.println("Площадь увеличенной пиццы в см^2= " +newAreaCircle);
        System.out.println("Питательность увеличенной пиццы кКал = " +newPizzaCalory);
        System.out.println("При заказе пиццы диаметром " +newPizza+ " вы получите кКал больше на " +(newPizzaCalory-defPizzaCalory));
    }
    public static int radius (int i) {
        return i/2;
    }

    public static int circleArea (int myD, double doub2) {
        return (int) (doub2 * myD * myD);
    }

    public static int caloryCalc (int myI, int myI2) {
        return myI * myI2;
    }
}

//Напишите программу, которая вычисляет, сколько лишних калорий будет,
// если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим,
// что каждый квадратный сантиметр пиццы содержит 40 калорий.