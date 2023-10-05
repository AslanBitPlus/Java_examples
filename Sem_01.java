import java.time.LocalDateTime;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String name = "Ivan";
        int a = 10;
        byte a1 = 125;
        float a2 = 10.5F;
        double a3 = 11.5;
        char ch = 'c';
        int b = a - (int)a2;
        /*
        System.out.println("Good morning " + name);

        // Ввод данных
        System.out.println("Enter your name :");
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        System.out.println("Good morning " + name1);

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i ++;
        }

        
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        */

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }

        System.out.println(LocalDateTime.now()); // Вывод даты и времени
        
        if (a < 5) {
            System.out.println("a < 5"); 
        } else if (a == 5) {
            System.out.println("a = 5");
        } else {
            System.out.println("a > 5");
        }


    }
    
}
