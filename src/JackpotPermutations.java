import java.util.*;

public class JackpotPermutations {
    public static void main(String[] args) {
        int[] games = {1, 2, 3, 4, 5, 6, 7, 8}; // Array of 8 games

        // Generate all permutations using the nextPermutation function
        List<int[]> permutations = new ArrayList<>();
        do {
            int[] copy = Arrays.copyOf(games, games.length);
            permutations.add(copy);
        } while (nextPermutation(games));

        // Print all permutations
        for (int[] perm : permutations) {
            System.out.println(Arrays.toString(perm));
        }
    }

    // Function to generate the next lexicographic permutation of an array
    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        return true;
    }

    // Function to swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse a portion of an array
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}
