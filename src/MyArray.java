public class MyArray {
    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    // To find the index of the target in the array. If the target
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
// Output: 3
    public int iterativeLinearSearch(int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // To find the index of the target in the array. If the target
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
// Output: -1
    public int recursiveLinearSearch(int target) {
        return recursiveLinearSearch(target, array.length - 1);
    }

    public int recursiveLinearSearch(int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (target == array[index]) {
            return index;
        }
        return recursiveLinearSearch(target, index - 1);
    }

}
