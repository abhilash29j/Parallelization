import java.util.Random;

public class App {
    public static void main(String[] args) {
////        int nums[] = {5,-1,0,7,2,3,2,1,0,1,2};
//        int nums[] = {5,4,1};
//      //  MergeSortUsingThread sort = new MergeSortUsingThread(nums);
//       // sort.sort();
//        MergeSortUsingThreadParallel sort = new MergeSortUsingThreadParallel(nums);
//        sort.parallelMergeSort(0,nums.length,2);
//        sort.showArray();
        int numOfThreads = Runtime.getRuntime().availableProcessors();
//        System.out.println(numOfThreads);

        //paralle mergesort
        int[] numbers1 = createArray(10);
        int[] numbers2 = createArray(numbers1.length);
        for (int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i];
        }
   MergeSortUsingThreadParallel parallelSorter = new MergeSortUsingThreadParallel(numbers1);
        long startTime1 = System.currentTimeMillis();
        parallelSorter.parallelMergeSort(0,numbers1.length - 1,numOfThreads);
        long endTime1 = System.currentTimeMillis();
        System.out.printf("Time taken with parallel: %6d ms\n",endTime1 -startTime1);
        System.out.println();
        for (int i : numbers1) {
            System.out.print(i + " ");
        }






    }


    private static int[] createArray(int n) {
        Random random = new Random();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n);
        }
        return a;
    }
}
