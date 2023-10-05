/*
1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого
запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

public class Sem_02dz_01 {
    public static void main(String[] args) {
        //
        StringBuilder sql = new StringBuilder();
        StringBuilder prm = new StringBuilder();
        sql.append("select * from students where ");
        String tmp = "";
        
        String[] array = {"name:Ivanov", "country:Russia", "city:Moscow"};
        //
       

        for (int i = 0; i < array.length; i++) {
            //
            tmp = array[i];
            for (int j = 0; j < tmp.length(); j++) {
                //
                if (tmp.charAt(j) == ':') {
                    prm.append('=');
                } else {
                    prm.append(tmp.charAt(j));
                }
                
            }
            if (i != array.length - 1) {
                //
                prm.append(" AND ");
            }


            
        }
        sql.append(prm);
        System.out.println(sql);


    }
    
}
