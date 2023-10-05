import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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

        // Обработка исключений при записи в айл
        try {
            // Создаем объект File для файла, в который будем записывать приветствие
            File sem_02 = new File("Sem_02.txt");

            // Создаем FileWriter для записи данных в файл
            FileWriter fwrt = new FileWriter(sem_02);

            // Записываем в файл
            fwrt.write(txt1 + name);

            // Закрываем файл
            fwrt.close();

            // Логирование успешной записи
            Logger lgr = Logger.getLogger("MyLogger");
            FileHandler fhndlr = new FileHandler("mylog.log");
            lgr.addHandler(fhndlr);
            SimpleFormatter frmt = new SimpleFormatter();
            fhndlr.setFormatter(frmt);
            lgr.info("Сообщение успешно записано в файл");

        } catch (Exception e) {
            // Логирование исключения
            Logger lgr = Logger.getLogger("MyLogger");
            FileHandler fhndlr = null;
            try {
                fhndlr = new FileHandler("mylog.log"); 
                lgr.addHandler(fhndlr);
                SimpleFormatter frmt = new SimpleFormatter();
                fhndlr.setFormatter(frmt);
                lgr.severe("Ошибка при записи в файл: " + e.getMessage());

            } catch (Exception ex) {
                // TODO: handle exception
                ex.printStackTrace();
            } finally {
                // 
                if (fhndlr != null) fhndlr.close();
            }
        
        
        }
        //



    }
}
