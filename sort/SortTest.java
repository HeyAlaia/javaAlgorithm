import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 4;
        nums[3] = 2;
        nums[4] = 6;
        System.out.println("sorted array");
        System.out.println("array = " + Arrays.toString(nums));
        Long start = System.nanoTime();
        SelectionSort.selectionSortTool(nums);
//        insertionSort.insertionSortTool(nums);
        Long end = System.nanoTime();
        long time = end - start;
        System.out.println("sorted array end, time； " + time);
        System.out.println("array end= " + Arrays.toString(nums));

    }
}
