import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
        List<String> list = List.of("apple", "banana", "kiwi");
        String longestWord = findLongestWord(list);
        System.out.println(longestWord);

        Map<String, Integer> mapOfWords = new HashMap<>();
        mapOfWords.put("why",7);
        mapOfWords.put("hello",8);
        mapOfWords.put("brilliant",99);
        mapOfWords.put("world",15);
        mapOfWords.put("amazing",17);

        int longWordsCount = countLongWords(mapOfWords);
        System.out.println(longWordsCount);

        float[] arr = {1.5f, 3.5f, 2.0f, 3.0f};
        System.out.println(findAverage(arr));

        Map<String, Integer> map = new HashMap<>();
        map.put("a",7);
        map.put("x",4);
        map.put("z",5);
        map.put("y",13); 
    
        System.out.println(countOddNumbers(map));

        int[] numsArr = {3, 6, 9, 12, 15};
        System.out.println(allDivisibleBy3(numsArr));

        List<String> startsWithA = List.of("apple", "apricot", "tomato", "avocado");
        System.out.println(allStartWithA(startsWithA));
    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     * Solution with resources
     */
    public static String findLongestWord(List<String> list) {
    String longestWord = "";
    for (String word : list) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
            }
        } 
    return longestWord;
    }

    //Solution without resources
    //I realized that I was attempting to solve for the longest word length without return the word itself
    //     String maxLength = 0;
    //     for (int i = 0; i < list.size(); i++) {
    //         String currLength = list.get(i).length();
    //         if (currLength > maxLength) {
    //             maxLength = currLength;
    //         }
    //     }
    //     return maxLength;
    // }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> mapOfWords) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : mapOfWords.entrySet()) {
            String key = entry.getKey();
            if (mapOfWords.isEmpty() || mapOfWords == null) {
                return 0;
            }
            if (key.length() > 5) {
                count++;
            } 
        }
        return count;
    }

/*
// I forgot how to add values to a new HashMap and the syntax for looping through one. Also the array was not necessary. 
//     arr[] numsArr = new arr[5];
//     for(Map.Entry<String, Inger> entry = new Entry.Set()) {
//         if (entry.getValue > 5) {
//             return 0;
//         } 
//     }
//     return -1;
// }
*/

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        float sum = 0.0f;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
        }
     double average = sum / arr.length;
     return average;
    }

/* I forgot the float notation and how to convert a float to a double data type.
//      
//     float sum = 0.0;
//     for (int i = 0; i < arr.length; i++) {
//         if (i > sum) {
//             sum += i;
//         }
//     }
//     double average = sum / arr.length;
//     return average;
// }
*/

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }
/* I am trying to recall the syntax for getting values from a HashMap.
//     int count = 0; 
//     for (Map.Entry<String, Integer> entry : entrySet()) {
//     Integer value = getValue();
//         if (value % 2 != 0) {
//  		count++; 	
//         }
//     }
//     
//     return count;
// }
*/

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                return false;
            }
        }
        return true;
    }
    
    /*
    // Not sure how to stop the loop from returning true before the iteration of the loop is completed.  
    //    for (int i = 0; i < arr.length; i++) {
    //        if (arr[i] % 3 == 0) {
    //            return true;
    //        }
    //    }
    //    return false;
    }    
     * 
    */

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).startsWith("a")) {
               return false;
            }
        }
        return true;
    }

    /*
    //  I am puzzled on how to negate the .startsWith() built in method 
    //        for (int i = 0; i < list.size(); i++) {
    //        char containsChar = list.get(i).startWith('a');
    //        if (!containsChar) {
    //           return false;  
    //        }
    //    }
    //    return false;
    }
    */

    // /**
    //  * OPTIONAL MORE CHALLENGING PROBLEM
    //  * NOT REQUIRED
    //  *
    //  * Determines if the array can be split into two contiguous subarrays with equal sums.
    //  * The method checks if there exists an index where the sum of elements to the left of the index
    //  * is equal to the sum of elements to the right. Both subarrays must be contiguous.
    //  *
    //  * @param arr an array of integers to evaluate
    //  * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
    //  *
    //  * Example:
    //  * Input: [1, 3, 8, 2, 1, 2, 7]
    //  * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
    //  *
    //  * Input: [1, 2, 3, 4, 5]
    //  * Output: false (no contiguous split results in equal sums)
    //  */
    // public static boolean canPartitionWithEqualSums(int[] arr) {
    //     return false;
    // }

}