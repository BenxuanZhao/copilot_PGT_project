package ArrayOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shuffle {
    /* Here is the explanation for the code above:
1. We need to keep the original array intact, so when we reset, it must have all the original values.
2. For shuffle, we can pick any number from the array and put it in the first position, then pick from the remaining (n-1) positions and so on. This is equivalent to picking the first position from n positions, then the second position from n-1 positions and so on.
3. We can achieve this by picking a random number from the remaining numbers and swap it with the number in the first position, then pick a random number from the remaining (n-1) positions and swap it with the number in the second position and so on.
4. To achieve this, we need the list of remaining numbers, so we create a list and add all the values from the array to the list. We can use the array itself as the list, but we need to remove the numbers that we have already picked. Removing from an array is an expensive process, so we use a list.
5. We pick a random number from the remaining numbers using rand.nextInt(aux.size()). This returns a number between 0 and aux.size()-1.
6. Once we pick a number, we swap it with the number in the current position (i) in the array. This is because we need to make sure that the number is not picked again.
7. We remove the picked number from the list, so that it is not picked again.
8. We repeat this process until there are no remaining numbers.
9. The runtime complexity is O(n) because we pick n numbers from the array and each pick takes O(1) time. The space complexity is O(n) because we use a list to store the remaining numbers. */
    private int[] array;
    private int[] original;

    private Random rand = new Random();

    private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }

    public Shuffle(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }

    public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < array.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            array[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return array;
    }
}
