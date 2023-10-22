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


/*
class Answer {  
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
      StringBuilder res = new StringBuilder();
      StringBuilder par = new StringBuilder();
      String tmp = "";
      String tmp1 = "";
      char ch = ' ';
      par.append(QUERY);
      String[] arr1 = PARAMS.split(",");
      for (int i=0; i<arr1.length; i++) {
        res.delete(0, res.length());
        tmp = arr1[i];
        ch = ' ';
        // System.out.println(arr1[i]);
        for (int j=0; j < tmp.length(); j++) {
          ch = tmp.charAt(j);
          if ((ch != '{') & (ch != '}') & (ch != '"') & (ch != ' ')) {
            if (ch == ':') {
              ch = ',';
            }
            res.append(ch);   
          }

        }
        arr1[i] = res.toString();
        // System.out.println(arr1[i]);
        if (i != arr1.length - 1) {
          tmp1 = tmp1 + arr1[i] + ",";
        }else {
          tmp1 = tmp1 + arr1[i];
        }
          
        
        
      }
      // System.out.println(tmp1);
      arr1 = tmp1.split(",");
      
      for (int i=0; i<arr1.length/2 + 1; i+=2) {
        if (arr1[i+1] != "null") {
          if (i != 0) {
            par.append(" and ");
          }
          par.append(arr1[i]);
          par.append("=");
          par.append("'");
          par.append(arr1[i+1]);
          par.append("'");
          
        }
      }
      
     
      return par;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	}
}
 */