/*
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave. 
 * You will be passed a string and you must return that string in an array where an uppercase letter 
 * is a person standing up. 
 * 
 *  1.  The input string will always be lower case but maybe empty.

    2.  If the character in the string is whitespace then pass over it as if it was an empty seat

    Example 
    Word = hello
    wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}

 * 
 */
import java.util.Arrays;

public class MexicanWave {


    public static String[] wave(String str) {

        String[] wave = new String[str.length()];
        
        // return Arrays.stream(str.split(""))
        // .map(c -> new StringBuilder(str).replace(str.indexOf(c), str.indexOf(c) + 1, c.toUpperCase()).toString())
        // .filter(word -> !word.equals(str))
        // .toArray(String[]::new);
        // wave = (String[]) Arrays.stream(wave).map(c -> c = str).toArray(String[]::new);

        for (int i = 0; i < wave.length; i++) {
            
            StringBuilder wavedWord = new StringBuilder(str);

            if(Character.isWhitespace(str.charAt(i))){
                
                continue;
            }
            
            wavedWord.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            wave[i] = wavedWord.toString();
        }

        wave = Arrays.stream(wave).filter(word -> word != null).toArray(String[]::new);
        // Your code here
        return wave;
    }
    public static void main(String[] args) {
        
        String example = "hello world";
        System.out.println(Arrays.toString(wave(example)));
    }
}
