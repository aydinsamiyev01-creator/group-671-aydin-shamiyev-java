package classwork_4;

public class Classwork_4 {
	public static void main(String[] args) {
		//1
		class Account {
		    private String owner;
		    private double balance;

		    public Account(String owner, double balance) {
		        this.owner = owner;
		        this.balance = balance;
		    }

		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		        }
		    }

		    public void withdraw(double amount) {
		        if (amount <= balance) {
		            balance -= amount;
		        } else {
		            System.out.println("Ошибка: недостаточно средств!");
		        }
		    }

		    public double getBalance() {
		       return balance;
		       //2
		       class Rectangle {
		            double width;
		            double height;

		            public Rectangle(double width, double height) {
		                this.width = width;
		                this.height = height;
		            }

		            public double area() {
		                return width * height;
		            }

		            public Rectangle scale(double factor) {
		                return new Rectangle(width * factor, height * factor);
		            }
		       }
		       //3
		       class Temperature {
		            double celsius;

		            public Temperature(double celsius) {
		                this.celsius = celsius;
		            }

		            public double toFahrenheit() {
		                return celsius * 9 / 5 + 32;
		            }

		            public static Temperature fromFahrenheit(double f) {
		                return new Temperature((f - 32) * 5 / 9);
		            }
		        }
		       //4
		       class Employee {
		            double salary;

		            public Employee(double salary) {
		                this.salary = salary;
		            }

		            double calculateBonus() {
		                return salary * 0.10;
		            }
		        }

		        class Manager extends Employee {

		            public Manager(double salary) {
		                super(salary);
		            }

		            @Override
		            double calculateBonus() {
		                return super.calculateBonus() * 2;
		            }
		        }
		        //5
		        class Character {
		            String name;
		            int health;
		            int strength;

		            public Character(String name, int health, int strength) {
		                this.name = name;
		                this.health = health;
		                this.strength = strength;
		            }

		            public Character heal(int value) {
		                health += value;
		                return this;
		            }

		            public Character train() {
		                strength += 5;
		                return this;
		            }

		            public void printStats() {
		                System.out.println("Имя: " + name);
		                System.out.println("Здоровье: " + health);
		                System.out.println("Сила: " + strength);
		            }
		        }
		      
	