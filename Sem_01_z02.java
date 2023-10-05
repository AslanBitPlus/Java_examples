/*
Задание №2
� В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
� "Доброе утро, <Имя>!", если время от 05:00 до 11:59
� "Добрый день, <Имя>!", если время от 12:00 до 17:59;
� "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
� "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.time.LocalTime;
import java.util.Scanner;


public class Sem_01_z02 {
    public static void main(String[] args) {

        System.out.println("Введите ваше имя :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // Date date = new Date(0);
        int hour = LocalTime.now().getHour();
        
        if (hour == 23 || hour < 5) {
            System.out.println("Доброй ночи " + name + "!");
            
        } else if (hour < 12) {
            System.out.println("Доброе утро " + name + "!");
            
        } else if (hour < 18) {
            System.out.println("Добрый день " + name + "!");
            
        } else {
            System.out.println("Добрый вечер " + name + "!");
        }
        



        
    }
}
