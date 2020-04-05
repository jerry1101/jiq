

public class StringUtil {

    public static String reverse(String input){
        if (input == null)
        {return null;}
        if (input.isEmpty())
        {return "";}
        System.out.println( new StringBuilder(input).reverse().toString());

        return new StringBuilder(input).reverse().toString();
    }
}
