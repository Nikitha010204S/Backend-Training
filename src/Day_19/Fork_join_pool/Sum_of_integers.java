//Write a program to calculate the sum of integers from 1 to 1,000,000 using the Fork/Join Pool.
//Create a class SumTask that extends RecursiveTask<Long>.
//Split the range of numbers into smaller tasks using the ForkJoinPool.
//Combine the results from subtasks to get the total sum.

package Day_19.Fork_join_pool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Sum_of_integers {
    public static int Threshold_value;

    public static void main(String[] args) {
       final int Threshold_value=1000;
       ForkJoinPool forkJoinPool=new ForkJoinPool();
       SumTask st=new SumTask(1,1_000_000);
       long result=forkJoinPool.invoke(st);
       System.out.println(result);

    }
}
class SumTask extends RecursiveTask<Long> {

    private final int start;
    private final int end;
    public SumTask(int start, int end) {
        this.start=start;
        this.end=end;
    }

    @Override
    protected Long compute() {
        if((end-start)<=Sum_of_integers.Threshold_value)
        {
            return Calculate();
        }
        else {
            int middle=(start+end)/2;
            SumTask left=new SumTask(start,middle);
            SumTask right=new SumTask(middle+1,end);
            left.fork();
            right.fork();
            long right_res=right.compute();
            long left_res=left.join();
            return left_res+right_res;
        }
    }

    private Long Calculate() {
        long sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=i;
        }
        return sum;
    }
}

