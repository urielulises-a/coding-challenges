/*
 Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.

        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));

 */

import java.util.Arrays;

public class HighestScoringWord {

    public static String high(String s) {

        // String[] parts = s.split(" ");

        return Arrays.stream(s.split(" "))
                .max((a,b) -> Integer.compare(
                    a.chars().map(c -> c - 96).sum(), 
                    b.chars().map(c -> c - 96).sum()))
                    .get()
               ;
    
        // int compare = 0;
        // String highestWord = "";

        // for (String part : parts) {

        //     int temp = part.chars().map(c -> c - 96).sum();
            
        //     if(compare < temp){

        //         compare = temp;
        //         highestWord = part;
        //     } 
        // }
        
        // System.out.println(Arrays.toString(parts));

        // return highestWord;
    }
    
    public static void main(String[] args) {
        
        String example = "man i need a taxi up to ubud";
        String foo = "b aa";

        System.out.println(high(example));
    }
}
