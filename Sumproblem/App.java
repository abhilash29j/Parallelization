package Sumproblem;

public class App {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,12,1,4,7,12,3,12123,13,4,6,2,4,7,3,2,12,44,5,6787,54,44};
//        SequentialSum sequentialSum = new SequentialSum();
//        System.out.println(sequentialSum.sum(nums));

        int n = Runtime.getRuntime().availableProcessors(); ///upto serveral million items sequential is fast for billions of items parallel will be twice as efficient
        ParallelSum parallelSum = new ParallelSum(n);
        System.out.println(parallelSum.sum(nums));
    }
}
