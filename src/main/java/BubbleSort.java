import java.util.Arrays;

public class BubbleSort {
 
    public void sort(int[] numbers) {
        boolean swapped;
        int n = numbers.length;
        do {
            swapped = false;
            int lastSorted = n;
            for (int i = 1; i < n; ++i) {
                if (numbers[i-1] > numbers[i]) {
                    swap(numbers, i-1, i);
                    swapped = true;
                   lastSorted = i;
                }
            }
            n = lastSorted;
        } while (swapped);
    }
 
    private void swap(int[] values, int first, int second) {
        int tmp = values[first];
        values[first] = values[second];
        values[second] = tmp;
    }
    
    public static void main(String[] args) {

        int[] numbers={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
      //  int[] n=numbers.length;
        BubbleSort s = new BubbleSort();
        s.sort(numbers);
        System.out.println("Sorted array" +Arrays.toString(numbers));



}}