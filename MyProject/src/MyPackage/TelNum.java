package MyPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TelNum {

    public static void main(String[] args) {
        extractNum("17788889999-010-9988776-19822883322-0398-8976564-16722882288-0922-78906543-15490876845-010-99821123");
    }
    public static void extractNum(String material){
        String pattern = "1[3579]\\d{9}|\\d{3,4}-[1-9]\\d{6}";
        Matcher matcher = Pattern.compile(pattern).matcher(material);
        int i = 0;
        while (matcher.find()){
            i++;
            System.out.println(i + ". " + matcher.group());
        }
    }
}
