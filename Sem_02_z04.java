/*
Задание №4
� Вам дается строка S и целочисленный массив индексов int
index[s.length]. Напишите программу, которая перетасует
символы в S таким образом, что символ c i-й позиции
переместится на индекс index[i] в результирующей строке.
� Пример: s = “cba”, index = [3,2,1]
� Результат “abc”
 */
public class Sem_02_z04 {
    public static void main(String[] args) {
        //
        String s = "cba";
        int[] array = {3, 2, 1};
        StringBuilder txt = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            //
            txt.append(s.charAt(array[i] - 1));
            
        }

        System.out.println(s);
        System.out.println(txt);

    }
}
