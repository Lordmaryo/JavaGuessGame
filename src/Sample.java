import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] arrays = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = sortArray(arrays);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] arrays) {
        ArrayList<Integer> oddIndices = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 != 0) {
                oddIndices.add(i);
                oddNumbers.add(arrays[i]);
            }
        }

        // bubble sort algorithm
        for (int i = 0; i < oddNumbers.size() - 1; i++) {
            for (int j = 0; j < oddNumbers.size() - i - 1; j++) {
                if (oddNumbers.get(j) > oddNumbers.get(j + 1)) {
                    int temp = oddNumbers.get(j);
                    oddNumbers.set(j, oddNumbers.get(j + 1));
                    oddNumbers.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < oddIndices.size(); i++) {
            arrays[oddIndices.get(i)] = oddNumbers.get(i);
        }

        return arrays;
    }
}
