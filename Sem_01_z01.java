import java.util.Scanner;

/*
Задание №1
Написать программу, которая запросит пользователя ввести <Имя> в
консоли.
Получит введенную строку и выведет в консоль сообщение “Привет,
<Имя>!”
 */

public class Sem_01_z01 {
    public static void main(String[] args) {
    
        System.out.println("Введите ваше имя :");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Привет " + name);
}

}