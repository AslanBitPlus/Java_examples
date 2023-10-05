/*
Задание №1
� Дано четное число N (>0) и символы c1 и c2.
� Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class Sem_02_z01 {
    public static void main(String[] args) {
        //
        StringBuilder txt1 = new StringBuilder();
        char c1 = 'a';
        char c2 = 'b';
        int num = 12;

        for (int i = 0; i < num / 2; i++) {
            txt1.append(c1);
            txt1.append(c2);            
        }

        System.out.println(txt1);




    }
}
