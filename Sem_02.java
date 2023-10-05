public class Sem_02 {
    public static void main(String[] args) {
        // Создаем объекты String и StringBuilder
        StringBuilder stb = new StringBuilder("Hello ");
        String name = "Join";

        // Добавляем имя к StringBuilder
        stb.append("my dear ");

        // Преобразование StringBuilder в String
        String txt1 = stb.toString();
        // System.out.println(stb + name);
        System.out.println(txt1 + name);
    }
}
