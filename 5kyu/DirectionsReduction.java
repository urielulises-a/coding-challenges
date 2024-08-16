import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
   
        List<String> stringList = new ArrayList<>(Arrays.asList(arr));

        Map<String, Integer> directionsMap = Map.of(
            "NORTH", 1,
            "SOUTH", -1,
            "EAST", 2,
            "WEST", -2
        );
    
        int i = 0;

        while (i < stringList.size() - 1) {
            
            String current = stringList.get(i);
            String next = stringList.get(i+1);

            if (directionsMap.get(current) + directionsMap.getOrDefault(next, 0) == 0) {

                    stringList.remove(i);
                    stringList.remove(i);
                    i = 0;
            }else{
                i++;
            }
                    
        }
        // Your code here.
        return stringList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        
        String[] arr = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};

        System.out.println(Arrays.toString(dirReduc(arr)));
    }
}
