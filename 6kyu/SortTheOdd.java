/*
 * You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
 * Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
import java.util.Arrays;


public class SortTheOdd {
    public static int[] sortArray(int[] array) {
    
      int[] result = Arrays.copyOf(array, array.length);
      Arrays.sort(array);
      int[] oddArray = Arrays.stream(array).filter(data -> data % 2 != 0).toArray();

      int oddIndex = 0;
      for(int i = 0; i < array.length; i++){

        if (result[i] % 2 != 0){
          result[i] = oddArray[oddIndex];
          oddIndex++;
        }
      }

      return result;
    }

    public static void main(String[] args) {
      
      int[] example = {5, 8, 6, 3, 4};

      // System.out.println(Arrays.toString(example));
      System.out.println(Arrays.toString(sortArray(example)));
    }
  }