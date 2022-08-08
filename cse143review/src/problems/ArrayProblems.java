package problems;

/**
 * See the spec on the website for example behavior.
 *
 * REMEMBER THE FOLLOWING RESTRICTIONS:
 * - Do not add any additional imports
 * - Do not create new `int[]` objects for `toString` or `rotateRight`
 */
public class ArrayProblems {

    /**
     * Returns a `String` representation of the input array.
     * Always starts with '[' and ends with ']'; elements are separated by ',' and a space.
     */
    public static String toString(int[] array) {
        int arrayLength = array.length;
        if (arrayLength == 0) {
            return "[]";
        }
        String finalString = "[";
            for (int i = 0; i < arrayLength; i++) {
                String character = "" + array[i];
                finalString = finalString + character + ", ";
            }
            String returnString = finalString.substring(0, (finalString.length() - 2));
            return returnString + "]";
    }

    /**
     * Returns a new array containing the input array's elements in reversed order.
     * Does not modify the input array.
     */
    public static int[] reverse(int[] array) {
        int[] myArray = new int[array.length];
        if (array.length == 1 || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            myArray[array.length - 1 - i] = array[i];
        }
        return myArray;
    }

    /**
     * Rotates the values in the array to the right.
     */
    public static void rotateRight(int[] array) {
        if (array.length != 0) {
            int temp = array[array.length - 1];
            for (int i = array.length - 2; i >= 0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = temp;
        }
    }
}
