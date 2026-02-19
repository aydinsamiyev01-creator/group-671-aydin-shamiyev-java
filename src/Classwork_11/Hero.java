package Classwork_11;

public class Hero {
	String name;
	int health;
	int strength;
	int level;
    // Конструктор
	public Hero(String name, int health, int strength, int level) {
		this. name = name;
		this. health = health;
		this. strength = strength;
		this.level = level;
	}
	// Методы
	public void attack() {
		System.out.println("Герой атакует с силой :" + strength);
	}
	public void takeDamage(int damage){
		System.out.println("Health before damage :" + health + "Health after damage :" + (health - damage)); 		
	}
	public void showInfo() {
		System.out.println("Name :" + name + "; Health ;" + health + "; Strength :" + strength + "; Level ;" + level);
	}

  }
