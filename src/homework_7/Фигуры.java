package homework_7;

public class Фигуры {
	public static double площадьКвадрата(double сторона) {
        return сторона * сторона;
    }

    public static double площадьПрямоугольника(double длина, double ширина) {
        return длина * ширина;
    }

    public static void main(String[] args) {
        double[] квадраты = {5, 8, 3, 10, 6};

        System.out.println("Площади квадратов:");
        double maxПлощадь = 0;

        for(double сторона : квадраты) {
            double площадь = площадьКвадрата(сторона);
            System.out.println(площадь);
            if(площадь > maxПлощадь) maxПлощадь = площадь;
        }

        double[][] прямоугольники = {
            {4,6}, {7,3}, {9,2}, {5,5}
        };

        System.out.println("Площади прямоугольников:");

        for(double[] п : прямоугольники) {
            double площадь = площадьПрямоугольника(п[0], п[1]);
            System.out.println(площадь);
            if(площадь > maxПлощадь) maxПлощадь = площадь;
        }

        System.out.println("Самая большая площадь: " + maxПлощадь);
    }
}

