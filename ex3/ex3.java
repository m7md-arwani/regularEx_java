import java.util.regex.* ; 

public class ex3 {

    public static void main(String[] args) {

        String regex = "Apple" ; 
        String input = "Apple is a greate company in the industry. Apple revolutionized technology world." ; 

        Pattern p = Pattern.compile(regex) ; 
        Matcher m = p.matcher(input) ; 

        StringBuffer sb = new StringBuffer() ; 

        while (m.find()) {
         m.appendReplacement(sb, "Samsung") ; 

        }
        m.appendTail(sb) ; 

        System.out.println(sb.toString()) ; 
    }
}