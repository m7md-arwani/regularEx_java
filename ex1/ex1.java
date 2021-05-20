import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {

public static void main(String[] args) {

    String regex = "engineering" ; // desires pattern 
    String input  = "engineering is good, engineering is grate, study engineering" ; 

    Pattern p = Pattern.compile(regex); // want to find one of a,b,c
    Matcher m = p.matcher(input); // the text to search within
    

    // find method will search in the whole text char by char. 
// it is useful to know the indcies of where the pattern starts and ends. 
int count = 0  ; 
while (m.find()) {
    count++ ;
System.out.println("Starts at "+m.start()) ; 
System.out.println("Ends at " +m.end()) ; 
System.out.println("") ;
 
}

System.out.println("Number of matches " +count) ; 

    
}

}