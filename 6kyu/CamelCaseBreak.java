import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseBreak {

    public static String camelCase(String input) {

        System.out.println(Arrays.toString(input.split("(?=[A-Z])")));


        return Arrays.stream(input.split("(?=[A-Z])"))
        .collect(Collectors.joining(" "));

        // return null;
    }

    public static void main(String[] args) {
        
        String test = "camelCaseBreaking";

       System.out.println(camelCase(test));
    }
}
