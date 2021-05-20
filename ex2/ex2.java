import java.util.regex.* ; 

public class ex2 {


    public static void main(String[] args) {

String regex = "Apple" ; 
String input = "Apple is a well known company in the industry. Apple produces millions of deveices every year." ; 

Pattern p =  Pattern.compile(regex, Pattern.CASE_INSENSITIVE) ;  

Matcher m = p.matcher(input) ; 

// every match gets replaced by "Samsung". 
    //input = m.replaceAll("Samsung") ; 

// the first match will be replaced with 'Samsung'.
    input = m.replaceFirst("Samsung") ; 

System.out.println(input) ; 


}

}