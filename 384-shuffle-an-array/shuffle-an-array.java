import java.util.Random;

class Solution {

    private int[] original;
    private int[] array;
    private Random rand;

    public Solution(int[] nums) {
        original = nums.clone();   // store original
        array = nums.clone();      // working copy
        rand = new Random();
    }

    // Reset to original configuration
    public int[] reset() {
        array = original.clone();
        return array;
    }

    // Fisher-Yates shuffle
    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            int j = i + rand.nextInt(array.length - i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
