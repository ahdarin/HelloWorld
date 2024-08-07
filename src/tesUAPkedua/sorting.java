package tesUAPkedua;

import java.util.List;

public class sorting {
  
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

            if (!swapped) break;
        }
    }
}

