package tesUAPkedua;

import java.util.ArrayList;
import java.util.List;

public class sorting {
    // Class to hold input-output pairs
    public static class InputOutputPair {
        String input;
        int output;

        public InputOutputPair(String input, int output) {
            this.input = input;
            this.output = output;
        }
    }

    // Function to sort input-output pairs by output
    public static void bubbleSort(List<InputOutputPair> pairs) {
        int n = pairs.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (pairs.get(j).output > pairs.get(j + 1).output) {
                    // Swap pairs[j] and pairs[j + 1]
                    InputOutputPair temp = pairs.get(j);
                    pairs.set(j, pairs.get(j + 1));
                    pairs.set(j + 1, temp);
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

/*    public static void main(String[] args) {
        List<InputOutputPair> pairs = new ArrayList<>();

        // Example data
        pairs.add(new InputOutputPair("5 1 2 + 4 * + 3 -", 14));
        pairs.add(new InputOutputPair("3 4 + 2 * 7 /", 2));
        pairs.add(new InputOutputPair("5 6 2 + *", 40));
        pairs.add(new InputOutputPair("8 5 * 7 +", 47));

        // Sort the pairs by output
        bubbleSort(pairs);

        // Print sorted pairs
        for (InputOutputPair pair : pairs) {
            System.out.println("Input: " + pair.input + ", Output: " + pair.output);
        }
    } */
}

