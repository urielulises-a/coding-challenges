/*There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55 
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindUniqueNumber {

    public static double findUniq(double arr[]){

        // Arrays.sort(arr);

        // ArrayList<Double> stored = new ArrayList<>();

        // double placeholder = 0.00000001;
        // for(int i = 0; i < arr.length; i++){
        //     double numberToSearch = arr[i];

        //     arr[i] = placeholder;

        //     int index = Arrays.binarySearch(arr, numberToSearch);

        //     if (!(index >= 0)) {

        //         if(!stored.contains(numberToSearch)) return numberToSearch;
                
        //     }
        //     else{
        //         if(!stored.contains(numberToSearch)) stored.add(numberToSearch);
        //         System.out.println(stored);

        //     }
        // }
        // return arr[0];

        HashSet<Double> seen = new HashSet<>();
        HashSet<Double> duplicates = new HashSet<>();

        for (double num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        for (double num : arr) {
            if (!duplicates.contains(num)) {
                return num;
            }
        }

        return Double.NaN; // Return NaN if no unique element is found
    }
    public static void main(String[] args) {

        double[] arr = {1, 2, 2, 3, 1, 1};

        System.out.println(findUniq(arr));
    }
}
