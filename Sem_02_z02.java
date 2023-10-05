/*
Задание №2
� Напишите метод, который сжимает строку.
� Пример: вход aaaabbbcdd.
 */
public class Sem_02_z02 {
    public static void main(String[] args) {
        //
        // String txt1 = "aaaabbbcdd";
        String txt1 = "aaaaaaaaabbbbbbcccdvvvvdddffgh";

        StringBuilder txt2 = new StringBuilder();
        StringBuilder txt3 = new StringBuilder();
        
        int count = 1;
        char ch = txt1.charAt(0);
        txt3.append(txt1.charAt(0));

        for (int i = 1; i < txt1.length(); i++) {
            //           
            txt3.append(txt1.charAt(i));
            if (txt1.charAt(i) == ch) {
                count ++;
            } else {
                txt2.append(ch);
                txt2.append(count);
                count = 1;
                ch = txt1.charAt(i);
            }
            if (i == txt1.length() - 1) {
                txt2.append(ch);
                txt2.append(count);
            }
            
        }
        System.out.println(txt3);
        System.out.println(txt2);


    }
}
