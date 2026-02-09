package homework_7;

public class Кубик {
	public int броситьКубик() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Кубик кубик = new Кубик();

        int всегоОчков = 0;
        int количествоБросков = 15;

        System.out.println("Игра начинается!");

        for(int i = 1; i <= количествоБросков; i++) {
            int очки = кубик.броситьКубик();
            System.out.println("Бросок " + i + ": " + очки);

            всегоОчков += очки;

            if(очки == 1) System.out.println("Очень плохо...");
            if(очки == 6) System.out.println("Классно! Шестёрка!");
        }

        System.out.println("Всего набрано очков: " + всегоОчков);
    }
}

