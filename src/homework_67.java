
public class homework_67 {
	number 1
	//1 Допустимые:

		count — начинается с буквы, содержит только буквы.
		_index — допускается подчёркивание в начале.
		userName1 — буквы + цифры (не в начале).
		total_sum — буквы и подчёркивание допустимы.

		Недопустимые:
		5. 1value — нельзя начинать с цифры.
		6. user-name — дефис запрещён (это не допустимый символ).
		7. class — зарезервированное слово языка.
		8. total sum — пробелы в идентификаторах недопустимы.
}
    //2
int int = 5;
    //3
#include <stdio.h>

int main() {
    int Value = 1;
    int value = 2;

    printf("Value = %d\n", Value);
    printf("value = %d\n", value);

    return 0;
}
//4
#include <stdio.h>

int main() {
    int user_name = 10;
    int maxScore = 100;

    printf("user_name = %d\n", user_name);
    printf("maxScore = %d\n", maxScore);

    return 0;
}
//5
#include <iostream>
using namespace std;

class Test {
public:
    int x = 1;

    void show() {
        int x = 2; // локальная переменная

        cout << "this->x = " << this->x << endl;
        cout << "x = " << x << endl;
    }
};

int main() {
    Test t;
    t.show();
    return 0;
}
