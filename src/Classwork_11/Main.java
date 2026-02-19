package Classwork_11;

public class Main {
	public static void main(String[] args) {

        Hero hero1 = new Hero("Xafiz", 100, 20, 1);
        Hero hero2 = new Hero("Jumsud", 120, 15, 1);

        // О героях
        hero1.showInfo();
        hero2.showInfo();

        // Атаки
        hero1.attack();
        hero2.takeDamage(hero1.strength);

        hero2.attack();
        hero1.takeDamage(hero2.strength);

        // Псле боя
        hero1.showInfo();
        hero2.showInfo();
    }

 }



