package homework_7;

public class Расстояния {
	public static double посчитайРасстояние(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static void main(String[] args) {
        double[][] места = {
            {4,3},   // школа
            {0,8},   // магазин
            {5,12},  // парк
            {9,0},   // друг
            {2,10},  // кино
            {7,5}    // бабушка
        };

        String[] названия = {"Школа", "Магазин", "Парк", "Друг", "Кино", "Бабушка"};

        System.out.println("Расстояние от дома до:");

        double min = Double.MAX_VALUE;
        double max = 0;

        for(int i = 0; i < места.length; i++) {
            double dist = посчитайРасстояние(0, 0, места[i][0], места[i][1]);
            System.out.println(названия[i] + ": " + dist);

            if(dist < min) min = dist;
            if(dist > max) max = dist;
        }

        System.out.println("Ближайшее место: " + min + " метров");
        System.out.println("Самое дальнее: " + max + " метров");
    }
}
	

