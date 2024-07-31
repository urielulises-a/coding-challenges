/*
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
 */

public class PersistentBugger {

    public static int persistence(long n) {

        // if (!(n > 9)) return 0;

        // int persistenceNumber = 0;

        // while (n > 9) {
            
        //     String numberStr = Long.toString(n);
        //     int[] digitsArray = new int[numberStr.length()];

        //     for (int i = 0; i < numberStr.length(); i++) {
        //         digitsArray[i] = numberStr.charAt(i) - '0';
        //     }

        //     int number = 1;

        //     for (int j = 0; j < numberStr.length(); j++){
        //         number*= digitsArray[j];
        //     }

        //     n = number;
        //     persistenceNumber++;
        // }   

        // return persistenceNumber;

        int times = 0;
        while (n >= 10) {
            // Convert the number to a string, then to a stream of characters
            // Map each character to its corresponding digit
            // Reduce the stream by multiplying all the digits together
            n = Long.toString(n)
                     .chars()
                     .map(i -> i - '0')
                     .reduce(1, (r, i) -> r * i);
            times++;
        }
        return times;
	}
    public static void main(String[] args) {
        
        int example = 4;

        System.out.println(persistence(example));
    }
}
