/*
Задание №3
� Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */

public class Sem_01_z03 {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxcount = 0;

        // if (array[0] == 1) count = 1;

        for (int i = 1; i < array.length; i++) {
            // System.out.println(count);
            if (array[i] == 1 & array[i - 1] == 1) {
                if (count == 0) count = 2;
                else count ++;
                if (count > maxcount) maxcount = count;
            } else {
                count = 0;
            }
        }
        System.out.println(maxcount);

    }
}