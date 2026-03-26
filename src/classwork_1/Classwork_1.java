package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		//1
    	int age = 18;
		 if (age >= 18) {
	         System.out.println("Вы совершеннолетний");
		 }
		 //2
		
		 int temperature = 0;
		
		 if (temperature < 0) {
            System.out.println("Холодно, одевайтесь теплее");
		 } else {
	        System.out.println("Холодно, одевайтесь теплее");
		 }
		 //3
		 int mark = 4;
		 if (mark > 4) {
		 System.out.println("Great !");
	     } else if (mark < 5) {
	     System.out.println("Normal!");
	     }else {
	     System.out.println("Bad !");
	    }
		 
		//5
	     
	    int day = 7;;
	        switch(day) {
	        case 1 -> System.out.println("Понедельник");
	        case 2 -> System.out.println("Вторник");
	        case 3 -> System.out.println("Среда");
	        case 4 -> System.out.println("Четверг");
	        case 5 -> System.out.println("Пятница");
	        case 6 -> System.out.println("Суббота");
	        case 7 -> System.out.println("Воскресенье");
	        }	  
	        
	        
	        
	        // 6
	        int grade = 5;
	        switch(grade) {
	        case 'A' -> System.out.println("Отлично");
	        case 'B' -> System.out.println("Хорошо");
	        case 'C' -> System.out.println("Средне");
	        case 'D' -> System.out.println("Плохо");
	        case 'F' -> System.out.println("Не сдал");
	        }

	     // 4
			int age = sc.nextInt();
			if (age < 18) {
				System.out.println("Несовершеннолетний");
			} else {
				System.out.println("Совершеннолетний");
			}

			// 5
			int score = sc.nextInt();
			if (score >= 90 == score <= 100) {
				System.out.println("Отлично");
			} else if (score >= 70) {
				System.out.println("Хорошо");
			} else if (score >= 50) {
				System.out.println("Удовлетворительно");
			} else {
				System.out.println("Не сдал");
			}

			// 6
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double max = x;
			if (y > max)
				max = y;
			if (z > max)
				max = z;

			System.out.println("Максимум: " + max);

			// 7
			int year = sc.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Високосный год");
			} else {
				System.out.println("Обычный год");
			}

			// 8
			String password = sc.next();
			if (password.equals("12345")) {
				System.out.println("Доступ разрешен");
			} else {
				System.out.println("Неверный пароль");
			}

			// 9
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			String op = sc.next();

			if (op.equals("+")) {
				System.out.println(num1 + num2);
			} else if (op.equals("-")) {
				System.out.println(num1 - num2);
			} else if (op.equals("*")) {
				System.out.println(num1 * num2);
			} else if (op.equals("/")) {
				if (num2 != 0) {
					System.out.println(num1 / num2);
				} else {
					System.out.println("Деление на ноль!");
				}
			} else {
				System.out.println("Неизвестная операция");
			}

			// 10
			double amount = sc.nextDouble();

			if (amount > 1000) {
				amount *= 0.9;
			} else if (amount > 500) {
				amount *= 0.95;
			}

			System.out.println("Итог: " + amount);

			sc.close();
		}
	}
	        	
	    
	      
	        
	        
	        
	        
	        



  

