package de.telran.homeWork_05_10_2;

public class PizzaCaloryCalc {
    public static void main(String[] args) {

        int defaultPizza = 24;
        int newPizza = 28;
        int cmCalory = 40;
        double pi = Math.PI;
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
        int area = (int) (doub2 * myD * myD);
        //System.out.println(area);
      return area;
    }

    public static int caloryCalc (int myI, int myI2) {
        return myI * myI2;
    }
}

//Напишите программу, которая вычисляет, сколько лишних калорий будет,
// если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим,
// что каждый квадратный сантиметр пиццы соде ржит 40 калорий.