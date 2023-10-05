/*
Задание №5
� Реализовать функцию возведения числа а в степень b. a, b из Z.
� Пример 1: а = 3, b = 2, ответ: 9
� Пример 2: а = 2, b = -2, ответ: 0.25
� Пример 3: а = 3, b = 0, ответ: 1
 */
public class Sem_01_z05 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        double c = 0;

        if (b >= 0) {
            c = st(a, b);
        } else {
            b = b * -1;
            c = 1 / st(a, b);
        }

        System.out.println(c);
       
    }
    public static double st(int value, int stValue) {
        double result = 1;
        for (int i = 1; i <= stValue; i++) {
        result = result * value;
        }
        return result;
    }
}
