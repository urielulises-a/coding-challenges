/*In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listFiltering {
  
    public static List<Object> filterList(final List<Object> list) {
      // Return the List with the Strings filtered out
      
    //   List <Object> filteredList = new ArrayList<>();
    //   for (Object object : list) {
        
    //     if (object instanceof Number) {
    //         filteredList.add(object);
    //     }
    //   }
    //   return filteredList;

        return list.stream().filter(obj -> obj instanceof Number).collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        
        List<Object> example = new ArrayList<>();
    
        example.add("String1");
        example.add(2);
        example.add("String2");
        example.add(3.0);

        System.out.println(filterList(example));
    }
}
  