/*
Задание №4
� Во фразе "Добро пожаловать на курс по Java" переставить
слова в обратном порядке.
 */

import javax.swing.JToolBar.Separator;

public class seminar_01_z04 {
    public static void main(String[] args) {

        String txt = "Добро пожаловать на курс по Java";
        String array[] = txt.split(" ");

        System.out.println(array.length);

        String txt1 = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            txt1 = txt1 + " " + array[i];
           
        }
        System.out.println(txt1);

    }
}
