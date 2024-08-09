/*
 * The rgb function is incomplete. Complete it so that passing in 
 * RGB decimal values will result in a hexadecimal representation 
 * being returned. Valid decimal values for RGB are 0 - 255. 
 * Any values that fall out of that range must be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"

 */

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

public class RGBtoHex {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
    }

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }
    // public static String rgb(int r, int g, int b) {

    //     List <Integer> rgb = Arrays.asList(r,g,b);
    //     Map<Integer, String> map = new HashMap<>();

    //     for (int i = 0; i < 10; i++) {
    //         map.put(i, String.valueOf(i));
    //     }
    //     map.put(10, "A");
    //     map.put(11, "B");
    //     map.put(12, "C");
    //     map.put(13, "D");
    //     map.put(14, "E");
    //     map.put(15, "F");

    //     String result = "";

    //     for (Integer decimalToHex : rgb) {
            
    //         if (decimalToHex < 0){
    //             decimalToHex = 0;
    //         }
    //         else if(decimalToHex > 255){
    //             decimalToHex = 255;
    //         }

    //         result+= map.get(decimalToHex / 16);
    //         result+= map.get(decimalToHex % 16);
    //     }
        
    //     return result;
    // }    
    
    public static void main(String[] args) {
        
        int r = -20;
        int g = 275;
        int b = 125;

        System.out.println(rgb(r, g, b));
    }
}
