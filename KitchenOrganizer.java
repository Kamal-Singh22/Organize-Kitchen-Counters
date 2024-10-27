import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KitchenOrganizer {

    public static void main(String[] args) {
        int[] plates = {1, 0, 0, 2, 3, 0, 4, 5};
        int[] result = organizeKitchen(plates);
        
        System.out.println("Organized Counters: " + Arrays.toString(result));
        System.out.println("Empty Counter Count: " + emptyCounterCount(result));
        System.out.println("Counter with Plates Count: " + plateCounterCount(result));
    }

    public static int[] organizeKitchen(int[] plates) {
        List<Integer> platesOnly = new ArrayList<>();
        int emptyCount = 0;

        // Separate plates and count empty counters
        for (int plate : plates) {
            if (plate != 0) {
                platesOnly.add(plate);
            } else {
                emptyCount++;
            }
        }

        // Convert the list to an array and append zeros
        int[] organizedPlates = new int[plates.length];
        for (int i = 0; i < platesOnly.size(); i++) {
            organizedPlates[i] = platesOnly.get(i);
        }

        // Empty counters (0s) are already at the end due to default int array initialization
        return organizedPlates;
    }

    public static int emptyCounterCount(int[] plates) {
        int count = 0;
        for (int plate : plates) {
            if (plate == 0) {
                count++;
            }
        }
        return count;
    }

    public static int plateCounterCount(int[] plates) {
        int count = 0;
        for (int plate : plates) {
            if (plate != 0) {
                count++;
            }
        }
        return count;
    }
}
