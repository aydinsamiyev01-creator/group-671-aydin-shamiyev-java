package homework_7;

public class МагазинИгрушек {
	public static long округлить(double цена) {
        return Math.round(цена);
    }

    public static void main(String[] args) {
        double[] цены = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};

        System.out.println("Цены в магазине игрушек:");

        double суммаЦен = 0.0;

        for(double цена : цены) {
            long целаяЦена = округлить(цена);
            System.out.println("Игрушка: " + цена + " → после округления: " + целаяЦена);
            суммаЦен += цена;
        }

        double средняя = суммаЦен / цены.length;
        System.out.println("Средняя цена ≈ " + Math.round(средняя));
    }
}

