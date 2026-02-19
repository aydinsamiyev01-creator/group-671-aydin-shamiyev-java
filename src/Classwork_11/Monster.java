package Classwork_11;

public class Monster {
	 protected String type;
	    protected int health;
	    protected int damage;

	    public Monster(String type, int health, int damage) {
	        this.type = type;
	        this.health = health;
	        this.damage = damage;
	    }

	    public int attack() {
	        return damage;
	    }

	    public void roar() {
	        System.out.println(type + " монстр рычит!");
	    }

	    public int specialAbility() {
	        return 0;
	    }
	}

