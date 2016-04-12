/**
 * CS2852
 * Spring 2016
 * Week 3
 */
package lecture09;

public class BinarySearch {

    public static void main(String[] args) {
        int[] haystack = {0, 3, 5, 7, 8, 10, 11, 18, 22, 39, 44, 78, 79, 101, 121, 199};
        int needle = 11;

        System.out.println(binarySearchRecursive(haystack, needle));
    }
    // this helper method sets up the necessary parameters
    private static int binarySearchRecursive(int[] haystack, int needle) {
        return binarySearch(haystack, needle, 0, haystack.length - 1);
    }


    private static int binarySearch(int[] haystack, int needle, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (haystack[mid] == needle) {
            return 0; //TODO
        } else if (haystack[mid] < needle) {
            return 0; //TODO
        } else  {
            return 0; //TODO
        }

    }
}