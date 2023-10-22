import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class phBook {
    // Метод, который добавляет номера в книгу
    public static void main(String[] args) {
        var dict = new HashMap<String, String>();
        dict.put("12345678901", "Иван Иванов");
        dict.put("12345678902", "Иван Петров");
        dict.put("12345678903", "Иван Иванов");
        dict.put("12345678904", "Александр Щербаков");
        dict.put("12345678905", "Сергей Сидоров");
        dict.put("12345678906", "Сергей Никифоров");
        dict.put("12345678907", "Александр Кузнецов");
        dict.put("12345678908", "Иван Петров");
        dict.put("12345678909", "Иван Иванов");
        dict.put("12345678900", "Иван Петров");

        var a = get(dict);

        a.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }


    public static HashMap<String, Integer> get(HashMap<String, String> dict){
        var result = new HashMap<String, Integer>();
        for (var item : dict.entrySet()) {
            if (result.containsKey(item.getValue())) {
                var key = item.getValue();
                var value = result.get(item.getValue());
                result.replace(key, value + 1);
            } else {
                result.put(item.getValue(), 1);
            }
        }
        return result;
    }
}
    