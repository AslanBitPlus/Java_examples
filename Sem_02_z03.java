/*
Задание №3
� Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных
камней’’
� Пример: jewels = “aB”, stones = “aaaAbbbB”
� Результат: ”a3B1”
 */
public class Sem_02_z03 {
    public static void main(String[] args) {
        //
        String jewels = "aB";
        String stones = "aaaAbbbB";
        StringBuilder txt = new StringBuilder();
        char ch = ' ';
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            ch = jewels.charAt(i);
            count = 0;
            for (int j = 0; j < stones.length(); j++) {
                //
                if (stones.charAt(j) == ch) {
                    count ++;
                } 
                                
            }
            if (count != 0) {
                txt.append(ch);
                txt.append(count);
            }
            
        }
        System.out.println(txt);
    }
}
